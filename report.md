## Integration Testing
Integration testing is the second level of the software testing process comes after unit testing. In this testing, units or individual components of the software are tested in a group. The focus of the integration testing level is to expose defects at the time of interaction between integrated components or units.

## Implementation
````
     TestRestTemplate restTemplate = new TestRestTemplate();
        String url = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches";
        String response = restTemplate.getForObject(url, String.class);
        assertNotNull(response);
````


## SETUP
You can run the following commands in terminal to run the integration test and get the result:
```
    chmod +x gradlew
    ./gradlew build
    ./gradlew test
```
