package com.jason.designpattern.create.factory.abstractFactory;

import com.jason.commons.beans.db.DataBaseConfiguration;
import com.jason.commons.exception.NewInstanceException;
import com.jason.commons.utils.ParesXML;
import com.jason.commons.beans.db.Connector;
import com.jason.commons.beans.db.DataBase;
import com.jason.commons.beans.db.Sql;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.CloseConnection;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.Connection;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.DBFactory;
import com.jason.designpattern.create.factory.abstractFactory.database.interfaces.Statement;
import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AbstractFactory;
import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AirConditioner;
import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.Television;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:38
 */
public class TestAbstractFacroey {
    public static void main(String[] args) throws NewInstanceException {
        AbstractFactory factory;
        Television television;
        AirConditioner airConditioner;

        factory = (AbstractFactory) ParesXML.getBean(ParesXML.ABDY_PACKAGE, new File("src/main/resources/factory/abstract-factory.xml"));
        television = factory.createTelevision();
        television.play();

        airConditioner = factory.createAirConditioner();
        airConditioner.inUse();

        // 数据库
        DBFactory dbFactory;
        Connection connection;
        Statement statement;
        CloseConnection close;

        dbFactory = (DBFactory) ParesXML.getBean("dataBase", ParesXML.DB_PACKAGE, new File("src/main/resources/factory/abstract-factory-db.xml"));
        connection = dbFactory.createConnection();
        statement = dbFactory.createStatement();
        close = dbFactory.createClose();

        DataBase dataBase = new DataBase();
        dataBase.setDataBaseName("Oralce");
        dataBase.setIp("localhost");
        dataBase.setPort("1234");
        dataBase.setUserName("test");
        dataBase.setPassword("test");

        Connector connector = connection.createConnection(dataBase);
        connector.setConnectionOutTime(10000);
        connector.setConnectionTime(LocalDateTime.now());
        connector.setDataBase(dataBase);

        Sql sql = statement.createSql();

        close.close(connector);

        // 配置多个数据库
        System.out.println("\n============== 多数据库配置 ===============\n");

//        List<Object> dataBasess = ParesXML.getBeans("dataBase", ParesXML.DB_PACKAGE, new File("src/main/resources/factory/abstract-factory-db.xml"));
        List<DataBaseConfiguration> dbInfo = ParesXML.getDBInfo(new File("src/main/resources/factory/abstract-factory-db.xml"));
        for (DataBaseConfiguration info : dbInfo) {
            DBFactory fac = info.getDbFactory();
            DataBase db = info.getDataBase();
            Connection conn = fac.createConnection();
            Statement state = fac.createStatement();
            CloseConnection closeConn = fac.createClose();

            Connector connector1 = conn.createConnection(db);
            Sql sql1 = state.createSql();
            closeConn.close(connector1);
            System.out.println(db.toString() + "\n");
        }


    }
}
