//Reverse a String Without changing the special characters


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 
public class StringReversewithoutspecialcharacter
{ 
        public static void reverse(char str[]) 
        { 
                // Initialize left and right pointers 
                int r = str.length - 1, l = 0; 

                // Traverse string from both ends until 
                // 'l' and 'r' 
                while (l < r) 
                { 
                        // Ignore special characters 
                        if (!Character.isAlphabetic(str[l])&&!Character.isDigit(str[l]))
                        l++;
                        
                        else if (!Character.isAlphabetic(str[r])&&!Character.isDigit(str[r]))
                                r--;
                        
                        // Both str[l] and str[r] are not spacial 
                        else
                        { 
                                char tmp = str[l]; 
                                str[l] = str[r]; 
                                str[r] = tmp; 
                                l++; 
                                r--; 
                        } 
                } 
        } 

        public static void main(String[] args) 
        { Scanner sc=new Scanner(System.in);
                String str =sc.nextLine();
                char[] charArray = str.toCharArray(); 
                reverse(charArray);
                System.out.println(charArray); 
        } 
} 


