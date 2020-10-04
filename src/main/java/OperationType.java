
public enum OperationType {

    MULTIPLICATION("*"),
    DIFFERENCE("-"),
    DIVISION("/"),
    SUMMATION("+");

    private String symbol;

    OperationType(String s) {
        this.symbol = s;
    }

    public static OperationType parse(String symbol) throws IllegalMathOperationException {
        for (OperationType type : OperationType.values()) {
            if (type.symbol.equals(symbol)) {
                return type;
            }
        }
        throw new IllegalMathOperationException(symbol);
    }

}
