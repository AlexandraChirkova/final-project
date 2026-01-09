package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:real.properties")
public interface RealConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("app.package")
    String appPackage();

    @Key("platform.name")
    String platformName();
}
