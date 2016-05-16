package chapter6;

/**
 * Created by wangzhenhua on 16/5/14.
 */
public enum OperationImprove {

    PLUS { double apply(double x,double y) { return x + y ;}},
    MINUS { double apply(double x,double y) { return x - y ;}},
    DIV { double apply(double x, double y) { return x / y ;} },
    TIMES { double apply(double x ,double y) { return x * y ;} } ;

    abstract double apply(double x ,double y);

    public static void main(String[] args) {
       System.out.println( OperationImprove.DIV.apply(5,4) );
       System.out.println( OperationImprove.TIMES.apply(5,4) );
       System.out.println( OperationImprove.PLUS.apply(5,4) );
       System.out.println( OperationImprove.MINUS.apply(5,4) );
    }
}
