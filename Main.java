package Shapes;

        import java.util.InputMismatchException;
        import java.util.Scanner;

public class Main {
    static    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Menu.startMenu();
        while (true){
            String sw = sc.next();
            boolean inputfail = true;
            switch (sw){
                case "1" :
                    String rad = "";
                    double rad1 = 0;
                    while (inputfail) {
                        System.out.println("You picked a circle, please give your circle a radius.");
                        rad = sc.next();
                        try {
                            rad1 = Double.parseDouble(rad);
                            inputfail = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Sorry, please assign your radius again.");
                        }
                    }
                    Circle c1 = new Circle(rad1);
                    Menu.circleMenu();
                    boolean calcs = true;
                    while (calcs) {
                        sw = sc.next();
                        switch (sw) {

                            case "1":
                                System.out.println("The circumference of your circle is :" +  c1.circumference());
                                Menu.circleMenu();
                                break;

                            case "2":
                                System.out.println("The area of your circle is : "  + c1.area());
                                Menu.circleMenu();
                                break;

                            case "3":
                                Menu.startMenu();
                                calcs = false;
                                break;
                            default:
                                System.out.println("Sorry, unrecognized option.");
                                break;
                        }
                    }
                    break;


                case "2" : // rectangle
                    String recLenght = "";
                    String recWith = "";
                    double sidea=0, sideb=0;
                    boolean inputfail1 = true;
                    while (inputfail1) {
                        System.out.println("You picked a rectangle.\n" +
                                "Please assign the rectangles length : ");
                        recLenght = sc.next();
                        System.out.println("Now give the rectangle a width : ");
                        recWith = sc.next();
                        try {
                            sidea = Double.parseDouble(recLenght);
                            sideb = Double.parseDouble(recWith);
                            inputfail1 =false;
                        } catch ( NumberFormatException e) {
                            System.out.println("Sorry, one or more of your sides where not numbers, please try again.");
                        }
                    }
                    Rectangle r1= new Rectangle(sidea, sideb ) ;
                    Menu.recMenu();
                    boolean calcsrec = true;
                    while (calcsrec) {
                        sw = sc.next();
                        switch (sw) {
                            case "1":
                                r1.calcArea();
                                Menu.recMenu();
                                break;
                            case "2":
                                r1.calcCircumference();
                                Menu.recMenu();
                                break;
                            case "3":
                                Menu.startMenu();
                                calcsrec = false;
                                break;
                            default:
                                System.out.println("Sorry, unrecognized option.");
                                break;
                        }
                    }
                    break;


                case "3" : // triangle
                    String triHeight = "";
                    String triBase = "";
                    double triH=0, triB=0;
                    boolean inputfail12 = true;
                    while (inputfail12) {
                        System.out.println("You picked a triangle.\n" +
                                "Please assign the triangles base : ");
                        triBase = sc.next();
                        System.out.println("Now give the rectangle a height : ");
                        triHeight = sc.next();
                        try {
                            triB = Double.parseDouble(triBase);
                            triH = Double.parseDouble(triHeight);
                            inputfail12 =false;
                        } catch ( NumberFormatException e) {
                            System.out.println("Sorry, one or more of your inputs where not assigned numbers, please try again.");
                        }
                    }
                   Triangle t1 = new Triangle(triH,triB);
                    Menu.recMenu();
                    boolean calcstri = true;
                    while (calcstri) {
                        sw = sc.next();
                        switch (sw) {
                            case "1":
                                t1.calcAreatri();
                                Menu.triMenu();
                                break;
                            case "2":
                                t1.calcCircTri();
                                Menu.triMenu();
                                break;
                            case "3":
                                Menu.startMenu();
                                calcstri = false;
                                break;
                            default:
                                System.out.println("Sorry, unrecognized option.");
                                break;
                        }
                    }
                    break;

                case "4":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, unrecognized option.");
                    Menu.startMenu();
                    break;








            }




        }










    }
}
