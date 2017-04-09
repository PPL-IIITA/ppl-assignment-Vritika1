package ppl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;



public class search_couples_ques7 {
	 public String[]m1=new String[30];
	 public String[]m2=new String[35];
	 
	void search1() throws IOException 
	{
			int i=0;
	//	String[]m1=new String[30];
		String line1;
		BufferedReader in1=new BufferedReader ( new FileReader("couplehappiness.txt"));
		
		while((line1=in1.readLine())!=null)
		{
			String []var1=line1.split("\t\t");
			String nameg=var1[0];
			String nameb=var1[1];
			String h=var1[2];
			m1[i]=nameg;
			m1[i+1]=nameb;
			m1[i+2]=h;
			i=i+3;
		}
		in1.close();
		String line3;
		BufferedReader in3=new BufferedReader ( new FileReader("boys.txt"));
		 
		 while((line3=in3.readLine())!=null)
	{
			 int j=1;
			 int count=0;
		 while(j<30 && !m1[j].equals(line3))
		 {
			 j=j+3;
			 count++;
		 }
		if(count!=10)
		 {

				 System.out.print(line3);
				 System.out.print(" gf is ");
				 System.out.println(m1[j-1]);
		 }
	}
		 in3.close();
	}
	
	void search2() throws IOException
	{
		float []couple_happiness2=new float [10];
		String line12;
		int k=0;
		BufferedReader in12=new BufferedReader (new FileReader("couplehappiness.txt"));
		while((line12=in12.readLine())!=null)
		{
			String []var12=line12.split("\t\t");
			couple_happiness2[k]=Float.parseFloat(var12[2]);
			k++;
		}
		Arrays.sort(couple_happiness2);
		int i=0;
		int j=0;
		String line11;
		while(i<10)
		{
		BufferedReader in11=new BufferedReader (new FileReader("couplehappiness.txt"));
		while((line11=in11.readLine())!=null)
		{
			
			String []var11=line11.split("\t\t");
			float happ=Float.parseFloat(var11[2]);
			String nameg=var11[0];
			String nameb=var11[1];
			float shapp= couple_happiness2[i];
			if(happ==shapp)
			{
				m2[j]=nameg;
				m2[j+1]=nameb;
				m2[j+2]=String.valueOf(happ);
				System.out.print(m2[j]);
				System.out.print("\t\t");
				System.out.print(m2[j+1]);
				System.out.print("\t\t");
				System.out.println(m2[j+2]);
				j=j+2;
			}
		}
		in11.close();
		in12.close();
		i++;
		}
		}
	

void search3() throws IOException
{
String line1;
int i=0;
HashMap <String,String> details=new HashMap<String,String>();
BufferedReader in1=new BufferedReader (new FileReader("couplehappiness.txt"));
while((line1=in1.readLine())!=null)
{
String []var=line1.split("\t\t");
details.get(i);
details.put(var[0], var[1]);
i++;
}
in1.close();
System.out.println(details);
}
	
}

