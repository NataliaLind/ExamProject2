package Examination2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestLettersMorse {
    @Test
    public void testToMorseBigLetter() {
        MyConverter converterLetMorse = new MyConverter();
        String testdata = "A";
        String expected = "*-";
        String actual = converterLetMorse.getMorseCode(testdata);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToMorseSmallLetter() {
        MyConverter converterLetMorse = new MyConverter();
        String testdata = "b";
        String expected = "-***";
        String actual = converterLetMorse.getMorseCode(testdata);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToLetters() {
        MyConverter converterLetMorse = new MyConverter();
        String testdata = "-*-*";
        String expected = "C";
        String actual = converterLetMorse.getLetter(testdata);
        Assertions.assertEquals(expected, actual);
    }
}


