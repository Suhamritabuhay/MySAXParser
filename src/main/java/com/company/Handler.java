package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        //сработывает на первый тег
    }

    @Override
    public void endDocument() throws SAXException {
        //срабатывает на закрывающийся первый тег
    }

    @Override
    public void startElement(String nameSpace, String localName, String qName, Attributes attributes) throws SAXException {
        //сработывает на начало элемента
        //пространство имен, имя, составное имя: имя + uri(nameSpace), и
        //c помощью объектов класса Attributes можем получать сведения об атрибутах
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //срабатывает на закрывающийся тег элемента
        //атрибутов не принимает, что логично
    }

    @Override
    public void characters(char[] ch, int start, int end) throws SAXException {
        //получаем данные между тегами
        String s = new String(ch, start, end);
        System.out.println(s);
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        //логика реакции на пустое пространство внутри элементов (пробелы, переносы строчек и так далее).
    }
}