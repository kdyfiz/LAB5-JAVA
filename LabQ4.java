
public class LabQ4 {
    public static void main (String [] args){
   String name1 = "Universiti Putra Malaysia";
   String name2 = name1;
   String name3 = new String ("Universiti Putra Malaysia");
   String name4 = "Universiti Putra Malaysia";
   String s4;
 //Display suitable messages for the following expressions result.
 name2 = name3;
 System.out.println("a) Output name2 if name2 = name3 : "+name2);
 name1 = name2; 
 System.out.println("b) Output name1 if name1 = name2 : " +name1  );
 System.out.println("c) Name 1 equals name 2 is : " +name1.equals(name2));
 System.out.println("d) Name 2 equals name 3 is : " +name2.equals(name3));
 System.out.println("e) Comparision between name1 and name2 : " +name1.compareTo(name2));
 System.out.println("f) Comparision between name2 and name3 : " +name2.compareTo(name3));
 s4 = name1;
 System.out.println("g) Output s4 is : " +s4);
 System.out.println("h) Location index t in name1: " +name1.indexOf("t"));
 System.out.println("i) Location index a in name1: " +name1.indexOf("a"));
 System.out.println("j) Location index for last a in name1: " +name1.lastIndexOf("a"));
 System.out.println("k) Location index sit in name4: " +name4.indexOf("sit"));
 System.out.println("l) Location index for last i between 0-9 in name1: " + name1.lastIndexOf("i", 10));
 System.out.println("m) Character at index 4 in name3 : " +name3.charAt(4));
  name4 = name3.substring(0,3) + "any" ;
 System.out.println("n) New content for name 4 at index 0-2 : " +name4 );
 System.out.println("o) Name 1 equals name 4 is : " +name1.equals(name4));
 System.out.println("p) Length of name4 : " +name4.length());
 System.out.println("q) Output name1 start from index 5: " + name1.substring(5));
 System.out.println("r) Output name1 from index 5-10 : "  +name1.substring(5, 11));
 System.out.println("s) all string name2 in lower case : " +name2.toLowerCase());
 System.out.println("t) all string name3 in upper case : " +name3.toUpperCase());
 System.out.println("u)" + name2 == name3);
 char [] ch = name4.toCharArray();
 for (char cr : ch) {
 System.out.println("v) Character array for new element name4 : " +cr ); }

}}