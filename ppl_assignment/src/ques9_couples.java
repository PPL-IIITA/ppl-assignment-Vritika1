package ppl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ques9_couples {

	void new_pairing() throws IOException
	{
		int []maint=new int[11];
		int []att=new int [53];
		
			int i=0;
			int j=0;
			String line1;
			String line2;
			String line3;
			String line4;
	//		String line40;
			String line50;
			String line60;
			String line70;
			
			BufferedReader in2=new BufferedReader (new FileReader("boys_attractiveness.txt"));
			BufferedReader in4=new BufferedReader ( new FileReader("girls_maintenance.txt"));	
			line2=in2.readLine();
			line4=in4.readLine();
		
			while(line2!=null )
			{
				att[i]=Integer.parseInt(line2);
				line2=in2.readLine();
				i++;
			}
			while(line4!=null)
			{
				maint[j]=Integer.parseInt(line4);
				line4=in4.readLine();
				j++;
			}
			
			Arrays.sort(att);
			Arrays.sort(maint);
		in2.close();
		in4.close();
		int s=1;
		String line66;
		BufferedReader in22=new BufferedReader (new FileReader("boys_attractiveness.txt"));
		BufferedReader in3=new BufferedReader ( new FileReader("girls.txt"));		
		BufferedReader in50=new BufferedReader ( new FileReader("girls_maintenance.txt"));
		BufferedReader in66=new BufferedReader ( new FileReader("boys_budget.txt"));
		line3=in3.readLine();
		line50=in50.readLine();
		BufferedReader in1=new BufferedReader ( new FileReader("boys.txt"));
		FileWriter fstream1=new FileWriter ("ques9_couple.txt");
		BufferedWriter d1=new BufferedWriter(fstream1);
		while(s<=2)
		{
		if(s==1 )
		{
			
			String line22;
			int k=52;
			while(k>=48)
			{
			
				while((line22=in22.readLine())!=null && (line1=in1.readLine())!=null && (line66=in66.readLine())!=null)
				{
					if(att[k]==Integer.parseInt(line22) )
					{
						
						d1.write(line3);
						d1.write("\t\t");
						d1.write(line50);
						d1.write("\t\t");
						d1.write(line1);
						d1.write("\t\t");
						d1.write(line22);
						d1.write("\t\t");
						d1.write(line66);
						d1.newLine();
						
						line3=in3.readLine();
						line50=in50.readLine();
						break;
					}
				}
			
				k--;
			}
			s++;
			in22.close();
			in1.close();
			in66.close();
		}
		else
		{
			int l=10;
			String line11;
			String line13;
			String line14;
			BufferedReader in70=new BufferedReader (new FileReader("boys_attractiveness.txt"));
			BufferedReader in13=new BufferedReader ( new FileReader("boys.txt"));
			BufferedReader in14=new BufferedReader ( new FileReader("boys_budget.txt"));
			line13=in13.readLine();
			line70=in70.readLine();
			line14=in14.readLine();
			while(l>5)
			{
				
				BufferedReader in60=new BufferedReader ( new FileReader("girls_maintenance.txt"));
				BufferedReader in11=new BufferedReader ( new FileReader("girls.txt"));	
				line11=in11.readLine();
				line60=in60.readLine();
				while((line60=in60.readLine())!=null )
				{
					if(maint[l]==Integer.parseInt(line60)  )
					{
			//			System.out.println(line11);
						d1.write(line11);
						d1.write("\t\t");
						d1.write(line60);
						d1.write("\t\t");
						d1.write(line13);
						d1.write("\t\t");
						d1.write(line70);
						d1.write("\t\t");
						d1.write(line14);
						d1.newLine();
						line11=in11.readLine();
						line70=in70.readLine();
						line13=in13.readLine();
						line14=in14.readLine();
						break;
					}
					else
					{
						line11=in11.readLine();
					}
					
				}
					in11.close();
	
				in60.close();
				l--;
			}
			in70.close();
			in13.close();
			in14.close();
			s++;
		}
		}

		in50.close();
		
		in3.close();
		d1.close();
		String line14;
		BufferedReader in14=new BufferedReader ( new FileReader("ques9_couple.txt"));
		line14=in14.readLine();
		double dk=1+(Math.random()*(10-1));							
		int k=(int)dk;
		System.out.println("The value of k is "+k);
		for(int p=0;p<k;p++)
		{
			String[]var=line14.split("\t\t");
			System.out.print(var[0]);
			System.out.print("\t\t");
			System.out.println(var[2]);
			line14=in14.readLine();
			
		}
		in14.close();
			
		}
		
	}

