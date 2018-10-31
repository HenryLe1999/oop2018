package week7.task1;

public class Subtraction extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Subtraction(Expression firstExpression, Expression secondExpression){
        left = firstExpression;
        right = secondExpression;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
