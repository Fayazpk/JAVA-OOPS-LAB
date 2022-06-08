import java.util.Scanner;
class  myexception extends Exception
{
    public myexception(String msg)
    {
super(msg);
    }
} 
 class check
{
  
        String username, password;
        Scanner s = new Scanner(System.in);
        void get() throws myexception
        {
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals("fayaz") && password.equals("12345"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            throw new myexception("Authentication Failed");
        }
    }
}

class exce
{
public static void main(String args[])
{
check c=new check();
try
{
c.get();
}
catch(myexception u)
{
System.out.println("Exception occured\n"+u);    
}
}
}