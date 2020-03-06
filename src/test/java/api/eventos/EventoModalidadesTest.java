package api.eventos;

import design.BaseTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class EventoModalidadesTest extends BaseTest {

    private int idTDCFlorianopolis2019 = 110;

    @Test(groups = {"health"})
    public void healthCheck() {
        given().
            auth().
                oauth2(accessToken).
            pathParam("idEvento", idTDCFlorianopolis2019).
        when().
            get("evento/{idEvento}/modalidades").
        then().
            statusCode(HttpStatus.SC_OK);
    }

    @Test(groups = {"funcional"})
    public void retornoPossuiTrilhaTestes() {
        int idTrilhaDevTest = 2685;

        given().
            auth().
                oauth2(accessToken).
            pathParam("idEvento", idTDCFlorianopolis2019).
            pathParam("idModalidades", idTrilhaDevTest).
        when().
            get("evento/{idEvento}/modalidade/{idModalidades}").
        then().
            statusCode(HttpStatus.SC_OK).
            body("[0].descricao", is("Trilha DevTest"));
    }
}
