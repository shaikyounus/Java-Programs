import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    count(s);
	}
	static void count(String s)
	{int count1=0;
	int count2=0;
	int count3=0;
	    char[] a=s.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	        if(Character.isAlphabetic(a[i]))
	        {
	            count1=count1+1;
	        }
	        if(Character.isDigit(a[i]))
	        {
	            count2=count2+1;
	        }
	        if(Character.isAlphabetic(a[i])||Character.isDigit(a[i]))
	        {
	            count3=count3+1;
	        }
	    }
	    System.out.println(count1);System.out.println(count2);System.out.println(count3);
	}
	

}