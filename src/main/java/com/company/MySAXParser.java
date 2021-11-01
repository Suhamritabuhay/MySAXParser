package com.company;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class MySAXParser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance(); //создали фабрику парсеров
        SAXParser parser = factory.newSAXParser(); //создали парсер
        Handler handler = new Handler(); //создали обработчик событий
        parser.parse(new File("src\\main\\resources\\4 6019119652838312849.xml"), handler); //парсим файл обработчиком
    }

    /*public ArgumentProcess(String[] args) throws ArgumentExceptions, IOExceptions { //старт парсинга
        validator(args);
        storeParams(args);
    }

    inputFileName = fileExist(args[1]); //получение имени файла

    private String fileExist(String fileName) throws ArgumentExceptions, IOExceptions { //проверка
        String path = System.getProperty("user.dir");
        File f = new File(path + File.separator + fileName);
        if (f.exists() && f.isFile()) {
            return f.getAbsolutePath();
        } else {
            throw new ArgumentException("input file doesn't exist");
        }
    }*/
}