package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class boys extends girls{
	public String name2;
	public int attractiveness2;
	public int maintenance_budget;
	public int intelligence2;
	public int []happiness={0,0,0,0,0,0,0,0,0,0};
	public int []essential={0,0,0,0,0,0,0,0,0,0};
	public int []utility={0,0,0,0,0,0,0,0,0,0};
	public int []luxury={0,0,0,0,0,0,0,0,0,0};
	void pairing() throws IOException
	{
		
		String line1;
		String line2;
		String line3;
		String line4;
		String line5;
		String line6;
		String line7;
		String line8;
		BufferedReader in1=new BufferedReader (new FileReader("girls.txt"));
		BufferedReader in2=new BufferedReader ( new FileReader("boys.txt"));
		BufferedReader in3=new BufferedReader (new FileReader("girls_maintenance.txt"));
		BufferedReader in4=new BufferedReader (new FileReader("boys_budget.txt"));
		BufferedReader in5=new BufferedReader (new FileReader("girls_attractiveness.txt"));
		BufferedReader in6=new BufferedReader (new FileReader("boys_attractiveness.txt"));
		BufferedReader in7=new BufferedReader (new FileReader("girls_intelligence.txt"));
		BufferedReader in8=new BufferedReader (new FileReader("boys_intelligence.txt"));
		line1=in1.readLine();
		line2=in2.readLine();
		line3=in3.readLine();
		line4=in4.readLine();
		line5=in5.readLine();
		line6=in6.readLine();
		line7=in7.readLine();
		line8=in8.readLine();
	
	
	FileWriter fstream=new FileWriter ("couple.txt");
	BufferedWriter d=new BufferedWriter(fstream);
		while(line1!=null )
		{	
			if(Integer.valueOf(line3)<=Integer.valueOf(line4))
			{
	//		System.out.print(line1 );
	//		System.out.print("\t\t");
	//		System.out.println(line2);
		
			d.write(line1);
			d.write("\t\t");
			d.write(line3);
			d.write("\t\t");
			d.write(line5);
			d.write("\t\t");
			d.write(line7);
			d.write("\t\t");
			d.write(line2);
			d.write("\t\t");
			d.write(line4);
			d.write("\t\t");
			d.write(line6);
			d.write("\t\t");
			d.write(line8);
			d.newLine();
	
			line1=in1.readLine();
			line2=in2.readLine();
			line3=in3.readLine();
			line4=in4.readLine();
			line5=in5.readLine();
			line6=in6.readLine();
			line7=in7.readLine();
			line8=in8.readLine();
		
			
		}
		else
		{
			line2=in2.readLine();
			line4=in4.readLine();
			line6=in6.readLine();
			line8=in8.readLine();
			
		}
		}
		in1.close();
		in2.close();
		in3.close();
		in4.close();
		in5.close();
		in6.close();
		in7.close();
		in8.close();
		d.close();
	}

void gifts() throws IOException
{
		BufferedReader in =new BufferedReader(new FileReader("couple.txt"));
		BufferedReader in1 =new BufferedReader(new FileReader("gifts.txt"));
		String s;
		String t;
		int price11=0;
		int price22=0;
		int price33=0;
		int i=0;
		int []sum1={0,0,0,0,0,0,0,0,0,0};
		FileWriter fstream=new FileWriter ("giftsxchg.txt");
		BufferedWriter d1=new BufferedWriter(fstream);	
		FileWriter fstream1=new FileWriter ("boyhappiness.txt");
		BufferedWriter d2=new BufferedWriter(fstream1);	
		
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
			String []var=s.split("\t\t");	
			int budget=	Integer.parseInt(var[5]);
			String nameg=var[0];
			String nameb=var[4];
			int price1=price11;
			int price2=price22;
			int price3=price33;
	//		System.out.println(budget);
			if(budget==price1)
			{
				sum1[i]=price1;
				essential[i]=1;
			}
			else if(budget>price1)
			{
				sum1[i]=price1;
				budget=budget-price1;
				essential[i]=1;
					if(budget>=price2)
					{
						sum1[i]=sum1[i]+price2;
						budget=budget-price2;
						utility[i]=1;
							if(budget>=price3)
							{
								sum1[i]=sum1[i]+price3;
								luxury[i]=1;
							}
							
					}
			}
			else
				sum1[i]=0;
			budget=	Integer.parseInt(var[5]);
			happiness[i]= budget-sum1[i];
			String put=String.valueOf(sum1[i]);
			String put1=String.valueOf(essential[i]);
			String put2=String.valueOf(utility[i]);
			String put3=String.valueOf(luxury[i]);
			String put4=String.valueOf(happiness[i]);
			d1.write(nameg);
			d1.write("\t");
			d1.write(nameb);
			d1.write("\t");
			d1.write(put);
			d1.write("\t");
			d1.write(put1);
			d1.write("\t");
			d1.write(put2);
			d1.write("\t");
			d1.write(put3);
			d1.newLine();
			d2.write(put4);
			d2.newLine();
			i++;
		}
		
//		System.out.println("The amount of which gifts are given by bfs are");
//		for(i=0;i<10;i++)
//			System.out.println(sum1[i]);
			
		
		
		in.close();
		in1.close();
		d1.close();
		d2.close();
}
void happinessb() throws IOException
{
//	int i;
//	System.out.println("The happiness of boys(if all are miser) is given by");
//	for(i=0;i<10;i++)
//		System.out.println(happiness[i]);	
	
//	System.out.println("The happiness of boys(if all are Geeks) is given by");
	String t2;
	BufferedReader in2 =new BufferedReader(new FileReader("C:\\Users\\dell\\workspace\\ppl_assignment\\girls_attractiveness.txt"));
	t2=in2.readLine();
	while(t2!=null)
	{
//		System.out.println(t2);
		t2=in2.readLine();
	}
	in2.close();
	
	
	
}
}