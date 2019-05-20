package swagger.petstore.controllers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import swagger.petstore.models.PetModel;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class PetCtrl {


    private RequestSpecification requestSpecification = new RequestSpecBuilder()
            .addHeader("api_key", "1qa2ws3ed4rfvcxz")
            .setBaseUri("http://petstore.swagger.io")
            .setBasePath("/v2/pet")
            .setContentType(ContentType.JSON)
            .setProxy(host("proxy.pbank.com.ua").withPort(8080))
            .setRelaxedHTTPSValidation()
            .log(LogDetail.ALL)
            .build();


    private PetModel petModels = PetModel
            .builder()
            .name("testMyTest")
            .build();

    public PetModel addNewPet() {
        return given()
                .header("api_key", "1qa2ws3ed4rfvcxz")
                .baseUri("http://petstore.swagger.io")
                .basePath("/v2/pet")
                .proxy(host("proxy.pbank.com.ua").withPort(8080))
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .log().all()

                .body(petModels)
                .post().as(PetModel.class);
    }

    public void addNewPetPrint() {
        given(requestSpecification)
                .body(petModels)
                .when()

                .post().prettyPrint();
    }
}
