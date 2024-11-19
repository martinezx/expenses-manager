package org.xmdf.expenses;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserManagementServiceApplicationTests {

    @Test
    void mockTest() {
        Assert.isTrue(true, "Value must be true");
    }
}
