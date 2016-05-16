package chapter2.lesson9;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;


/**
 * Created by wangzhenhua on 16/5/7.
 */
public class Person {

    private String name;

    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == this ) {
            return true;
        }
        if ( obj == null ||
                obj.getClass() != getClass() ){
            return false;
        }

        if ( obj instanceof Person ){
            Person other = (Person)obj;
            if (Objects.equal(name, other.name) &&
                    Objects.equal(address,other.address))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects
                .toStringHelper(this)
                .omitNullValues()
                .add("name",name)
                .add("address",address)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name,address);
    }

    public static void main(String[] args){
        Person p = new Person();
        p.setAddress("test");
        p.setName("name");

        System.out.println(p.hashCode());

        Person a = new Person();
        a.setAddress("test");
        a.setName("name");

        System.out.println(a.hashCode());

        System.out.println(Objects.equal(a, p));

        System.out.println(p);


        Person c = new Person();
        c.setName("ccc");
        System.out.println(c);
    }


}
