package patterns;
public class Pattern2 {

	public static void main(String[] args) {
		
		int x = 65;
		for (int i = 1; i <= 5; i++)
        {
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) x +" ");
                x++;
            }
            
			System.out.println();
        }
	}
}
