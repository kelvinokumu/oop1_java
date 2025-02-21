package g_simple_programs.calculator;

class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double performCalculation(double num1, double num2) {
        if (operation == null) {
            throw new IllegalStateException("No operation set");
        }
        return operation.calculate(num1, num2);
    }
}
