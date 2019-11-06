
import java.util.Scanner;
import java.io.*; 
public class Main
{
	public static void main(String[] args) {
		
		int temp=0 ;

		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter No. of persons to travel:");
         int n = myObj.nextInt(); 
         
         int a[] = new int[n];
        System.out.println("Enter cost of travel of each person:");
        for(int k = 0; k < n; k++){
            a[k] = myObj.nextInt();
            }
   
        int minValue = a[0];
        int Value=0;
          for(int i=1;i<a.length;i++){
            if(a[i] < minValue){
        	  minValue = a[i];
        	}
          }
       

int maxValue = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i] > maxValue){
				maxValue = a[i];
				temp= maxValue;
			}
		}
		maxValue=temp+temp;
		 
		 
		 Value=minValue+maxValue;
		 System.out.println("max value:"+Value);
		 
	}
}
