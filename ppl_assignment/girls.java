package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class girls {
public String name1;
public int attractiveness1;
public int maintenance_cost;
public int intelligence1;
public double []result={0,0,0,0,0,0,0,0,0,0};
public double []result1={0,0,0,0,0,0,0,0,0,0};
public double []result2={0,0,0,0,0,0,0,0,0,0};

void happinessg() throws IOException
{
	int i=0;
	String line1;
	String line2;
//	System.out.println("The happiness of gfs (if choosy)is given by");
	BufferedReader in1=new BufferedReader (new FileReader("girls_maintenance.txt"));
	BufferedReader in2=new BufferedReader ( new FileReader("giftsxchg.txt"));
	
	FileWriter fstream1=new FileWriter ("girlhappiness.txt");
	BufferedWriter d2=new BufferedWriter(fstream1);	
	
	while((line1=in1.readLine())!=null && (line2=in2.readLine())!=null)
	{
	String []var=line2.split("\t");
	int gift=	Integer.parseInt(var[2]);
	int luxvalue=Integer.parseInt(var[5]);
	int essvalue=Integer.parseInt(var[3]);
	int utivalue=Integer.parseInt(var[4]);
	
	int main=Integer.parseInt(line1);
	if(main<=gift)
	{
		int diff=gift-main;
		result[i]= Math.log(diff)+2*luxvalue;
		result1[i]=diff+essvalue+utivalue+luxvalue;
		result2[i]=Math.exp(diff);
	}
	else
	{
		result[i]=0;
		result1[i]=0;
		result2[i]=0;
	}
	String r1=String.valueOf(result[i]);
	d2.write(r1);
	d2.newLine();
i++;
	}
	in1.close();
	in2.close();
	d2.close();
//	for(i=0;i<10;i++)
//		System.out.println(result[i]);
		
//	System.out.println("The happiness of gfs (if Normal)is given by");
//	for(i=0;i<10;i++)
//		System.out.println(result1[i]);
	
//	System.out.println("The happiness of gfs (if Desperate)is given by");
//	for(i=0;i<10;i++)
//		System.out.println(result2[i]);
}




}
