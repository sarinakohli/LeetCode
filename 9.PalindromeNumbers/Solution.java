import java.util.Scanner;
class Solution 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        int word = s.nextInt();
        s.close();
        System.out.println(isPalindrome(word));
    }
    public static boolean isPalindrome(int x) 
        {
            String xx = Integer.toString(x);
            for(int i = 0; i <= xx.length()-1; i++)
            {
                if(xx.length() == 1)
                {
                    return true;
                }
                else if(xx.charAt(i) == (xx.charAt(xx.length()-1)))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            return false;
        }
}
