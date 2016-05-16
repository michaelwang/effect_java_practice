package chapter2;

public class Lesson2 {

    private String property1;

    private String property2;

    private String property3;

    private String property4;

    public static class Builder{
        private String property1;

        private String property2;

        private String property3;

        private String property4;

        public Builder property1(String p){
            this.property1 = p;
            return this;
        }

        public Builder property2(String p){
            this.property2 = p;
            return  this;
        }


        public Builder property3(String p){
            this.property3 = p;
            return  this;
        }


        public Builder property4(String p){
            this.property4 = p;
            return  this;
        }

        public Lesson2 build(){
            return new Lesson2(this);
        }

    }

    public Lesson2(Builder builder){
        this.property1 = builder.property1;
        this.property2 = builder.property2;
        this.property3 = builder.property3;
        this.property4 = builder.property4;
    }

    private Lesson2() {
    }

    @Override
    public String toString() {
        return "Lesson3{" +
                "property1='" + property1 + '\'' +
                ", property2='" + property2 + '\'' +
                ", property3='" + property3 + '\'' +
                ", property4='" + property4 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2.Builder()
                                     .property1("1")
                                     .property2("2")
                                     .property3("3")
                                     .property4("4")
                                     .build();
        System.out.println(lesson2);

        try {
            Lesson2.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
