package api.e2e;

import api.bean.Evento;
import api.bean.Modalidade;
import api.bean.Palestra;
import api.exception.ObjetoNotFoundException;
import design.BaseTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class VisualizaDetalhePalestraTest extends BaseTest {

    @Test(groups = {"aceitacao"})
    public void visualizaDetalhes_SabendoIDs() {
        int idTDCFloripa = 110;
        int idTrilhaDevTest = 2685;
        int idPalestra = 10083;

        given().
            auth().
                oauth2(accessToken).
            pathParam("eventoID", idTDCFloripa).
            pathParam("modalidadeID", idTrilhaDevTest).
            pathParam("palestraID", idPalestra).
        when().
            get("/evento/{eventoID}/modalidade/{modalidadeID}/palestra/{palestraID}").
        then().
            statusCode(200).
            body("titulo", is("Automação e Virtualização de serviços REST com RestAssured + Wiremock + Docker"));
    }

    @Test(groups = {"aceitacao"})
    public void visualizaDetalhes_EncontrandoDados() throws ObjetoNotFoundException {
        String tituloPalestra = "Automação e Virtualização de serviços REST com RestAssured + Wiremock + Docker";

        Evento evento = encontraEvento("TDC 2019 Florianópolis");
        Modalidade trilha = encontraTrilha(evento, "Trilha DevTest");
        Palestra palestra = encontraPalestra(evento, trilha, tituloPalestra);

        given().
            auth().
                oauth2(accessToken).
            pathParam("eventoID", evento.getId()).
            pathParam("modalidadeID", trilha.getId()).
            pathParam("palestraID", palestra.getId()).
        when().
            get("/evento/{eventoID}/modalidade/{modalidadeID}/palestra/{palestraID}/palestrantes").
        then().
            statusCode(200).
            body("[0].member.nome", is("Diego Paiva")).
            body("[0].member.empresa", is("Globalcode"));
    }

    private Evento encontraEvento(String nomeEvento) throws ObjetoNotFoundException {
        return
            given().
                auth().
                    oauth2(accessToken).
            when().
                get("/eventos").
            then().
                statusCode(200).
                extract().
                    body().
                        jsonPath().
                            getList(".", Evento.class).
                                stream().filter(evento -> evento.getDescricao().contains(nomeEvento)).
                                    findFirst().orElseThrow(ObjetoNotFoundException::new);
    }

    private Modalidade encontraTrilha(Evento evento, String nomeTrilha) throws ObjetoNotFoundException {
        return
            given().
                auth().
                    oauth2(accessToken).
                pathParam("eventoID", evento.getId()).
            when().
                get("/evento/{eventoID}/modalidades").
            then().
                statusCode(200).
                extract().
                    body().
                        jsonPath().
                            getList(".", Modalidade.class).
                                stream().filter(modalidade -> modalidade.getDescricao().contains(nomeTrilha)).
                                    findFirst().orElseThrow(ObjetoNotFoundException::new);
    }


    private Palestra encontraPalestra(Evento evento, Modalidade trilha, String tituloPalestra) throws ObjetoNotFoundException {
        return
            given().
                auth().
                    oauth2(accessToken).
                pathParam("eventoID", evento.getId()).
                pathParam("modalidadeID", trilha.getId()).
            when().
                get("/evento/{eventoID}/modalidade/{modalidadeID}/palestras").
            then().
                statusCode(200).
                extract().
                    body().
                        jsonPath().getList(".", Palestra.class).
                            stream().filter(palestra -> palestra.getTitulo().equals(tituloPalestra)).
                                findFirst().orElseThrow(ObjetoNotFoundException::new);
    }
}
