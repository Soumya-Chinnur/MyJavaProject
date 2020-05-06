import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class FileReading {

    InputStream inputStream;

    public void getPropValues()  {

        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            String user = prop.getProperty("name");
            String example = prop.getProperty("example");
            System.out.println(example);
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}