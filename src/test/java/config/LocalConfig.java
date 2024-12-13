package config;

import org.aeonbits.owner.Config;

//import org.aeonbits.owner.Config;

@Config.Sources({
        // "classpath:local.properties"
        //"classpath:properties/${deviceHost}.properties"

        "classpath:properties/${env}.properties",
        "classpath:properties/local.properties"
})
public interface LocalConfig extends Config {
    @Key("device")
    String getDeviceName();

    @Key("os_version")
    String getPlatformVersion();

    @Key("localServerUrl")
    String getServerUrl();

    @Key("appPackage")
    String getAppPackage();

    @Key("appActivity")
    String getAppActivity();
}




