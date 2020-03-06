package api.configuration;

public class Configuration {

    private ReadProperties readProperties;

    public Configuration() {
        readProperties = new ReadProperties();
    }

    public String getAuthenticationUsername() {
        return readProperties.getValue("authentication.username").isEmpty()
                ? System.getenv("AUTHENTICATION_USERNAME")
                : readProperties.getValue("authentication.username");
    }

    public String getAuthenticationPassword() {
        return readProperties.getValue("authentication.password").isEmpty()
                ? System.getenv("AUTHENTICATION_PASSWORD")
                : readProperties.getValue("authentication.password");
    }

    public String getAPIURL() {
        if (System.getenv("ENVIRONMENT") != null && System.getenv("ENVIRONMENT").equals("mock")) {
            return readProperties.getValue("mock.api.url");
        } else {
            return readProperties.getValue("api.url");
        }
    }

    public String getAPIOauthContext() {
        return readProperties.getValue("api.oauth.context");
    }

    public String getPublico() {
        return readProperties.getValue("api.publico");
    }
}
