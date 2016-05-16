package chapter6;

/**
 * Created by wangzhenhua on 16/5/14.
 */
public enum Operation {
    PLUS,MINUS,TIMES,DIVED;

    double apply(double x ,double y){
        switch (this){
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVED: return x / y;

        }
        throw new AssertionError("Unkonwn op:" + this);
    }

    public static void main(String[] args) {
        System.out.println(Operation.DIVED.apply(3,4));
        System.out.println(Operation.PLUS.apply(3,4));
        System.out.println(Operation.TIMES.apply(3,4));
    }

}
