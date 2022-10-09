package test.java.springproj1;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.json.JSONException;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
class APIApplicationTest {

    @Test
    @DisplayName("Repos Test")
    public void getReposTest() throws Exception {

        TestRestTemplate restTemplate = new TestRestTemplate();
        String url = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos";
        String response = restTemplate.getForObject(url, String.class);
        assertNotNull(response);
    }

    @Test
    @DisplayName("Branches Test")
    public void getBranchesTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String url = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches";
        String response = restTemplate.getForObject(url, String.class);
        assertNotNull(response);
    }

    @Test
    @DisplayName("Commits Test")
    public void getCommitsTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String url = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches/1/commits";
        String response = restTemplate.getForObject(url, String.class);
        assertNotNull(response);
    }

}