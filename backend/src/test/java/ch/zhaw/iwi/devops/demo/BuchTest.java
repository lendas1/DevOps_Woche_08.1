package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BuchTest {
    @Test
    void testSetTitel() {
        // Testet den Setter für den Titel.
        Buch buch = new Buch();
        buch.setTitel("1984");
        assertEquals("1984", buch.getTitel());
    }

}
