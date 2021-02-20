package package01;

public class TryHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 01");
		
		
		//----------------------------------------
		int[][] kinosal = new int[5][5];
		
		kinosal[2][2] = 1;
		for (int i = 1; i < 4; i++)	{
		    kinosal[i][3] = 1;
		}
		
		for (int i = 0; i < 5; i++) {
			kinosal[i][4] = 1;
		}
		
		
		for (int j = 0; j < kinosal[0].length; j++)
		{
		    for (int i = 0; i < kinosal.length; i++)
		    {
		        System.out.print(kinosal[i][j]);
		    }
		    System.out.println();
		}
		//-----------------------------------------
		int[][][] kinosaly = new int [5][5][3];
		
		kinosaly[3][2][1] = 1;
		//-----------------------------------------
		int[][] kinosal1 = new int[5][];
		
		for (int i = 0; i < kinosal1.length; i++)
		{
		    kinosal1[i] = new int[5];
		}
		
		int sloupcu = kinosal.length;
		int radku = 0;
		if (sloupcu != 0)
		    radku = kinosal[0].length;
		//-----------------------------------------
	}

}
