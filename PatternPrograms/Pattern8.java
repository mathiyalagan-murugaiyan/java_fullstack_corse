package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++)
        {
            int x = 65;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) x +" ");
                x++;
            }
			System.out.println();
		}
	}
}
