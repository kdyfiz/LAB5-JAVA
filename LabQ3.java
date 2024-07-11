// By Siti khadijah (LAB 5 QUESTION 3)

import java.util.Scanner; //java statement


public class LabQ3 { //class declaration
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);//scanner object
                                           //to read the input by user
                                           // s is the shortcut of scanner
        //prompt the user to enter message 
        System.out.print(" ENTER MESSAGE : ");
        String input = s.nextLine(); // message that user input
                                    // declare input as string 

        System.out.println("    CODE       OPTION "           );
        System.out.println("     1         obtain length of the string");
        System.out.println("     2         retrieve individual character");
        System.out.println("     3         concatenate string"); 
        System.out.println("     4         extract substring");
        System.out.println("     5         compare the Strings using equals () method ");
        System.out.println("     6         compare the Strings using compareTo () method ");
        System.out.println("     7         compare the character using equals () method ");
        System.out.println("     8         compare the character using compareTo () method");
        System.out.println("     9         change the string to lower and upper case letters ");
        System.out.println("     10        find first character and last character in a string ");
        System.out.println("     11        do conversion from char and numeric to a string ");
        System.out.println("     12        do conversion from String to numeric ");
        System.out.println("     13        add new contents to a string ");
        System.out.println("     14        add new contents to a specified index location in a string ");
        System.out.println("     15        replace substring in a specified index location in a string ");
        System.out.println("     16        delete a character ");
        System.out.println("     17        delete a substring ");
        
  
        System.out.print(" ENTER CODE: "); //prompt the user to enter code base on option they want
        int code = s.nextInt(); // declare code as integer
        
        String output = "";
        String output1 = "";
                
          switch (code) {

            case 1: //obtain length of the string 
             output =" The length of " +input + "is : " + input.length();
             break;
      
            case 2: //retrieve individual character
             System.out.print(" Choose index: "); // To get the index
             int index_case2= s.nextInt(); // index in case 2
  
             //output to display character from index user choose
             output ="Character from " + input+ " at index " + index_case2 + " is " + input.charAt(index_case2) ;
             break;
            
            case 3: //concatenate string
             System.out.print(" INPUT ANOTHER MESSAGE : ");
             String inputCase3 = s.next(); //inputCase3 is another message to concate with input
            
             String messageC3 = input.concat(inputCase3); //new message after concate the string 
             output = " NEW MESSAGE IS : " + messageC3;
             break;
          
            case 4://extract substring
             System.out.print(" Enter message to add : "); 
             String inputCase4= s.next(); // message to add in case 4
            
             System.out.print(" Start from index: "); 
             int begin= s.nextInt();// start index to return 
            
             System.out.print(" End with index : "); 
             int end= s.nextInt();// end index to return
            
             String messageC4= input.substring(begin,end + 1) + inputCase4; // string to return with new message user input
             output = messageC4;            
             break;

            case 5: //compare the Strings using equals () method
             System.out.print(" INPUT ANOTHER MESSAGE : "); //promp the user to input another message
             String inputCase5 = s.next(); // another message for case 5
            
               if (input.equals(inputCase5) ) { // to check condition input equals with inputCase5 or not and show output 
                output = "first message and second message have same content"; }
              else { 
                output =" first message and second message are not same content"; 
              }
             break;

            case 6: //compare the Strings using compareTo () method
             System.out.print(" INPUT ANOTHER MESSAGE : "); //promp the user to input another message
             String inputCase6 = s.next(); // another message for case 6
              // to compare first message with another message either first message greater, equals or less than second message 
              if (input.compareTo(inputCase6)> 0 ) { 
                output =" first message is greater than second message"; } 
              else if (input.compareTo(inputCase6)== 0 ) {
                output =" first message and second message have same content"; }
              else {
                output =" first message is less than second message"; 
              }
             break;

            case 7://compare the character using equals () method
             System.out.print( "CHARACTER AT INDEX: "); //promp the user to input index of character  
             int index1_case7  = s.nextInt(); //index of first character user choose in case 7  
            
             System.out.print( "CHARACTER AT INDEX : "); //promp the user to input index of character  
             int index2_case7 = s.nextInt(); //index of second character  user choosein case 7 
            
             char ch1_C7=input.charAt(index1_case7); // to get first character user choose  ; ch1_C7 is first character in case 7
             char ch2_C7=input.charAt(index2_case7); // to get second character  user choose ; ch2_C7 is second character in case 7
            
             Character c1 = new Character(ch1_C7);
             Character c2 = new Character(ch2_C7);
            
             boolean res =c1.equals(c2); // boolean to determine first character equals with second character is true or false    
             
             // get the res value
             output ="OUTPUT :" +c1 + " and " + c2 + " are equal is " + res;
             break;

            case 8://compare the character using compareTo () method
             System.out.print( "CHARACTER AT INDEX: "); //promp the user to input index of character  
             int index1_case8  = s.nextInt();//index of first character user choose in case 8  
            
             System.out.print( "CHARACTER AT INDEX : "); //promp the user to input index of character  
             int index2_case8 = s.nextInt();//index of second character user choose in case 8 
            
             char C1_C8=input.charAt(index1_case8);// to get first character user choose  ; ch1_C8 is first character in case 8
             char C2_C8=input.charAt(index2_case8);// to get second character  user choose ; ch2_C8 is second character in case 8
            
             Character ch1 = new Character(C1_C8);
             Character ch2 = new Character(C2_C8);
              // to compare first character with another character either first character greater, equals or less than second character 
               if (ch1.compareTo(ch2)> 0 ) { 
                output =" first character is greater than second character"; }
              else if (ch1.compareTo(ch2)== 0 ) {
                output =" first character and second character have same content"; }
              else {
                output =" first character is less than second character"; 
              }
             break;
            
            case 9://change the string to lower and upper case letters
             String sU = input.toUpperCase() ; // to change the string to upper case
             String sL = input.toLowerCase() ; // to change the string to lower case
            
             output = sU ; 
             output1 = sL; 
             break;

            case 10: // find first character and last character in a string
     
            int n = input.length();// Finding string length
            char first = input.charAt(0);// First character of a string
            char last = input.charAt(n - 1);// Last character of a string
  
             // Printing first and last character of a string
             output ="First character is : " + first;
             output1 ="Last character is : " + last;
             break;

            case 11: // do conversion from char and numeric to a string
             System.out.print( " Input character : " ); //promp the user to input character
             char ch_C11 = s.next().charAt(0); // ch_C11 is character at case 11
          
             String messageC11 = Character.toString(ch_C11); // to change character to string
            
             output = " Character '" + ch_C11+ "' to string is " + messageC11;
            
             System.out.print( " Input numeric : " );  //promp the user to input numeric
             int num = s.nextInt(); 
            
             output1 = " Numeric '" + num+ "' to string is " + num + ""; // to change numeric to string and make a message for output
             break;
            
            case 12: // do conversion from String to numeric
             double numeric = Double.parseDouble(input);  // convert string into numeric
             output =" String " + input + "in numeric is " +numeric ;
             break;
             
            case 13:// add new contents to a string
             System.out.print( " NEW CONTENTS : "); //promp the user to input new content
             String new_case13 = s.next (); // new contents in case 13
             output =" New message is : " +input + new_case13;  // add new contents into message          
             break;

            case 14: // add new contents to a specified index location 
             System.out.print( " NEW CONTENTS : "); //promp the user to input new content
             String new_case14= s.next (); // new contents in case 14
            
             System.out.print( " ADD NEW CONTENTS AT INDEX  : "); //promp the user to enter index to input new content
             int index_case14= s.nextInt ();//index_case14 is index in case 14
            
             String new_input = input.substring (0, index_case14) + new_case14 + input.substring(index_case14) ; // to add new contents to a specified index location that user choose
             output = " New message is : " + new_input ;
             break;

            case 15: // replace substring in a specified index location in a string
             System.out.print( " SUBSTRING TO REPLACE :"); //promp the user to enter substring (message) to replace
             String messagC15 = s.next(); // substring (new message) to replace in case 15
            
            
             System.out.print( " START REPLACE SUBSTRING AT INDEX  :"); //promp the user to enter index to start replace
             int index1_case15 = s.nextInt(); // index1_case15 = index to start replace in case 15
             
             System.out.print( " END REPLACE SUBSTRING AT INDEX  :"); //promp the user to enter index to end replace
             int index2_case15 = s.nextInt(); // index2_case15 = index to end replace in case 15
            
             String index = input.substring(index1_case15 ,index2_case15 +1); // to replace substring in a index location that user choose in a string
             output = " New substring is : " +input.replace (index, messagC15) ;       
             break;
             
            case 16: // delete a character
             System.out.print( "DELETE CHARACTER AT INDEX : "); // promp the user to enter index of character that they want to delete
             int index_case16 = s.nextInt(); // index_case16 is index that user input in case 16
            
             StringBuilder MyString = new StringBuilder(input);// create a StringBuilder object with a String pass as parameter
             MyString = MyString.deleteCharAt( index_case16 ); // to remove the Character from index that user choose in case 16
             output =" New message is: " + MyString; 
             break;

            case 17: //delete a substring
             System.out.print( " SUBSTRING TO REMOVE : ");// promp the user to enter substring that they want to delete
             String inputCase17 = s.next(); // inputCase17 is substring that user input to delete from message 
             
             output = "Modified String: " + input.replaceAll(inputCase17, "");  // to delete substring from message
             break;
             
            default:
             output =" Invalid input"; // show invalid input if case user choose not between 1-17
             break;
            
            
        } 
         System.out.println ( output ); // print output from each case 
         System.out.println ( output1 ); // print second output from each case 
         
    }
}
