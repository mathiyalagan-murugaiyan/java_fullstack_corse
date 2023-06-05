class AverageCalculation{
   
    
    
	static float avg(int a,int b,int c,int d,int e){
		int m1,m2,m3,m4,m5,total;
		float average;
		m1 = a;
        m2 = b;
        m3 = c;
        m4 = d;
        m5 = e;
        total = m1+m2+m3+m4+m5;
        average = total/5.0f;	
        return average;		
		
	}
	
	public static void main(String args[]){
		
		
		
		System.out.println(avg(50,65,88,75,68));
		
		
	}
}