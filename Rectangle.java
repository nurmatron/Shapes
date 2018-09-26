package Shapes;

public class Rectangle {
    private double a,b ;



    public Rectangle(double a, double b){
            this.a = a;
            this.b = b;

    }


            public void calcArea(){
                double area = a * b;
                System.out.println("The area of your rectangle is : " +  area);
            }


public double calcCircumference(){
        double circ = a *2 + b*2;
    System.out.println("The circumference of your rectangle is : " + circ);

    return circ;
}











    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }




}




