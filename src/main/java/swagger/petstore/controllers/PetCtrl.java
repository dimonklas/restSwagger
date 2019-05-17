package swagger.petstore.controllers;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import swagger.petstore.models.PetModel;

import static io.restassured.RestAssured.given;

public class PetCtrl {
    private RequestSpecification requestSpecification;
    private PetModel petModels = PetModel
            .builder()
            .name("testMyTest")
            .build();

    public PetModel addNewPet() {
        return given()
                .header("api_key", "1qa2ws3ed4rfvcxz")
                .baseUri("http://petstore.swagger.io")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .log().all()

                .body(petModels)
                .post().as(PetModel.class);
    }
}
