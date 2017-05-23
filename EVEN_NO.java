import java.util.Scanner;
public class EVEN_NO {
	
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the all 10 elements");
		int a[]=new int[10];  //Declaring size of array as 10
		

		for(int i=0;i<10;i++)
		{
			a[i]= s1.nextInt();  //Getting values for Array
		}
		System.out.print("Even Numbers :");
		for(int i=0;i<10;i++)
		{
			if(a[i]%2==0)   //printing only Even numbers 
			{
				System.out.print(a[i]+" ");
			}
		}

		

	}

}

---------------------------------------------------------------------------------------------------

Sample Output:
sh-4.3$ javac EVEN_NO.java                                                                                                                                                      
sh-4.3$ java EVEN_NO                                                                                                                                                            
Enter the all 10 elements                                                                                                                                                       
1                                                                                                                                                                               
2                                                                                                                                                                               
3                                                                                                                                                                               
4                                                                                                                                                                               
5                                                                                                                                                                               
6                                                                                                                                                                               
7                                                                                                                                                                               
8                                                                                                                                                                               
9                                                                                                                                                                               
10                                                                                                                                                                              
Even Numbers :2 4 6 8 10 
