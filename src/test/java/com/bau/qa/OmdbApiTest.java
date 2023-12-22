package com.bau.qa;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class OmdbApiTest {

    @Test
    public void shouldSendRequestToOmdbApi() {
        RestAssured.baseURI = "http://www.omdbapi.com";
        given()
                .param("s", "harry+potter")
                .param("apikey", "c0db11a4")
                .get("/")
                .then()
                .body("Search[0].Title", equalTo("Harry Potter and the Deathly Hallows: Part 2"))
                .statusCode(200);
    }
}
