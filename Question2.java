import java.util.Scanner; //java statement

public class Question2 {
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);
        
        
        System.out.println("******* TO SHOW STUDENT MAJOR AND STATUS ********"); 
        System.out.println(" ");
        
        // output statement to give guide for user 
        System.out.println("   FIRST CHARACTER REPRESENT AS MAJOR   ");
        System.out.println("         CODE   MAJOR"           );
        System.out.println("          A     Accounting      ");
        System.out.println("          C     Computer Science");
        System.out.println("          I     Information Management ");
        System.out.println("   SECOND CHARACTER REPRESENT AS STATUS   ");
        System.out.println("         CODE   STATUS"           );
        System.out.println("          1     freshman      ");
        System.out.println("          2     sophomore");
        System.out.println("          3     junior ");
        System.out.println("          4     senior ");
        
        System.out.println(" ");
        
        System.out.print(" ENTER TWO CHARACTERS : ");
        String character = s.nextLine(); // declare character as string 
        
         // return substring from position 0 to position 1
         // declare letterCharacter as string
        String letterCharacter= character.substring(0, 2);
        
        // switch statement to check lettercharacters and determine the output 
         switch (letterCharacter) {

          case "A1 ":
           System.out.print(" Accounting freshman");
            break;
      
          case "A2":
            System.out.print( " Accounting sophomore");
            break;
            
           case "A3":
            System.out.print(" Accounting junior "); 
            break;
          
            case "A4":
            System.out.print(" Accounting senior "); 
            break;

           case"I1":
            System.out.print( " Information Management freshman"); 
            break;

           case"I2":
            System.out.print( " Information Management sophomore"); 
            break;

           case"I3":
            System.out.print( " Information Management junior"); 
            break;

           case "I4":
            System.out.print( " Information Management senior");
            break;

           case "C1":
            System.out.print( " Computer Science freshman"); 
            break;

            case"C2":
            System.out.print( " Computer Science sophomore"); 
            break;

            case"C3":
            System.out.print( " Computer Science junior");
            break;

            case"C4":
             System.out.print( " Computer Science senior");  
             break;
             
            default:
            System.out.println(" Invalid input");
             break;
            
            
        } 
        
        
    }
}