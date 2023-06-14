import java.util.Scanner;

class StrongNumber{

    int num ;

   static String Strong(int num){
   	
    
    int temp,fact,sum=0,rem,i;
    
    temp = num;

    while(num > 0){

    	rem = num%10;

    	fact=1;

    	for(i=1;i<=rem;i++){
          
          fact = fact*i;
          
    	}

    	sum = sum+fact;

    	num = num/10;

    }
    return (temp == sum) ? "Strong number" : "not Strong number";

      
	}
    
   public static void main(String args[]){

     Scanner in = new Scanner(System.in);
     
     System.out.println("Enter the value :");

     String s = Strong(in.nextInt());

     System.out.println(s);
   }
    
}
