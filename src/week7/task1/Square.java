package week7.task1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }
    public String toString() {
        return null;
    }
    public int evaluate() {
         this.expression.evaluate();
        return this.expression.evaluate()*this.expression.evaluate();
    }
}
