package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Couple_ques5 extends girls {
	
	int []att=new int[11];
	int []bud=new int [53];
	float[] couple_happiness2=new float [10];
	
	void new_logic() throws IOException
	{
		int[] essential1=new int[10];
		int[] utility1=new int[10];
		int[] luxury1=new int[10];
		int[] happiness1=new int[10];
		int i=0;
		int j=0;
		String line111;
		String line2;
		String line3;
		String line4;
		String line40;
		String line50;
		String line60;
		String line70;
		
		BufferedReader in2=new BufferedReader (new FileReader("boys_budget.txt"));
		BufferedReader in4=new BufferedReader ( new FileReader("girls_attractiveness.txt"));	
		line2=in2.readLine();
		line4=in4.readLine();
	
		while(line2!=null )
		{
			bud[i]=Integer.parseInt(line2);
			line2=in2.readLine();
			i++;
		}
		while(line4!=null)
		{
			att[j]=Integer.parseInt(line4);
			line4=in4.readLine();
			j++;
		}
		
		Arrays.sort(bud);
		Arrays.sort(att);
	in2.close();
	in4.close();
	int s=1;

	
	BufferedReader in3=new BufferedReader ( new FileReader("girls.txt"));	
	BufferedReader in40=new BufferedReader ( new FileReader("girls_attractiveness.txt"));	
	BufferedReader in50=new BufferedReader ( new FileReader("girls_maintenance.txt"));
	
	
	line3=in3.readLine();
	line40=in40.readLine();
	line50=in50.readLine();
	
	FileWriter fstream1=new FileWriter ("ques5_couple.txt");
	BufferedWriter d1=new BufferedWriter(fstream1);
	while(s<=2)
	{
	if(s==1 )
	{

		String line22;
		int k=52;
		while(k>=48)
		{
			BufferedReader in111=new BufferedReader ( new FileReader("boys.txt"));
			BufferedReader in22=new BufferedReader (new FileReader("boys_budget.txt"));
			while((line22=in22.readLine())!=null && (line111=in111.readLine())!=null)
			{

				if(bud[k]==Integer.parseInt(line22) )
				{
			
			//		System.out.println(line111);
					d1.write(line3);
					d1.write("\t\t");
					d1.write(line50);
					d1.write("\t\t");
					d1.write(line40);
					d1.write("\t\t");
					d1.write(line111);
					d1.write("\t\t");
					d1.write(line22);
					d1.newLine();
					line3=in3.readLine();
					line40=in40.readLine();
					line50=in50.readLine();
					break;
				}
			}	
			in22.close();
			in111.close();
			k--;
		}
		
		s++;
		
	}
	else
	{
		int l=10;
		String line11;
		String line12;
		String line13;
		BufferedReader in70=new BufferedReader (new FileReader("boys_budget.txt"));
		BufferedReader in13=new BufferedReader ( new FileReader("boys.txt"));
		line13=in13.readLine();
		line70=in70.readLine();
		while(l>5)
		{
			
			BufferedReader in60=new BufferedReader ( new FileReader("girls_maintenance.txt"));
			BufferedReader in11=new BufferedReader ( new FileReader("girls.txt"));	
			BufferedReader in12=new BufferedReader (new FileReader("girls_attractiveness.txt"));
			line11=in11.readLine();
			line60=in60.readLine();
			while((line12=in12.readLine())!=null)
			{
				if(att[l]==Integer.parseInt(line12)  )
				{
				
					d1.write(line11);
					d1.write("\t\t");
					d1.write(line60);
					d1.write("\t\t");
					d1.write(line12);
					d1.write("\t\t");
					d1.write(line13);
					d1.write("\t\t");
					d1.write(line70);
					d1.newLine();
					line11=in11.readLine();
					line60=in60.readLine();
					line13=in13.readLine();
					line70=in70.readLine();
					break;
				}
				else
				{
		
					line60=in60.readLine();
					line11=in11.readLine();
					
				}
				
			}
				in11.close();
			in12.close();
			in60.close();
			l--;
		}
		in70.close();
		in13.close();
		s++;
	}
	}

	in40.close();
	in50.close();
	in3.close();
	d1.close();
	
	BufferedReader in =new BufferedReader(new FileReader("ques5_couple.txt"));
	BufferedReader in1 =new BufferedReader(new FileReader("gifts.txt"));
	String ss;
	String t;
	int price11=0;
	int price22=0;
	int price33=0;
	int k=0;
	int []sum1={0,0,0,0,0,0,0,0,0,0};
	FileWriter fstream11=new FileWriter ("giftsxchg.txt");
	BufferedWriter d11=new BufferedWriter(fstream11);	
	FileWriter fstream22=new FileWriter ("boyhappiness.txt");
	BufferedWriter d22=new BufferedWriter(fstream22);	
	
	t=in1.readLine();
	while(t!=null)
	{
		String []var1=t.split("\t");
		price11=Integer.parseInt(var1[0]);
		price22=Integer.parseInt(var1[2]);
		price33=Integer.parseInt(var1[4]);
		t=in1.readLine();
	}
	
	while((ss=in.readLine())!=null  && !ss.isEmpty() )
	{
		String []var=ss.split("\t\t");	
		int budget=	Integer.parseInt(var[4]);
		String nameg=var[0];
		String nameb=var[3];
		int price1=price11;
		int price2=price22;
		int price3=price33;

		//		System.out.println(budget);
		if(budget==price1)
		{
			sum1[k]=price1;
			essential1[k]=1;
		}
		else if(budget>price1)
		{
			sum1[k]=price1;
			budget=budget-price1;
			essential1[k]=1;
				if(budget>=price2)
				{
					sum1[k]=sum1[k]+price2;
					budget=budget-price2;
					utility1[k]=1;
						if(budget>=price3)
						{
							sum1[k]=sum1[k]+price3;
							luxury1[k]=1;
						}
						
				}
		}
		else
			sum1[k]=0;
		budget=	Integer.parseInt(var[4]);
		happiness1[k]= budget-sum1[k];
		String put=String.valueOf(sum1[k]);
		String put1=String.valueOf(essential1[k]);
		String put2=String.valueOf(utility1[k]);
		String put3=String.valueOf(luxury1[k]);
		String put4=String.valueOf(happiness1[k]);
		d11.write(nameg);
		d11.write("\t");
		d11.write(nameb);
		d11.write("\t");
		d11.write(put);
		d11.write("\t");
		d11.write(put1);
		d11.write("\t");
		d11.write(put2);
		d11.write("\t");
		d11.write(put3);
		d11.newLine();
		d22.write(put4);
		d22.newLine();
		k++;
	}
	d11.close();
	d22.close();
	in.close();
	in1.close();
	}	
	void new_happiness() throws IOException
	{
	int i=0;
	
	String line1;
	String line2;
	String line4;
	FileWriter fstream1=new FileWriter ("couplehappiness.txt");
	BufferedWriter d2=new BufferedWriter(fstream1);	
	
	BufferedReader in1=new BufferedReader (new FileReader("girlhappiness.txt"));
	BufferedReader in2=new BufferedReader ( new FileReader("boyhappiness.txt"));
	BufferedReader in3=new BufferedReader ( new FileReader("girls.txt"));
	BufferedReader in4=new BufferedReader ( new FileReader("ques5_couple.txt"));
	while((line1=in1.readLine())!=null && (line2=in2.readLine())!=null  && (line4=in4.readLine())!=null)
	{
		String var11[]=line4.split("\t\t");
		float a=Float.parseFloat(line1);
		float b=Float.parseFloat(line2);
		couple_happiness2[i]=a+b;
		String c=String.valueOf(couple_happiness2[i]);
		d2.write(var11[0]);
		d2.write("\t\t");
		d2.write(var11[3]);
		d2.write("\t\t");
		d2.write(c);
		d2.newLine();
		i++;
	}
	in1.close();
	in2.close();
	in3.close();
	in4.close();
	d2.close();	
}
	void k_happiest_couple() throws IOException
	{
		int i=9;
		int count;
		String line;
		Arrays.sort(couple_happiness2);
		System.out.println("Enter the value of k to find k happiest couples");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		count =scan.nextInt();
		while(count>0)
		{
			BufferedReader in=new BufferedReader (new FileReader("couplehappiness.txt"));
			while((line=in.readLine())!=null)
			{
				String[]var=line.split("\t\t");
				float val=Float.parseFloat(var[2]);
				if(val==couple_happiness2[i])
				{
					System.out.print(var[0]);
					System.out.print("\t\t");
					System.out.print(var[1]);
					System.out.print("\t\t");
					System.out.println(var[2]);
					break;
				}
			}
			in.close();
				count--;
				i--;
		}
		
		
	}
}		

