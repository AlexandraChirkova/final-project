package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:web-${runMode}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("remote")
    String remote();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("baseUrl")
    @DefaultValue("https://www.flip.kz")
    String baseUrl();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String pageLoadStrategy();

    @Key("reopenBrowserOnFail")
    @DefaultValue("true")
    boolean reopenBrowserOnFail();

    @Key("enableVNC")
    @DefaultValue("true")
    boolean enableVNC();

    @Key("enableVideo")
    @DefaultValue("true")
    boolean enableVideo();

}
