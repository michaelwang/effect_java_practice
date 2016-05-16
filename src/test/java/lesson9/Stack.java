package lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangzhenhua on 16/5/8.
 */

public class Stack {

    chapter2.lesson11.Stack stack;

    @Before
    public void init()
    {
        stack = new chapter2.lesson11.Stack();
    }

    @Test
    public void pop(){
        stack.push("2");
        stack.push("3");
        Assert.assertEquals("3", stack.pop());
        Assert.assertEquals("2", stack.pop());
        for (int i = 0; i < 1000000; i++) {
            stack.push(i);
        }

        for (int i = 1000000 - 1; i >= 0 ; i--) {
            Assert.assertEquals(i,stack.pop());
        }
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {

        for (int i = 0; i < 1000000; i++) {
            stack.push(i);
        }

        chapter2.lesson11.Stack s = stack.clone();
        s.push("3");

        Assert.assertEquals(1000000 - 1, stack.pop());
        Assert.assertEquals("3",s.pop());

    }

}
