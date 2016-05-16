package chapter2;

/**
 * Created by wangzhenhua on 16/4/16.
 */
public enum  Lesson3_1 {

    INSTANCE;

    public Lesson3_1 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        final Lesson3_1 instance = Lesson3_1.INSTANCE;

        System.out.printf("instance is : %s",instance);
    }
}
