import java.util.Scanner;
class myexce extends Ecxeption
{
    public myexce(String msg)
{
    super(msg);
}
}

public class exception{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        String a,b;
        System.out.println("enter the name");
        a=sc.next();
        System.out.println("enter the password");
        b=sc.next();
        
        int l=a.length();
        int lp=b.length();

        try{
            if(l<6){
                System.out.println("user name cannot be less tha 6 character");
            else 
                System.out.println("correct user name ");
            }
            if(lp<8){
                System.out.println("user name cannot be less tha 8 character");
            else 
                System.out.println("correct password");
            }
        }
        catch(myexce ex){
            System.out.println("exception occured"+ex);

        }

    }

} 