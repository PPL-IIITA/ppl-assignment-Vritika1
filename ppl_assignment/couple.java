package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class couple extends boys{

	int compatibility;
	public	float []couple_happiness={0,0,0,0,0,0,0,0,0,0,0};
	void happiness() throws IOException
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
		BufferedReader in4=new BufferedReader ( new FileReader("couple.txt"));
		while((line1=in1.readLine())!=null && (line2=in2.readLine())!=null  && (line4=in4.readLine())!=null)
		{
			String var11[]=line4.split("\t\t");
			float a=Float.parseFloat(line1);
			float b=Float.parseFloat(line2);
			couple_happiness[i]=a+b;
			String c=String.valueOf(couple_happiness[i]);
			d2.write(var11[0]);
		//	System.out.print(var11[0]);
		//	System.out.print("\t\t");
			d2.write("\t\t");
		//	System.out.print(var11[4]);
		//	System.out.print("\t\t");
			d2.write(var11[4]);
			d2.write("\t\t");
		//	System.out.println(c);
			d2.write(c);
			d2.newLine();
			i++;
		}
//		System.out.println("The happiness of the couple is given by");
//		for(i=0;i<10;i++)
//		{
//			System.out.println(couple_happiness[i]);
//		}
		in1.close();
		in2.close();
		in3.close();
		in4.close();
		d2.close();
		
	}
	
	void compatible() throws IOException
{
		System.out.println("compatibility of couples is");
		BufferedReader in1=new BufferedReader (new FileReader("couple.txt"));
		String line1;
		while((line1=in1.readLine())!=null)
{
		String []var=line1.split("\t\t");
		int a1=Integer.parseInt(var[1]);
		int a2=Integer.parseInt(var[5]);
		int a3=Integer.parseInt(var[2]);
		int a4=Integer.parseInt(var[6]);
		int a5=Integer.parseInt(var[3]);
		int a6=Integer.parseInt(var[7]);
		int c1=a2-a1;
		int c2=Math.abs(a3-a4);
		int c3=Math.abs(a5-a6);
		compatibility=c1+c2+c3;
		System.out.println(compatibility);
}
		in1.close();
	
}
	
	void kleasthappiest() throws IOException
	{
	
		Arrays.sort(couple_happiness);
	
		String line11;
		String line12;
		double dk=1+(Math.random()*(5-1));
		int k=(int )dk;
		BufferedReader in1=new BufferedReader (new FileReader("couple.txt"));
		BufferedReader in2=new BufferedReader (new FileReader("couplehappiness.txt"));
		FileWriter fstream1=new FileWriter ("new_couple.txt");
		BufferedWriter d1=new BufferedWriter(fstream1);	
		line11=in1.readLine();
		line12=in2.readLine();
		
		float min=couple_happiness[1];
		float min1=couple_happiness[2];
		float min2=couple_happiness[3];
		float min3=couple_happiness[4];
		float min4=couple_happiness[5];
		
	switch (k)
	{
	case 1:
	{
		while(line11!=null && line12!=null  )
		{ 
			String[]var=line12.split("\t\t");
			float val=Float.parseFloat(var[2]);
			
			if(val!=min)
			{
				d1.write(line11);
				d1.newLine();
			}
			line11=in1.readLine();
			line12=in2.readLine();
		}
		break;
	}
	case 2:
	{
		while(line11!=null && line12!=null  )
		{ 
			String[]var=line12.split("\t\t");
			float val=Float.parseFloat(var[2]);
			if(val!=min && val!=min1)
			{
				d1.write(line11);
				d1.newLine();
			}
			line11=in1.readLine();
			line12=in2.readLine();
		}
		break;
	}
	case 3:
	{
		while(line11!=null && line12!=null  )
		{ 
			String[]var=line12.split("\t\t");
			float val=Float.parseFloat(var[2]);
			if(val!=min && val!=min1 && val!=min2)
			{
				d1.write(line11);
				d1.newLine();
			}
			line11=in1.readLine();
			line12=in2.readLine();
		}
		break;
	}
	case 4:
	{
		while(line11!=null && line12!=null  )
		{ 
			String[]var=line12.split("\t\t");
			float val=Float.parseFloat(var[2]);
			if(val!=min && val!=min1 && val!=min2 && val!=min3)
			{
				d1.write(line11);
				d1.newLine();
			}
			line11=in1.readLine();
			line12=in2.readLine();
		}
		break;
	}
	case 5:
	{

		while(line11!=null && line12!=null  )
		{ 
			String[]var=line12.split("\t\t");
			float val=Float.parseFloat(var[2]);
			if(val!=min && val!=min1 && val!=min2 && val!=min3 && val!=min4)
			{
				d1.write(line11);
				d1.newLine();
			}
			line11=in1.readLine();
			line12=in2.readLine();
		}
		break;
	}
	}
			
		in1.close();
		in2.close();
		d1.close();		
	}

void newbf() throws IOException
{
	File file=new File("new_couple.txt");
	FileWriter fstream11=new FileWriter (file.getAbsoluteFile(),true);
	BufferedWriter d11=new BufferedWriter(fstream11);	
	String line1;
	String line7 ;

	BufferedReader in1=new BufferedReader (new FileReader("couple.txt"));
	
	FileWriter fstream=new FileWriter ("single_girls_after_breakup.txt");
	BufferedWriter d=new BufferedWriter(fstream);
	
	while( (line1=in1.readLine())!=null )
	{
		String[]var1=line1.split("\t\t");
		
		BufferedReader in7=new BufferedReader (new FileReader("new_couple.txt"));
		int count=0;
	while((line7=in7.readLine())!=null )
	{
		String[]var=line7.split("\t\t");
		
			if(var1[0].matches(var[0]))
			{
				count++;
				break;
			}
	}
	if(count==0)
	{
		d.write(var1[0]);
		d.write("\t\t");
		d.write(var1[1]);
		d.write("\t\t");
		d.write(var1[2]);
		d.write("\t\t");
		d.write(var1[3]);
		d.newLine();
	}
	in7.close();
	}
d.close();
	in1.close();
	
	
	String line11;
	String line22;
	String line44;
	String line55;
	String line66;
	
	
	BufferedReader in11=new BufferedReader (new FileReader("single_girls_after_breakup.txt"));
	BufferedReader in22=new BufferedReader ( new FileReader("boys.txt"));	
	BufferedReader in44=new BufferedReader (new FileReader("boys_budget.txt"));
	BufferedReader in55=new BufferedReader (new FileReader("boys_attractiveness.txt"));
	BufferedReader in66=new BufferedReader (new FileReader("boys_intelligence.txt"));
	
	line11=in11.readLine();
	line22=in22.readLine();
	line44=in44.readLine();
	line55=in55.readLine();
	line66=in66.readLine();
	
	System.out.print("The new boyfriends of the girls are\n");
	for(int i=0;i<18;i++)
		line22=in22.readLine();
	while(line11!=null )
	{	
		String[]var2=line11.split("\t\t");
		if(Integer.valueOf(var2[1])<=Integer.valueOf(line44) )
		{
		System.out.print(var2[0] );
		d11.write(var2[0]);
		d11.write("\t\t");
		d11.write(var2[1]);
		d11.write("\t\t");
		d11.write(var2[2]);
		d11.write("\t\t");
		d11.write(var2[3]);
		d11.write("\t\t");
		d11.write(line22);
		d11.write("\t\t");
		d11.write(line44);
		d11.write("\t\t");
		d11.write(line55);
		d11.write("\t\t");
		d11.write(line66);
		d11.newLine();
		System.out.print("\t\t");
		System.out.println(line22);
		line11=in11.readLine();
		line22=in22.readLine();
		line44=in44.readLine();
		line55=in55.readLine();
		line66=in66.readLine();
		
	}
	else
	{
		
		line22=in22.readLine();
		line44=in44.readLine();	
		line55=in55.readLine();
		line66=in66.readLine();
	}
	}
	in11.close();
	in22.close();
	in44.close();
	d11.close();
	in55.close();
	in66.close();
}
}