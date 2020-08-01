package tk.mdogx.onesoil.appium.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

    private static PropertyUtils INSTANCE = null;
    private final Properties properties = new Properties();

    private PropertyUtils() {
        this.loadProperties("configuration.properties");
        this.properties.putAll(System.getProperties());
    }

    private static PropertyUtils getInstance() {
        if (PropertyUtils.INSTANCE == null) {
            PropertyUtils.INSTANCE = new PropertyUtils();
        }
        return PropertyUtils.INSTANCE;
    }

    /**
     * This method can read Property value for any given key
     *
     * @param key
     * @return
     */
    public static String getProperty(final String key) {
        return PropertyUtils.getInstance().properties.getProperty(key);
    }

    /**
     * This method will read any integer property value
     *
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getIntegerProperty(final String key, final int defaultValue) {
        int integerValue = 0;
        final String value = PropertyUtils.getInstance().properties.getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        integerValue = Integer.parseInt(value);
        return integerValue;
    }

    /**
     * If key couldn't be found then it will return default value
     *
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getProperty(final String key, final String defaultValue) {
        return PropertyUtils.getInstance().properties.getProperty(key, defaultValue);
    }

    /**
     * This method will load properties file in Properties object
     *
     * @param path
     */
    public void loadProperties(final String path) {
        InputStream inputStream = null;
        try {
            inputStream = ClassLoader.getSystemResourceAsStream(path);
            System.out.println(inputStream);
            if (inputStream != null) {
                this.properties.load(inputStream);
            } else {
                throw new UnableToLoadPropertiesException("property file '" + path + "' not found in the classpath");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

        return;
    }

    /**
     * @return Properties
     */
    public static Properties getProps() {
        return PropertyUtils.getInstance().properties;
    }

}

class UnableToLoadPropertiesException extends RuntimeException {

    UnableToLoadPropertiesException(final String s) {
        super(s);
    }

    public UnableToLoadPropertiesException(final String string, final Exception ex) {
        super(string, ex);
    }
}