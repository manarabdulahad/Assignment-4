import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: "); 
        String input = scanner.nextLine();
       
        String reversedStr = "";
        
        for (int i = 0; i < input.length(); i++) {
            reversedStr = input.charAt(i) + reversedStr;
          }
          
          System.out.println("Reversed string: "+ reversedStr);
        
        
        
        
     scanner.close();
                
            }
        }
            

