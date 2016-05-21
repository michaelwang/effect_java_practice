package chapter2.lesson12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wangzhenhua on 16/5/9.
 */
public class WordList {

    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>();
        String[] arg = {"e","a","f"};
        Collections.addAll(s,arg);
        System.out.println(s);
    }

}
