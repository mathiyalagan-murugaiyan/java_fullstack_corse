class Program11{
 
   
  static int missingnumber(int [] nums){

   int n = nums.length;
   int sum=0;

   for(int i=0;i<n;i++){

   	sum += nums[i];

   } 

   	return n*(n+1)/2 - sum;

  }
 


	public static void main(String args[]){

    int nums[] = {1,3};
     

    int number = missingnumber(nums);
   
       System.out.println("missing number is : " + number);
     
	}
}