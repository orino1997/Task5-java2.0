public class IllegalMathOperationException extends Exception {
    private String operation;
    public String getOperation() {
        return operation;
    }

    public IllegalMathOperationException(String operation) {
        super();
        this.operation = operation;
    }

    @Override
    public String getMessage() {
        return "This is an invalid operation. Next time choose from the valid ones";
    }
}
