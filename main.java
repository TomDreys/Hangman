import java.util.Scanner;

public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String word = "RANDOM";
        String output;
        boolean hasGuessed = false;
        
        while (!hasGuessed)
        {
            output = "";
            System.out.println("guess the word");
            String input = sc.nextLine();
            input +=  "       ";
            input = input.toUpperCase();
            
            for (int i = 0; i < word.length() && i < input.length(); i++)
            {
                if (word.charAt(i) == input.charAt(i))
                {
                    output += word.charAt(i);
                }
                
                else
                {
                    output += "?";
                }
            }
            
            output.toUpperCase();
            
            if (output.equals(word))
            {
                hasGuessed = true;
            }
            
            System.out.println(output);
        }
        
        System.out.println("You have guessed the word");
        
    }
}
