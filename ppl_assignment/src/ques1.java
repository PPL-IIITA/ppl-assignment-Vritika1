package ppl;

import java.io.*;

public class ques1 {
	public static void main(String args[]) throws IOException
	{
		int j,days;
//	boys b=new boys();
	girls g=new girls();
	couple c=new couple();
	search_couples_ques7 sc=new search_couples_ques7();
		c.pairing();
		c.gifts();
		c.happinessb();
		g.happinessg();
		c.happiness();
		c.compatible();
		c.kleasthappiest();
		c.newbf();
		
		Couple_ques5 cq=new Couple_ques5();									//question no.5 starts
		cq.new_logic();
		cq.happinessg();
		cq.new_happiness();
		cq.k_happiest_couple();												//question no.5 ends

		double ddays=1+(Math.random()*(10-1));								//question no.6 starts
		days=(int)ddays;
		System.out.println("The number of days are"+days);
		for(j=1;j<=days;j++)
		{
			c.gifts();
			c.happinessg();
			c.happiness();
			c.kleasthappiest();
			c.newbf();
			 BufferedReader br = new BufferedReader(new FileReader("new_couple.txt"));
			    BufferedWriter bw = new BufferedWriter(new FileWriter("couple.txt"));
			    String data;
			      data = br.readLine();
			      while (data != null) {
			    	  	bw.write(data);
			    	  	bw.newLine();
			    	  	data = br.readLine();
			      }
			      bw.close();
			      br.close(); 											//end of question no.6
 		} 
		int method;
		c.happiness();
		double dmethod=1+(Math.random()*(4-1));								//question no.6 starts
		method=(int)dmethod;
		System.out.println(method);
		 switch(method)
		 {
		 case 1:
		 {
			 sc.search1();
			 break;
		 }
		 case 2:
		 {
			 sc.search2();
			 break;
		 }
		 case 3:
		 {
		 sc.search3();
		 break;
		 }
		 default:
		 {
			 sc.search1();
			 break;
		 }
		 }																		//question no.7 ends
		 gifts_ques8 gift=new  gifts_ques8();   
		 gift.new_way_of_gifting(); 											//question no.8
		 
		 ques9_couples ncouples=new ques9_couples ();
		ncouples.new_pairing();    												//question no.9
	
		ques10_random rand=new ques10_random();
		rand.random();
	}
		
	}

