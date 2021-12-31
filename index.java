import java.util.Scanner;
import java.awt.Frame;
class calc{
    public static void main( )
    {
    int m,a,b,c,d;
    Frame f = new Frame();  
    f.setVisible(true);
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter your choice");
    System.out.println("1 for addition - 2 for Subtraction -");
    System.out.println("3 for Multiplication - 4 for division");
     m=sc.nextInt();
    switch(m){
        case 1:
        System.out.println("Enter First value for addition");
        a=sc.nextInt();
        System.out.println("Enter Second value");
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
        break;
        
        case 2:
        System.out.println("Enter first value for Subtraction");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        c=a-b;
        System.out.println("Your Output");
        System.out.println(c);
        break;

        case 3:
        System.out.println("Enter first value for Multiplication");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        c=a*b;
        System.out.println("Your Output");
        System.out.println(c);
        break;
        
        case 4:
        System.out.println("Enter first value for Division");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        c=a/b;
        System.out.println("Your Output");
        System.out.println(c);
        break;}
        
        
    }
    }
    

 
