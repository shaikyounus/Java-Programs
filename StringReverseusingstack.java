


import java.util.*;
public class StringReverseusingstack
{
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//char[] ch=s.toCharArray();
		Stack st=new Stack();
		for(int i=0;i<s.length();i++)
		{
		    st.push(s.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{
		    System.out.print(st.pop());
		}
	}
}