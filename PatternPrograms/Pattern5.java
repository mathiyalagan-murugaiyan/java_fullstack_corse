package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++)
        {
            int x = 65;
            for (int j = 5; j > i; j--)
            {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (x + k)+" ");
            }
            for (int l = i - 1; l >= 0; l--)
            {
                System.out.print((char) (x + l)+" ");
            }
            System.out.println();
        }
	}
}
