package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/credentials.properties",
        "classpath:config/driver.properties"
})
public interface CredentialsConfig extends Config {

    @Key("url")
    String url();

    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("browser")
    String browser();
}
