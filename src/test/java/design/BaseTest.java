package design;

import api.configuration.Configuration;
import api.oauth.GenerateAccessToken;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public abstract class BaseTest {

    protected static String accessToken;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
        Configuration configuration = new Configuration();

        accessToken = new GenerateAccessToken().getAccessToken();

        RestAssured.defaultParser = Parser.JSON;

        baseURI = configuration.getAPIURL();
        basePath = configuration.getPublico();
    }
}
