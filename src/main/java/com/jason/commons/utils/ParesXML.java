package com.jason.commons.utils;

import com.jason.commons.exception.NewInstanceException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author ChenHol.Wong
 * @create 2019/12/12 - 22:27
 */
public class ParesXML {
    public static final String DY_PACKAGE = "com.jason.test.designpattern.factory.factoryMethod.dy.";
    public static final String TV_PACKAGE = "com.jason.test.designpattern.factory.factoryMethod.tv.";
    public static final String IMAGE_PACKAGE = "com.jason.test.designpattern.factory.factoryMethod.image.";

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

    private static Node getNode(Document document, String nodeName) {
        NodeList nodeList = document.getElementsByTagName(nodeName);
        return nodeList.item(0).getFirstChild();
    }

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

    private static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder();
    }
}
