package api.mock;

import design.BaseTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PalestraTest extends BaseTest {

    @Test(groups = {"mock"})
    public void validarDadosPalestrantePorID() {
        given().
            auth().oauth2(accessToken).
            pathParam("eventoID", 110).
            pathParam("modalidadeID", 2685).
            pathParam("palestra", 10083).
        when().
            get("evento/{eventoID}/modalidade/{modalidadeID}/palestra/{palestra}").
        then().
            statusCode(HttpStatus.SC_OK).
            body("titulo", is("Como um bilionário pode se ternar super heroi")).
            body("descricao", is("Venha descobrir..."));
    }
}
