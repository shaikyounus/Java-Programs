


import java.util.*;
public class Main
{
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		for(int i=0;i<=n;i++)
		{
		    s=sc.nextLine();
		    
		}
		if(check(s))
		{
		    System.out.println("Balanced");
		}
        else{
            System.out.println("Not Balanced");
        }
		
		
		
	}
	
	
	//Function to check //
	public static boolean check(String s)
	{
	   	Stack<Character> St=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)=='{')||(s.charAt(i)=='(')||(s.charAt(i)=='['))
		{
		  St.push(s.charAt(i));//First push all the open curly into stack//
		}
	    
		}
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')')
            {
                if(St.empty())
                    return false;
                switch(s.charAt(i))
                {
                    // For close square we should have last element open square oherwise not balanced
                    case ']':
                        if (St.pop() != '[')
                            return false;
                        break;
                    // For close curly brace we should have last element open square oherwise not balanced
                    case '}':
                        if (St.pop() != '{')
                            return false;
                        break;
                    // For close paren brace we should have last element open square oherwise not balanced
                    case ')':
                        if (St.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
 
		}
	

}
if(St.isEmpty())//If there are no brackets
{
	return true;		
	}
	return false;//If there are open brackets but not closed one
  }
	
}
