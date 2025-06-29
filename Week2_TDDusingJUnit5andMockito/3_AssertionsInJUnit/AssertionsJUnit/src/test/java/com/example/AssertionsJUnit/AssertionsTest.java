package com.example.AssertionsJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, Assertions.add(2, 3));

        // Assert true
        assertTrue(Assertions.isGreater(5, 3));

        // Assert false
        assertFalse(Assertions.isGreater(3, 5));

        // Assert null
        assertNull(Assertions.getNull());

        // Assert not null
        assertNotNull(Assertions.getNotNullObject());
    }
}

