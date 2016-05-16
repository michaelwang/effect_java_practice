package chapter6;

/**
 * Created by wangzhenhua on 16/5/14.
 */
public enum Planet {
    MECURY(3.302e+23,2.439e6),
    EARTH (5.975e+24,6.37e6),
    VENUS (4.869e+24,6.052e6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;

    Planet(double mass,double radius){
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass(){
        return mass;
    }

    public double radius(){
        return  radius;
    }

    public double surfaceGravity(){
        return surfaceGravity;
    }

    public double surfaceGravityWeight(double mass){
        return mass * surfaceGravity;
    }

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("56.99");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p: Planet.values())
            System.out.printf("Weight on %s is %f%n",p,p.surfaceGravityWeight(mass));
    }
}
