import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Type two numbers");
            int firstNumber = Integer.parseInt(reader.readLine());
            int secondNumber = Integer.parseInt(reader.readLine());
            System.out.println("Type a symbol for your operation: '+', '-', '/', '*'");
            String operationSymbol = reader.readLine();
            Operation currentOperation = OperationFactory.getOperation(operationSymbol);
            int result = currentOperation.calculate(firstNumber, secondNumber);
            System.out.println(result);
        } catch(IOException|IllegalMathOperationException e) {
            e.printStackTrace();
        }
    }
}
