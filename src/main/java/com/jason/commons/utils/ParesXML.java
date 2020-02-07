package com.jason.commons.utils;

import com.jason.commons.beans.db.DataBase;
import com.jason.commons.beans.db.DataBaseConfiguration;
import com.jason.commons.exception.NewInstanceException;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.DBFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * XML解析工具
 *
 * @author ChenHol.Wong
 * @create 2019/12/12 - 22:27
 */
public class ParesXML {
    public static final String DY_PACKAGE = "com.jason.designpattern.create.factory.factoryMethod.dy.";
    public static final String TV_PACKAGE = "com.jason.designpattern.create.factory.factoryMethod.tv.";
    public static final String IMAGE_PACKAGE = "com.jason.designpattern.create.factory.factoryMethod.image.";
    public static final String ABDY_PACKAGE = "com.jason.designpattern.create.factory.abstractFactory.dy.classes.";
    public static final String DB_PACKAGE = "com.jason.designpattern.create.factory.abstractFactory.database.classes.";
    public static final String BU_KFC_PACKAGE = "com.jason.designpattern.create.builder.kfc.";
    public static final String BU_COMPUTER_PACKAGE = "com.jason.designpattern.create.builder.computer.";
    public static final String POWER_PACKAGE = "com.jason.designpattern.structural.adapter.power.";
    public static final String ENCRYPT_PACKAGE = "com.jason.designpattern.structural.adapter.encrypt.";
    public static final String COLOR_PACKAGE = "com.jason.designpattern.structural.bridge.picture.color.";
    public static final String SHAPE_PACKAGE = "com.jason.designpattern.structural.bridge.picture.shape.";
    public static final String VIDEO_PACKAGE = "com.jason.designpattern.structural.bridge.video.";

    /**
     * 创建对象
     *
     * @param path 类的全路径
     * @param file xml文件的路径
     * @return 所需对象
     * @throws NewInstanceException 实例化失败异常
     */
    public static Object getBean(String path, File file) throws NewInstanceException {
        Object newInstance;
        String className = "未知";
        try {
            DocumentBuilder builder = getDocumentBuilder();
            Document document = builder.parse(file);
            Node node = getNode(document, "className");
            className = node.getNodeValue();

            Class<?> clazz = Class.forName(path + className);
            newInstance = clazz.newInstance();
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return newInstance;
    }

    /**
     * 创建对象
     *
     * @param parentNode 父节点
     * @param path       类的全路径
     * @param file       xml文件的路径
     * @return 所需对象
     * @throws NewInstanceException 实例化失败异常
     */
    public static Object getBean(String parentNode, String path, File file) throws NewInstanceException {
        Object newInstance;
        String className = "未知";
        try {
//            DocumentBuilder builder = getDocumentBuilder();
//            Document document = builder.parse(file);
//            NodeList nodeList = document.getElementsByTagName(parentNode);
            NodeList nodeList = getNodeList(file, parentNode);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                className = element.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
            }
            Class<?> clazz = Class.forName(path + className);
            newInstance = clazz.newInstance();
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return newInstance;
    }

    /**
     * 获取所有bean对象
     *
     * @param parentNode 父节点名称
     * @param path       类包名全路径
     * @param file       配置文件路径
     * @return beans
     * @throws NewInstanceException 实例化异常
     */
    public static List<Object> getBeans(String parentNode, String path, File file) throws NewInstanceException {
        ArrayList<Object> objects = new ArrayList<>();
        Object newInstance;
        String className = "未知";
        NodeList nodeList;
        try {
            nodeList = getNodeList(file, parentNode);
        } catch (Exception e) {
            throw new NewInstanceException("文件解析失败", e);
        }
        int length = nodeList.getLength();
        if (length == 0) {
            throw new NewInstanceException("未找到 " + parentNode + " 此节点");
        }
        try {
            for (int i = 0; i < length; i++) {
                Element element = (Element) nodeList.item(i);
                className = element.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
                Class<?> clazz = Class.forName(path + className);
                newInstance = clazz.newInstance();
                objects.add(newInstance);
            }
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return objects;
    }

    /**
     * 获取父节点是bridge的子节点元素，初步用于桥接模式中，子节点只有两个：abstraction和implementor
     *
     * @param implPckage      桥接模式中接口所在的包
     * @param abstractPackage 桥接模式中抽象类所在的包
     * @param file            要解析的文件路径
     * @return 返回map中key=abstraction是抽象类，key=implementor是接口
     * @throws NewInstanceException 反射异常
     */
    public static Map<String, Object> getPictureInfo(String implPckage, String abstractPackage, File file) throws NewInstanceException {
        HashMap<String, Object> map = new HashMap<>();
        String parentNode = "birdge";
        NodeList nodeList;
        try {
            nodeList = getNodeList(file, parentNode);
        } catch (Exception e) {
            throw new NewInstanceException("文件解析失败", e);
        }
        int length = nodeList.getLength();
        if (length == 0) {
            throw new NewInstanceException("未找到 " + parentNode + " 此节点");
        }
        try {
            for (int i = 0; i < length; i++) {
                Element element = (Element) nodeList.item(i);
                reflectShape(map, element, implPckage, abstractPackage);
            }
        } catch (Exception e) {
            throw new NewInstanceException("图形中类解析失败", e);
        }
        return map;
    }

    private static void reflectShape(HashMap<String, Object> map, Element element, String implPckage, String abstractPackage) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String abstraction = element.getElementsByTagName("abstraction").item(0).getFirstChild().getNodeValue();
        String implementor = element.getElementsByTagName("implementor").item(0).getFirstChild().getNodeValue();
        Class<?> colorClazz = Class.forName(implPckage + implementor);
        Class<?> shapeClazz = Class.forName(abstractPackage + abstraction);
        map.put("implementor", colorClazz.newInstance());
        map.put("abstraction", shapeClazz.newInstance());
    }

    /**
     * 获取所有数据库配置
     *
     * @param file 配置文件路径
     * @return 数据库对象
     * @throws NewInstanceException 实例化异常
     */
    public static List<DataBaseConfiguration> getDBInfo(File file) throws NewInstanceException {
        ArrayList<DataBaseConfiguration> objects = new ArrayList<>();
        String className = "未知";
        String parentNode = "dataBase";
        NodeList nodeList;
        try {
            nodeList = getNodeList(file, parentNode);
        } catch (Exception e) {
            throw new NewInstanceException("文件解析失败", e);
        }
        int length = nodeList.getLength();
        if (length == 0) {
            throw new NewInstanceException("未找到 " + parentNode + " 此节点");
        }
        try {
            for (int i = 0; i < length; i++) {
                DataBaseConfiguration configuration = new DataBaseConfiguration();
                Element element = (Element) nodeList.item(i);
                className = element.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
                Class<?> clazz = Class.forName(DB_PACKAGE + className);

                String dataBaseName = element.getElementsByTagName("dataBaseName").item(0).getFirstChild().getNodeValue();
                String ip = element.getElementsByTagName("ip").item(0).getFirstChild().getNodeValue();
                String port = element.getElementsByTagName("port").item(0).getFirstChild().getNodeValue();
                String username = element.getElementsByTagName("username").item(0).getFirstChild().getNodeValue();
                String password = element.getElementsByTagName("password").item(0).getFirstChild().getNodeValue();

                DataBase dataBase = new DataBase();
                dataBase.setDataBaseName(dataBaseName);
                dataBase.setIp(ip);
                dataBase.setPort(port);
                dataBase.setUserName(username);
                dataBase.setPassword(password);

                configuration.setDbFactory((DBFactory) clazz.newInstance());
                configuration.setDataBase(dataBase);

                objects.add(configuration);
            }
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return objects;
    }

    private static NodeList getNodeList(File file, String parentNode) throws ParserConfigurationException, SAXException, IOException {
        NodeList nodeList;
        DocumentBuilder builder = getDocumentBuilder();
        Document document = builder.parse(file);
        nodeList = document.getElementsByTagName(parentNode);
        return nodeList;
    }

    /**
     * 生成品牌对象
     *
     * @return 对象
     * @throws ParserConfigurationException 解析异常
     * @throws IOException                  IO异常
     * @throws SAXException                 异常
     */
    public static String getBrandName() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = getDocumentBuilder();
        Document document = builder.parse(new File("D:\\workspace\\test-workspace\\design-pattern-workspace\\design-pattern-demo\\src\\main\\resources\\factory\\brandName.xml"));
        Node node = getNode(document, "brandName");
        return node.getNodeValue().trim();
    }

    /**
     * 创建图片专属对象
     *
     * @param path 类的全路径
     * @param file xml文件的路径
     * @return 所需对象
     * @throws NewInstanceException 实例化失败异常
     */
    public static Object getImageBean(String path, File file) throws NewInstanceException {
        Object newInstance;
        String className = "未知";
        try {
            DocumentBuilder builder = getDocumentBuilder();
            Document document = builder.parse(file);
            Node node = getNode(document, "className");
            className = node.getNodeValue();
            className = className.substring(0, 1) + className.substring(1).toLowerCase() + "ImageFactory";

            Class<?> clazz = Class.forName(path + className);
            newInstance = clazz.newInstance();
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return newInstance;
    }

    /**
     * 创建加密专属对象
     * 如：在适配器中用到
     *
     * @param path 类的全路径
     * @param file xml文件的路径
     * @return 所需对象
     * @throws NewInstanceException 实例化失败异常
     */
    public static Object getEncryptBean(String path, File file) throws NewInstanceException {
        Object newInstance;
        String className = "未知";
        try {
            DocumentBuilder builder = getDocumentBuilder();
            Document document = builder.parse(file);
            Node node = getNode(document, "className");
            className = node.getNodeValue() + "EncryptAdapter";

            Class<?> clazz = Class.forName(path + className);
            newInstance = clazz.newInstance();
        } catch (Exception e) {
            throw new NewInstanceException(className, "类实例化失败", e);
        }
        return newInstance;
    }

    private static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder();
    }

    private static Node getNode(Document document, String nodeName) {
        NodeList nodeList = document.getElementsByTagName(nodeName);
        return nodeList.item(0).getFirstChild();
    }
}
