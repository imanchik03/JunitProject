package utilities;

import com.beust.jcommander.StringKey;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;

    static {
        String path = "src/test/resources";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
        }
    }
    public static String getProperties(String key){
        return properties.getProperty(key);


        }
    }
