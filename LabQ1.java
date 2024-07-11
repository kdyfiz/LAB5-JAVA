
/* QUESTION 1 (LAB 5)
 * SITI KHADIJAH ( 23 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement

public class LabQ1 { //class declaration
    public static void main (String [] args){
        Scanner s= new Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner
        
        System.out.println(" ");
        
        //prompt the user to enter a string
        System.out.print("     PLEASE ENTER A STRING: ");
        String input = s.nextLine(); // declare input as string 
        
        //prompt the user to enter the position of char
        System.out.print("     PLEASE CHECK CHAR AT POSITION : ");
        int position =s.nextInt(); // declare position as a integer
        
        System.out.println(" ");
        
        String message = input ; // declare message as string and initialize it = input
        int end = position+1; // declare end as int and calculate it 
        String value = message.substring (position,end); // declare value as string and return substring from the position at begin index to end at end index       
        System.out.println("Char value is : " +value); // output statement to display the value
        
           for(int i=0; i < value.length(); i++) { // to determine the value either number or letter
             Boolean flag = Character.isDigit(value.charAt(i));
            if(flag) {
            System.out.println("Char '"+ value.charAt(i)+"' is a number"); //output if it is a number
           }
            else {
            System.out.println("Char '"+ value.charAt(i)+"' is a letter");//output if it is a letter
           }
        }
        
        
        System.out.println("char position is:" + position); // output statement to display position
    }
}