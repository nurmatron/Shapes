package Shapes;

public class Circle {



    double radius= 0;
    final  double pi = 3.14;



    public Circle(double radius){
            this.radius = radius;


    }


    public double circumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public double area(){
        double area = radius * radius * pi;
        return area;
    }






    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }





}
