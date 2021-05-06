import static org.apache.http.HttpStatus.SC_OK;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class ExampleTest {

    @Test
    public void retrieveCatsFactsTest() {
        RestAssured.given().get("https://cat-fact.herokuapp.com/facts").prettyPeek().then().statusCode(SC_OK);
    }
}
