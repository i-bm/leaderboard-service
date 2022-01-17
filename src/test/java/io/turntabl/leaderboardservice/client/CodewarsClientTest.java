package io.turntabl.leaderboardservice.client;

import io.turntabl.leaderboardservice.client.response.UserDto;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;

@RestClientTest(CodewarsClient.class)
class CodewarsClientTest {

    void checkIfUserExistFromUserDto() throws Exception{
        UserDto user;
    }
}
