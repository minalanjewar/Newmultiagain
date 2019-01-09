package app;

import config.ConfigService;
import util.Util;

public class App {

    public String greet(String name) {
<<<<<<< HEAD
        return Util.join("Hello ", name);
    }

    public boolean store(String name) {
        ConfigService cs = new ConfigService();
        cs.getConfig("datastore");
        return true;
    }
}
