package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aNegativTest0() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "Übersetzung der Zahl 0 nicht möglich (1.0)");
    }
    @Test
    void aPositiveTest1() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertEquals(value, "eins");
    }
    @Test
    void aPositiveTest2() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(4);
        assertEquals(value, "vier");
    }
    @Test
    void aPositiveTest3() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(10);
        assertEquals(value, "zehn");
    }
    @Test
    void aNegativeTest4() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(11);
        assertEquals(value, "Übersetzung der Zahl 11 nicht möglich (1.0)");
    }
    @Test
    void aNegativTest5() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(-10);
        assertEquals(value, "Übersetzung der Zahl -10 nicht möglich (1.0)");
    }
}