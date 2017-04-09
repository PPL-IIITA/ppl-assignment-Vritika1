package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ques10_random {

	
	void random() throws IOException
	{
		 int []essential1={0,0,0,0,0,0,0,0,0,0};
		 int []utility1={0,0,0,0,0,0,0,0,0,0};
		 int []luxury1={0,0,0,0,0,0,0,0,0,0};
		String line14;
		BufferedReader in14=new BufferedReader ( new FileReader("ques9_couple.txt"));
		line14=in14.readLine();
		double dn=1+(Math.random()*(10-1));							
		int n=(int)dn;
		System.out.println("The value of n is "+n);
		for(int p=0;p<n-1;p++)
		{
			line14=in14.readLine();	
		}
		in14.close();
		FileWriter fstream1=new FileWriter ("ques10_couple.txt");
		BufferedWriter d1=new BufferedWriter(fstream1);
		String[]var=line14.split("\t\t");
		d1.write(var[0]);
		d1.write("\t\t");
		d1.write(var[2]);
		d1.write("\t\t");
		d1.write(var[4]);
		d1.close();
		
		BufferedReader in =new BufferedReader(new FileReader("ques10_couple.txt"));
		BufferedReader in1 =new BufferedReader(new FileReader("gifts.txt"));
		String s;
		String t;
		int price11=0;
		int price22=0;
		int price33=0;
		int i=0;
		int []sum1={0,0,0,0,0,0,0,0,0,0};
//		FileWriter fstream=new FileWriter ("giftsxchg.txt");
//		BufferedWriter d11=new BufferedWriter(fstream);	
//		FileWriter fstream11=new FileWriter ("boyhappiness.txt");
//		BufferedWriter d2=new BufferedWriter(fstream1);	
		
		t=in1.readLine();
		while(t!=null)
		{
			String []var1=t.split("\t");
			price11=Integer.parseInt(var1[0]);
			price22=Integer.parseInt(var1[2]);
			price33=Integer.parseInt(var1[4]);
			t=in1.readLine();
		}
		
		while((s=in.readLine())!=null  && !s.isEmpty() )
		{
			String []var2=s.split("\t\t");	
			int budget=	Integer.parseInt(var2[2]);
			String nameg=var2[0];
			String nameb=var2[1];
			int price1=price11;
			int price2=price22;
			int price3=price33;
	//		System.out.println(budget);
			if(budget==price1)
			{
				sum1[i]=price1;
				essential1[i]=1;
			}
			else if(budget>price1)
			{
				sum1[i]=price1;
				budget=budget-price1;
				essential1[i]=1;
					if(budget>=price2)
					{
						sum1[i]=sum1[i]+price2;
						budget=budget-price2;
						utility1[i]=1;
							if(budget>=price3)
							{
								sum1[i]=sum1[i]+price3;
								luxury1[i]=1;
							}
							
					}
			}
			else
				sum1[i]=0;
			System.out.print(nameg);
			System.out.print("\t\t");
			System.out.print(nameb);
			System.out.print("\t\t");
			System.out.println(sum1[i]);
			i++;
		}
	in.close();
	in1.close();
	}
}
