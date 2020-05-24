package wstepProgramowanieFunkcyjne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testWhenDefaultStringProcessorIsProcessingInputAndReturnNotModifiedInput() {
        String stringToBeTested = "TEST";
        assertEquals(stringToBeTested, stringProcessor.process(stringToBeTested));
    }

    @Test
    public void testWhenUpperCaseStringProcessorIsProcessingInputAndReturnUpperCasedInput() {
        String stringToBeTested = "test";
        stringProcessor.setStringOperation(input -> input.toUpperCase());
        assertEquals(stringToBeTested.toUpperCase(), stringProcessor.process(stringToBeTested));
    }
}