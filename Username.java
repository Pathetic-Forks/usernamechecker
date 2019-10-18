import  java.util.Scanner;

public class Username
{
  public static void main (String[] args)
  {
    System.out.println("Please enter a username that's at least 6 characters long and starts with U");
    
    Scanner scan = new Scanner(System.in);
    String username = scan.nextLine();

    if (username.length() < 6) {
      System.out.println("The username is not long enough!");
    } else if (!(username.substring(0, 1).equals("U"))) {
        System.out.println("The username needs to start with an uppercase U");
    } else {
        System.out.println("The username is fine!");
    }
  }
}
