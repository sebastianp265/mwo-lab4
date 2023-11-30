package com.example.mwolab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MwoLab4ApplicationTests {

	@Test
	void testFail() {
        Assertions.fail("This test should fail");
	}
}
