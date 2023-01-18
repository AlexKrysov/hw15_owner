package com.krysov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}/application.properties"})
public interface WebDriverConfig extends Config {

    @Config.Key("baseUrl")
    String getBaseUrl();

    @Config.Key("remoteUrl")
    String getRemote();

    @Config.Key("browser")
    String getBrowser();

    @Config.Key("browserVersion")
    String getBrowserVersion();

    @Config.Key("browserSize")
    String getBrowserSize();
}
