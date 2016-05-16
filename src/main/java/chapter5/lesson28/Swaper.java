package chapter5.lesson28;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzhenhua on 16/5/13.
 */
public class Swaper {

    static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dddd");
        list.add("aaaa");
        System.out.println(list);
        Swaper.swap(list, 0, 1);
        System.out.println(list);
    }

}
