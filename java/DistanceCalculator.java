class DistanceCalculator{
	
	public static void main(String args[]){
		
		float km = 45;
		float cm,m,i,ft;
		
		
		m = km*1000;
		cm = m*100;
		i = cm/2.54f;
		ft = i/12;
		
		System.out.println("KM :" + km);
		System.out.println("M  :" + m);
		System.out.println("CM :" + cm);
		System.out.println("IN :" + i);
		System.out.println("FT :" + ft);
		
	}
}