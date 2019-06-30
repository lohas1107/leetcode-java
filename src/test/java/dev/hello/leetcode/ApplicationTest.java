package dev.hello.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    private final Application application = new Application();

    @Test
    void testApplicationHasAGreeting() {
        assertEquals("Hello world.", application.getGreeting());
    }
}