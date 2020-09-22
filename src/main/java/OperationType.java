
public enum OperationType {

    MULTIPLICATION("*"),
    DIFFERENCE("-"),
    DIVISION("/"),
    SUMMATION("+");

    private String symbol;

    OperationType(String s) {
        this.symbol = s;
    }

    public static OperationType parse(String symbol) {
        for (OperationType type : OperationType.values()) {
            if (type.symbol.equals(symbol)) {
                return type;
            }
        }
        throw new IllegalArgumentException(
                "No enum constant for symbol: '" + symbol + "'");
    }

}
