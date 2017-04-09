package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class gifts_ques8 {

	void new_way_of_gifting() throws IOException
	{
		String line1;
		String line2;
		
		BufferedReader in2 =new BufferedReader(new FileReader("couple.txt"));
		FileWriter fstream=new FileWriter ("new_giftsxchg.txt");
		BufferedWriter d1=new BufferedWriter(fstream);	
		while( (line2=in2.readLine())!=null )
		{
			BufferedReader in1 =new BufferedReader(new FileReader("gifts.txt"));
			line1=in1.readLine();
			String[]var1=line1.split("\t");
			String[]var2=line2.split("\t\t");
			int a=Integer.parseInt(var1[0]);
			int b=Integer.parseInt(var1[2]);
			int c=Integer.parseInt(var1[4]);
			int result=a+b+c;
			String val=String.valueOf(result);
			d1.write(var2[0]);
			d1.write("\t\t");
			d1.write(var2[4]);
			d1.write("\t\t");
			d1.write(val);
			d1.newLine();
			in1.close();
		}
		d1.close();
		in2.close();
	}
}
