package app;

import config.ConfigService;
import util.Util;

public class App {
/*hello world multi*/
    public String greet(String name) {
        return Util.join("Hello1 ", name);
    }

    public boolean store(String name) {
        ConfigService cs = new ConfigService();
        cs.getConfig("datastore");
        return true;
    }
}
