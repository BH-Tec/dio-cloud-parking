package br.com.brunodorea.parking.controller;

import br.com.brunodorea.parking.controller.dto.ParkingCreateDTO;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest() {
        System.out.println(randomPort);
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {
//        RestAssured.given()
//                .when()
//                .get("/parking")
//                .then()
//                .statusCode(HttpStatus.OK.value())
//                .body("license[0]", Matchers.equalTo("BHF-1405"));
    }

    @Test
    void whenFindAllThenCheckIsCreate() {
//        var createDTO = new ParkingCreateDTO();
//        createDTO.setColor("VERDE");
//        createDTO.setLicense("BHF-1405");
//        createDTO.setModel("VW FUSCA");
//        createDTO.setState("BA");
//
//        RestAssured.given()
//                .when()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(createDTO)
//                .post("/parking")
//                .then()
//                .statusCode(HttpStatus.CREATED.value())
//                .body("license", Matchers.equalTo("BHF-1405"))
//                .body("color", Matchers.equalTo("VERDE"));
    }
}