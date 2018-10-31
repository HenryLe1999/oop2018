package week7.task1;

public class Subtraction extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Subtraction(Expression firstExpression, Expression secondExpression){
        left = firstExpression;
        right = secondExpression;
    }
    public Expression left() {
        return left;
    }
    public Expression right() {
        return right;
    }
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
