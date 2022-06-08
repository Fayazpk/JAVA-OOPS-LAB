import arithop.multiplication;
import arithop.addition;
import arithop.substration;
import arithop.division;
import java.util.Scanner;
public class maths
{
    public static void main(String args[])
    {
        addition a=new addition();
        substration s=new substration();
        multiplication m=new multiplication();
        division d=new division();
        Scanner sc=new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.exit\nenter your choice:");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                       a.operation();
                       break;
                case 2:
                       s.operation();
                       break;
               case 3:  
                       m.operation();
                       break;
                case 4:
                       d.operation();
                       break;
                case 5:break;
                default:System.out.println("invalid choice"); 
    
            }
        }while(opt!=5);
    }
    }



