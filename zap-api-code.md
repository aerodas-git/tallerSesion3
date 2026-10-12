package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class VulnerabilityTest {

    String owaspHost="http://localhost:9095";
    String todoLy="https://todo.ly";

    @Test
    public void owaspZapVulnerabilityTest() throws InterruptedException {
        // scanners
        Response response = given()
                    .queryParam("url", todoLy)
                    .log().all()
                .when()
                    .get(owaspHost+"/JSON/ascan/action/scan/");

        response.then().log().all();

        String id = response.then().extract().path("scan");


        // wait for the progress 100%
        String progress="0";
        do {
            Thread.sleep(10*1000);
            response = given()
                    .queryParam("scanId", id)
                    .log().all()
                    .when()
                    .get(owaspHost+"/JSON/ascan/view/status/");
            response.then().log().all();
            progress = response.then().extract().path("status");
            System.out.println(">>>>> Progress: ["+progress+"%]");
        }while (!progress.equals("100"));
        System.out.println(">COMPLETED : ["+progress+"%]");


        // get vulnerability list

         response = given()
                     .queryParam("scanId", id)
                     .log().all()
                .when()
                    .get(owaspHost+"/UI/ascan/view/scanProgress/");

        response.then().log().all();

        // get list alerts

        response = given()
                .queryParam("baseurl",todoLy)
                .log().all()
                .when()
                .get(owaspHost+"/UI/alert/view/alerts/");

        response.then().log().all();

        // get the report

        response = given()
                .log().all()
                .when()
                .get(owaspHost+"/UI/core/other/htmlreport/");

        response.then().log().all();
    }

}
