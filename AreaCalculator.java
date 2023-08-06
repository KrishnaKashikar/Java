import java.util.Scanner;
public  class AreaCalculator{
    public static void main (String args[])
    {
        System.out.println("Shape Area Calculator V1.0");
        Scanner input= new Scanner(System.in);
        double option=0;
        do{
            System.out.println("***************************************");
            System.out.println();
            System.out.println("1) Rectangle");
            System.out.println("2) Square");
            System.out.println("3) Triangle");
            System.out.println("4) Circle");
            System.out.println("5) Circumference of circle");
            System.out.println("6)Quit");
            System.out.println("Which shape:");
            option=input.nextInt();
            input.nextLine();
            if(option==1)
            {
                System.out.println("You selected Rectangle Area Calculation:");
                System.out.println("Now continue with the Area calculation logic:");
                System.out.println("......");
                System.out.println("Please enter Rectangle  length:");
                double length=input.nextInt();
                System.out.println("Please enter Rectangle Breadth:");
                double breadth=input.nextInt();
                double area=area_rectangle(length,breadth);
                System.out.println(" Based on the values entered The Area of Rectangle is:"+area);
            }
                else if(option==2)
                {
                    System.out.println("You selected  Square Area Calculation:");
                    System.out.println("Now continue with the Area calculation logic:");
                    System.out.println("........");
                    System.out.println("Please enter Square Side Length:");
                    double side =input.nextInt();
                    double area=area_sqaure(side);
                    System.out.println(" Based on the values entered The Area of Square is:"+area);

                }
               else if(option==3)
               {
                   System.out.println("You selected Traingle Area Calculation:");
                   System.out.println("Now continue with the Area calculation logic:");
                   System.out.println(".........");
                   System.out.println("Please  enter traingle Base length:");
                   double base =input.nextInt();
                   System.out.println("Please enter  triangle Height length:");
                   double Height=input.nextInt();
                   double area=area_triangle(base,Height);
                   System.out.println("Based on the values entered  The area of traingle is:"+area);
               }
               else if(option==4)
               {
                 System.out.println("You selected  Circle Area Calculation:");
                 System.out.println("Now continue with the Area calculation logic:");
                 System.out.println("...........");
                 System.out.println("Please enter the Radius of the circle:");
                 double radius =input.nextInt();
                 double area=area_circle(radius);
                 System.out.println("Based on the value entered  The Area of Circle is:"+area);
               }
              else if(option==5)
              {
                System.out.println("You selected Circumfence of Circle Calculation");
                System.out.println("Now continue with the Area calculation logic:");
                System.out.println("..............");
                System.out.println("Please enter Radius of Circumference of circle:");
                double radius=input.nextInt();
                double circum=circum_circumferenceocircle(radius);
                System.out.println("Based  on tne value enterd  The Circumfence of Circle is:"+circum);
              }
              else if (option!=6){
                System.out.println("Invalid option");

              }


              }while(option!=6);
              input.close();
    }
              private  static double circum_circumferenceocircle(double radius){
                return (float)2*3.14*(radius);
              }
              private static double area_circle( double radius){
                return Math.PI*(radius*radius);

              }
              private static double area_triangle(double base,double height)
              {
                return .5*base*height;
              }
              private static double area_sqaure(double side)
              {
                return side*side;
              }

              private static  double area_rectangle(double length,double breadth){
                return  length*breadth;
              }


               }

