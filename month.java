/* FIRSTLY PROGRAM TO STORE MONTHS AND DAYS IN ARRAY 
 * SECONDLY PROVIDING USER INPUT AS MONTH AND IN RESULT
 * PRINTING NUMBER OF DAYS IN THAT MONTH 
 * 
 */
package session6;
		//importing scanner class 

import java.util.Scanner;
		//creating class month
public class month {
		//creating method cal
	void cal(){
		String a;
		//enter the name of months in an array A
		System.out.println("enter the month");
		Scanner object=new Scanner(System.in);
		//store in a
		a=object.nextLine();
		int date;
		//enter the number of days in a months
		System.out.println("enter the day");
		Scanner object1=new Scanner(System.in);
		date=object1.nextInt();
		String []mon=new String[12];
		
		//storing months in mon
		mon[0]="january";
		mon[1]="february";
		mon[2]="march";
		mon[3]="april";
		mon[4]="may";
		mon[5]="june";
		mon[6]="july";
		mon[7]="august";
		mon[8]="september";
		mon[9]="october";
		mon[10]="november";
		mon[11]="december";
		//storing days in array1
	
		int[]array1;
		array1=new int[12];
		array1[0]=31;
		array1[1]=28;
		array1[2]=31;
		array1[3]=30;
		array1[4]=31;
		array1[5]=30;
		array1[6]=31;
		array1[7]=30;
		array1[8]=31;
		array1[9]=30;
		array1[10]=31;
		array1[11]=30;
		
		//calculating one on one mapping specified by user by month to day
		for(int i=0;i<11;i++){
		//using equals function	
			if(a.equals(mon[i])){
				System.out.println("number of days in  "+mon[i] + " is " +array1[i]);
}
}
	int count=0;
		//calculating total no of days from 1st jan
		for(int i=0;i<11;i++){
			
			if(a.equals(mon[i])){
				for(int j=0;j<i;j++){
				count=count+array1[j];
				}
}
}
		count=count+date;
		System.out.println("total no of days from 1st jan to month you specified " +count);	
		
				}
	
	public static void main(String[] args) {
		//creating object to access cal method
		month g=new month();
		g.cal();
		
	}
	}
  
  --------------------------
  
  smaple output:
sh-4.3$ javac month.java                                                                                                                                                        
sh-4.3$ java month                                                                                                                                                              
enter the month                                                                                                                                                                 
march                                                                                                                                                                           
enter the day                                                                                                                                                                   
23                                                                                                                                                                              
number of days in  march is 31                                                                                                                                                  
total no of days from 1st jan to month you specified 82  
