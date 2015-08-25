package com.wenyue.xml.demo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wswenyue on 2015/8/25.
 */
public class SAXHandler extends DefaultHandler {
    private List<Student> list = null;
    private Student student;
    private String tagName;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("student".equals(qName)) {
            student = new Student();
            //获取节点id属性
            student.setId(Integer.parseInt(attributes.getValue(0)));
            //获取节点group属性
            student.setGroup(Integer.parseInt(attributes.getValue(1)));
        }
        tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("student".equals(qName)) {
            list.add(student);
        }
        tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (tagName != null && !tagName.trim().equals("")) {
            String data = new String(ch, start, length);
            if (tagName.equals("name")) {
                student.setName(data);
            } else if (tagName.equals("age")) {
                student.setAge(Integer.parseInt(data));
            } else if (tagName.equals("sex")) {
                student.setSex(data);
            } else if (tagName.equals("email")) {
                student.setEmail(data);
            } else if (tagName.equals("birthday")) {
                student.setBirthday(data);
            } else if (tagName.equals("memo")) {
                student.setMemo(data);
            }
        }

    }
}
