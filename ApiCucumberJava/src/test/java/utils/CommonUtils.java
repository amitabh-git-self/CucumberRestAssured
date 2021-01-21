package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class CommonUtils {

    public static void getPetByPetId(String petId){
        given().contentType(ContentType.JSON).
                when().get(String.format("https://petstore.swagger.io/v2/pet/%s", petId)).
                then().body("status", is("available"));
    }

    public static void postPet(String petId, String petName) {
        String payload = "{\n" +
                "    \"id\": \"petId\",\n" +
                "    \"category\": {\n" +
                "        \"id\": \"petId\",\n" +
                "        \"name\": \"petName\"\n" +
                "    },\n" +
                "    \"name\": \"petName\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"petName\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": \"petId\",\n" +
                "            \"name\": \"petName\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";
        String url = "https://petstore.swagger.io/v2/pet";
        payload = payload.replace("petId", petId);
        payload = payload.replace("petName", petName);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(payload)
                .when()
                .post(url)
                .then().statusCode(200);
    }

    public static void putPet(String newStatus) {
        String payload = "{\n" +
                "    \"id\": 777,\n" +
                "    \"category\": {\n" +
                "        \"id\": 777,\n" +
                "        \"name\": \"amitabh\"\n" +
                "    },\n" +
                "    \"name\": \"amitabh\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"amitabh\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 777,\n" +
                "            \"name\": \"amitabh\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"sold\"\n" +
                "}";
        Response response = (Response) given()
                .header("Content-type", "application/json")
                .and()
                .body(payload)
                .when()
                .put("/posts/1")
                .then().statusCode(200);
        Assert.assertEquals("sold", response.jsonPath().getString("status"));
    }
}
