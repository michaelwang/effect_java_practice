package chapter2;

import java.io.*;

public class Lesson3 implements Serializable{

    private static final Lesson3 INSTANCE = new Lesson3();

    public static Lesson3 getInstance(){
        return INSTANCE;
    }

    private Lesson3(){
        if (INSTANCE != null){
            throw new RuntimeException();
        }
    }

    private Object readResolve() throws  ObjectStreamException{
        return INSTANCE;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, ClassNotFoundException {

        System.out.println("lesson3 from memory is : " +Lesson3.getInstance());

//        Lesson3 newLession3 = Lesson3.class.newInstance();
//        System.out.println(newLession3);



        FileOutputStream fo = new FileOutputStream("data.ser");
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(Lesson3.getInstance());

        FileInputStream fi = new FileInputStream("data.ser");
        ObjectInputStream si = new ObjectInputStream(fi);
        final Lesson3 lesson3 = (Lesson3) si.readObject();
        System.out.println("lesson3 from disk is :" + lesson3);

        fi = new FileInputStream("data.ser");
        si = new ObjectInputStream(fi);
        Lesson3 lesson3New = (Lesson3)si.readObject();
        System.out.println("lesson3 from disk again is : " + lesson3New);


    }



}
