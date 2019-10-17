import  java.util.Scanner;

public class Username
{
  public static void main (String[] args)
  {
    System.out.println("Please enter a username that's at least 6 characters long and starts with U");
    
    Scanner scan = new Scanner(System.in);
    String username = scan.nextLine();
    
    int count = 0;
    for (int i = 0; i < username.length(); i++) {
    } if (i < 6); {
      System.out.println("This username is invalid");
    }
  }
}
