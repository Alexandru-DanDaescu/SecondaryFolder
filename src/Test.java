import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if its palindrome or not.");
        String string = sc.nextLine();
        System.out.println(isPalindrome(string)? string+" is palindrome" : string +" is not palindrome");

        System.out.println("Enter two numbers to add");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }

    private static boolean isPalindrome(String str)
    {
     String rev = "";
     boolean ans = false;
     for(int i = str.length() - 1;i>=0;i--) rev  += str.charAt(i);
     if(rev.equals(str)) ans = true;
     return ans;
    }


}
