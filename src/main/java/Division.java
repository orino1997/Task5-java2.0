public class Division extends Operation{
    public int calculate(int firstNumber, int secondNumber) {
        int result = -1;
        try {
            result = firstNumber / secondNumber;
        } catch(ArithmeticException ex) {
            System.out.println("You cannot perform 'by zero division'. Your return result will be negative - '-1'");
        }
        return result;
    }
}
