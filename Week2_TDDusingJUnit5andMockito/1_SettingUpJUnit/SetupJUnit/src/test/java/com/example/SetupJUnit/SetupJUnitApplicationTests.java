package com.example.SetupJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SetupJUnitApplicationTests {

	 @Test
    public void testGreet() {
        SetupJUnitApplication hello = new SetupJUnitApplication();
        assertEquals("Hello", hello.greet());
    }

}
