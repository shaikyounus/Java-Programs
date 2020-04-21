import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SplCount {
        
        public static void count(char ch[])
        {
                
        
        int l=ch.length;
                int sum=0;
        for(int i=0;i<l;i++)
        {
         if(!Character.isAlphabetic(ch[i])&&!Character.isDigit(ch[i]))
         {
                 
                 sum=sum+1;
            }
        
        }
          
                if(sum%2==0)
                {
             for(int i=0;i<l;i++)
             {
              if(Character.isDigit(ch[i]))
              {
                      if(ch[i]%2==0)
                      {
                        //o[i]=ch[i];
                           System.out.print(ch[i]);
                      }
              }
             }
                     for(int i=0;i<l;i++)
             {
              if(Character.isDigit(ch[i]))
              {if(ch[i]%2==1)
                      {
                              //e[i]=ch[i];
                              System.out.print(ch[i]);
                      }
              }
                     }
             }
                else
                {
                         for(int i=0;i<l;i++)
             {
              if(Character.isDigit(ch[i]))
              {if(ch[i]%2==1)
                      {
                              //e[i]=ch[i];
                              System.out.print(ch[i]);
                      }
              }
                     }
                        for(int i=0;i<l;i++)
             {
              if(Character.isDigit(ch[i]))
              {
                      if(ch[i]%2==0)
                      {
                        //o[i]=ch[i];
                           System.out.print(ch[i]);
                      }
              }
             }
                        
                        
                }
        }
        
               

        
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char[] ch=s.toCharArray();
            count(ch);
            
            
            
            
            
            
            
    }

}
