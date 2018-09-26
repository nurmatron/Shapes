package Shapes;

public class Triangle {


        private double height = 0;
    private double base = 0;





public Triangle(double height, double base){
    this.base = base;
    this.height = height;



}

        public double triHypo (){

            Double hypotenuse = Math.pow(Math.pow(base, 2)
                    + Math.pow(height, 2),0.5);
            return hypotenuse;
        }






        public void calcAreatri(){
            double triArea = 0.5 *base *height;
            System.out.println("The area of your triangle is : " + triArea);
        }

public  void calcCircTri(){
   double triCirc = base + height  + triHypo();

    System.out.println("The perimeter of you triangle is : " + triCirc);


}









    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }



}
