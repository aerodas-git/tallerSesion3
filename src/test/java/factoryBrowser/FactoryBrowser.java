package factoryBrowser;

import java.util.HashMap;
import java.util.Map;

public class FactoryBrowser {

    public static IBrowser make (String browserType){
        Map<String,IBrowser> browserMap = new HashMap<>();
        browserMap.put("chrome", new Chrome());
        browserMap.put("proxy", new ChromeProxy());
        browserMap.put("firefox", new Firefox());

        return browserMap.containsKey(browserType.toLowerCase())?
                browserMap.get(browserType.toLowerCase()):
                new Chrome();
    }
}
