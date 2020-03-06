package api.oauth;

import api.configuration.Configuration;

import static io.restassured.RestAssured.*;


public class GenerateAccessToken {

    /**
     * Gera o token para ser utilizado no teste
     * @return atributo <i>Access-Token</i> da resposta
     */
    public String getAccessToken() {
        Configuration configuration = new Configuration();

        String username = configuration.getAuthenticationUsername();
        String password = configuration.getAuthenticationPassword();

        baseURI = configuration.getAPIURL();
        basePath = configuration.getAPIOauthContext();

        return
            given().
                auth()
                    .preemptive().basic(username, password).
            when().
                get("/").
            then().
                extract().
                    path("Access-Token");
    }
}