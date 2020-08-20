package com.deneme1.utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    // Bu classin amaci configiration.properties dosyasinda ki verileri test data larini okumaktir ...

    // create Properties instance;

    private static Properties properties;

    //FileInputStream kullanarak,bir dosya aciyoruz
    //Properties'i bu dosyaya yukluyoruz
    //Daha sonra properties dosyasini okuyacagiz.

    //baslatmak icin static blok olusturduk.


    static {
        String  path="configuration.properties";

        try {
            FileInputStream file=new FileInputStream(path); // FileInputStream ile dosya aciyoruz
            properties=new Properties();
            properties.load(file);// properties i bu dosyaya yukluyoruz
        } catch (Exception e) {
            System.out.println("file path bulunamadi");
            e.printStackTrace();
        }

    }

    //Okumak icin static bir metod olusturalim.
    //Bu metod kullanici anahtar kelimeyi girdiginde(key) , value return eder.

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

//    public static void main (String[] arg){
//        System.out.println(properties.getProperty("browser"));
//    }



}
