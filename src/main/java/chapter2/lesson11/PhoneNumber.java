package chapter2.lesson11;

import com.google.common.base.Objects;

/**
 * Created by wangzhenhua on 16/5/8.
 */
public class PhoneNumber implements Cloneable{

    private String area;

    private String number;

    public PhoneNumber(String area,String number)
    {
        this.area = area;
        this.number = number;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected PhoneNumber clone() throws CloneNotSupportedException {
        return (PhoneNumber)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (Objects.equal(area,that.area) &&
                Objects.equal(number, that.number) ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(area,number);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneNumber phoneNumber = new PhoneNumber("0512","34531234");

        PhoneNumber phoneNumberCopy = phoneNumber.clone();

        System.out.println(Objects.equal(phoneNumber, phoneNumberCopy));

    }

}
