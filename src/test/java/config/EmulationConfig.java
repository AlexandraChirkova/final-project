package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:emulation.properties"})
public interface EmulationConfig extends Config {

    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("app.package")
    String appPackage();

    @Key("app.activity")
    String appActivity();

}
