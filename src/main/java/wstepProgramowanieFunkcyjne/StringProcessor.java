package wstepProgramowanieFunkcyjne;

public class StringProcessor {

    private StringOperation stringOperation;

    public StringProcessor() {
        stringOperation = input -> input;
    }

    public void setStringOperation(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }

    public String process(String input) {
        return stringOperation.operation(input);
    }
}
