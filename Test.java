package com.wenyue.xml.demo;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by wswenyue on 2015/8/25.
 */
public class Test {
    public static void main(String[] args) {
        SAXParser parser = null;
        try {
            //构建SAXParser
            parser = SAXParserFactory.newInstance().newSAXParser();
            //实例化  DefaultHandler对象
            SAXHandler handler = new SAXHandler();
            //加载资源文件 转化为一个输入流
            //通过getResourceAsStream拿到文件的流对象，此文件必须和SAXHandler在同一个目录，否则拿不到文件，输出为null
            InputStream in = SAXHandler.class.getClassLoader().getResourceAsStream("Student.xml");
            //这样也是可以的
//          InputStream in = new FileInputStream("src/Student.xml");
            //调用parse()方法
            parser.parse(in,handler);

            //遍历结果

            List<Student> list = handler.getList();
            for (Student student : list) {
                System.out.println(student);
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
