package api.eventos;

import api.bean.Evento;
import design.BaseTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static io.restassured.RestAssured.*;

public class EventosTest extends BaseTest {

    @Test(groups = {"health"})
    public void healthCheck() {
        given().
            auth().oauth2(accessToken).
        when().
            get("eventos").
        then().
            statusCode(HttpStatus.SC_OK);
    }

    @Test(groups = {"negativo"})
    public void naoAutotizado() {
        when().
            get("eventos").
        then().
            statusCode(HttpStatus.SC_UNAUTHORIZED);
    }

    @Test(groups = {"funcional"})
    public void retornoPossuiTodosOsEventos() {
        assertThat(Arrays.asList(listaDeEventos()), hasSize(42));
    }

    private static Evento[] listaDeEventos() {
        return
                given().
                    auth().oauth2(accessToken).
                when().
                    get("eventos").
                then().
                    statusCode(HttpStatus.SC_OK).
                    extract().
                        body().as(Evento[].class);
    }
}
