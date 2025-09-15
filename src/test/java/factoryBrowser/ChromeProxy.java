package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeProxy implements IBrowser{

    String proxyHost="localhost:9095"; // OWASP ZAP Config

    @Override
    public WebDriver create() {
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyHost);
        proxy.setSslProxy(proxyHost);

        ChromeOptions options = new ChromeOptions();
        options.setProxy(proxy);
        options.addArguments("--ignore-certificate-errors");

        ChromeDriver chromeProxy = new ChromeDriver(options);
        chromeProxy.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeProxy.manage().window().maximize();
        return chromeProxy;
    }
}
