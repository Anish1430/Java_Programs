/*

You have give a string in that you need to capitalize the first character of the string .

Input Format

A string is given

Constraints

1<=len(string)<=5000

Output Format

First letter capitalized String

Sample Input 0

raushan is doing Btech
Sample Output 0

Raushan Is Doing Btech
Explanation 0

In above test case you can see that first letter of raushan is small so we need to capitalize it similarly for is ,doing and Btech

**R**aushan **I**s **D**oing Btech

 */


import java.util.*;

public class CapitalizeFirstLetterOfTheString {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
             str = " "  + str;     //String mai space add....
          String space="";
           for(int i=0;i<str.length();i++)  {
                 char ch=str.charAt(i);

                 if(ch == ' ') {
                      space= space + ch;
                        i++;
                        ch=str.charAt(i);
                        space =space + Character.toUpperCase(ch);
                 }else {
                     space = space + ch;
                 }
           }
              space = space.trim();
             System.out.println(space);
    }
}
