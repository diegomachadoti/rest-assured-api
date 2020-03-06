package design;

import api.configuration.Configuration;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public abstract class BaseTestMock {

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
        Configuration configuration = new Configuration();

        baseURI = configuration.getAPIURL();
        basePath = configuration.getPublico();
    }
}
