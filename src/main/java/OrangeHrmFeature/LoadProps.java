package OrangeHrmFeature;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProps {
    //Get properties from from testdataConfig
    static Properties props;
    static FileInputStream inputStream;
    public static String getProperty(String key) {
        props = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\Resources\\TestData\\testdataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }
    @Test
    public void test3() {
        System.out.println(getProperty("url"));
    }
}
