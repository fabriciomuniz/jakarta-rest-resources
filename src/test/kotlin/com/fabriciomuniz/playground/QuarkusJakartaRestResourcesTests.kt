package com.fabriciomuniz.playground

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class QuarkusJakartaRestResourcesTests {

    @Test
    fun `should get an avenger list`() {
        given()
            .contentType("application/hal+json")
            .`when`().get("/avengers")
            .then()
            .statusCode(200)
            .`body`("size()", `is`(10))
            .`body`("first().name", `is`("Steven Grant Rogers"))
    }

    @Test
    fun `should get the Thunder guy`() {
        given()
            .queryParam("character", "Thor")
            .`when`().get("/avengers")
            .then()
            .statusCode(200)
            .body(`is`("[{\"id\":3,\"character\":\"Thor\",\"name\":\"Thor Odinson\"}]".trimIndent()))
    }

}