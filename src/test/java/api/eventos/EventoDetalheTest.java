package api.eventos;

import api.schemas.LocalSchemas;
import design.BaseTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.File;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class EventoDetalheTest extends BaseTest {

    private int id = 110;

    @Test(groups = { "health" })
    public void healthCheck() {
        given().
            auth().oauth2(accessToken).
        when().
            get("evento/{id}", id).
        then().
            statusCode(HttpStatus.SC_OK);
    }

    @Test(groups = {"contrato"})
    public void contrato() {
        given().
            auth().oauth2(accessToken).
        when().
            get("evento/{id}", 110).
        then().
            assertThat().
                body(matchesJsonSchema(new File(LocalSchemas.EVENTO_DETALHE.path())));
    }

    @Test(groups = {"funcional"})
    public void validarEventoPeloID() {
        given().
            auth().oauth2(accessToken).
        when().
            get("evento/{id}", id).
        then().
            statusCode(HttpStatus.SC_OK).
            body("[0].id", is(110)).
            body("[0].descricao", is("TDC 2019 Florianópolis")).
            body("[0].chave", is("tdc-2019-florianopolis")).
            body("[0].ativo", is(true)).
            body("[0].dias", is(5)).
            body("[0].dataInicio", is("2019-04-23 00:00:00")).
            body("[0].dataTermino", is("2019-04-27 00:00:00"));
    }

    //TODO: possivel bug. Retorno como http status 200 e body null
    // sugerir ter um retorno como evento não encontrado
    @Test(groups = {"negativo"})
    public void eventoNaoExistente() {
        given().
            auth().oauth2(accessToken).
        when().
            get("evento/{id}", 9999).
        then().
            statusCode(HttpStatus.SC_OK).
            body(is("null"));
    }

    @Test(groups = {"negativo"})
    public void naoAutorizado() {
        given().
            when().
        get("evento/{id}", id).
        then().
            statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
}
