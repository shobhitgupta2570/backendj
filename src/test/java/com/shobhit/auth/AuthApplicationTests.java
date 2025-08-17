// package com.sobhit.auth;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// class AuthApplicationTests {

// 	@Test
// 	void contextLoads() {
// 	}

// }

package com.shobhit.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.shobhit.auth.AuthApplication.class)
class AuthApplicationTests {

    @Test
    void contextLoads() {
        // This test just checks if the Spring context loads successfully
    }
}
