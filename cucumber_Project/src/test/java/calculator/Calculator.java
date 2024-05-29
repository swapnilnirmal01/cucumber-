package calculator;

public class Calculator {
	

	private int firstOperand;
    private int secondOperand;

    public void enter(int number) {
        if (firstOperand == 0) {
            firstOperand = number;
        } else {
            secondOperand = number;
        }
    }

    public int add() {
        return firstOperand + secondOperand;
    }

}
