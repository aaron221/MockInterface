package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

public class ReadConfigFile {

    public static String getUrl(String interfaceuri){
        String address = TestConfigData.testUrl;
        String testUrl;
        testUrl = address + interfaceuri;
        return testUrl;
    }

    public static Object getBean(String mapperJavaFile){
        ApplicationContext ct=new FileSystemXmlApplicationContext("/src/main/resources/spring/ApplicationContext.xml");
        return ct.getBean(mapperJavaFile);
    }

}