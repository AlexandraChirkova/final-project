package helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class BrowserstackAppUploader {

    public static String upload(String user, String key, String appPath) {

        File apk = new File(appPath);
        if (!apk.exists()) {
            throw new RuntimeException("APK не найден: " + appPath);
        }

        RestAssured.baseURI = "https://api-cloud.browserstack.com";

        Response response = given()
                .auth().preemptive().basic(user, key)
                .multiPart("file", apk)
                .when()
                .post("/app-automate/upload")
                .then()
                .statusCode(200)
                .extract().response();

        return response.path("app_url");
    }
}

