package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void messageTest() {
        assertEquals("Hello from Jenkins Maven Java!", App.message());
    }
}
