public class OperationFactory {

    static Operation getOperation(String operationSymbol) {
        OperationType operationType = OperationType.parse(operationSymbol);
        Operation actualOperation;
        switch (operationType) {
            case MULTIPLICATION:
                actualOperation = new Multiplication();
                break;
            case DIFFERENCE:
                actualOperation = new Difference();
                break;
            case DIVISION:
                actualOperation = new Division();
                break;
            case SUMMATION:
                actualOperation = new Sum();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operationSymbol);
        }
        return actualOperation;
    }
}
