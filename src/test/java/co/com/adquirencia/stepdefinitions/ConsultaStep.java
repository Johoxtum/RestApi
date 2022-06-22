package co.com.adquirencia.stepdefinitions;

import co.com.adquirencia.task.ConsumeGet;
import co.com.adquirencia.task.Load;
import co.com.adquirencia.utils.resource.WebServiceEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaStep {

    @Given("Yo cargo la informacion de mi usuario:")
    public void yoCargoLaInformacionDeMiUsuario(List<Map<String, String>> data) {

        theActorInTheSpotlight().wasAbleTo(Load.testData(data.get(0)));
    }

    @When("Envio la peticion GetDataCredit")
    public void envioLaPeticionGetDataCredit() {

        theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(
                        WebServiceEndPoints.URI.getUrl()
                ));
    }
    @Then("Recibo una respuesta con el datacredito con codigo {int}")
    public void reciboUnaRespuestaConElDatacreditoConCodigo(Integer int1) {
    }

    @Given("Yo como usuario envio los datos")
    public void yoComoUsuarioEnvioLosDatos(List<Map<String, String>> data) {

        theActorInTheSpotlight().wasAbleTo(Load.testData(data.get(0)));
    }




    @When("Envio la peticion Get")
    public void envioLaPeticionGet() {

        theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(
                        WebServiceEndPoints.URI.getUrl()
                ));

    }
    @Then("Recibo el siguiente status code {int}")
    public void reciboElSiguienteStatusCode(Integer int1) {

    }
}
