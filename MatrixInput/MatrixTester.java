import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MatrixTester {

	public static void main(String[] args) throws IOException {
		Scanner matrixTake=new Scanner(new File("E:\\MatrixInput\\MatrixData.txt"));
		int maxIndx=-1;
		int matrix1[]=new int[1000];
		while (matrixTake.hasNextInt())
		{
		maxIndx++;
		matrix1[maxIndx]=matrixTake.nextInt();
		}
		matrixTake.close();
		
		
		int a[][]=new int[3][4];
		int b[][]=new int[4][2];
		
		
		int aRows=a.length;
		int aColumns = a[0].length;
		int bRows=b.length;
		int bColumns=b[0].length;
		int c=0;
		for(int n=0;n<aRows;n++)
		{
			for(int m=0;m<aColumns;m++)
			{
			a[n][m]=matrix1[c];
			c++;
			}
			
		}
		
		
		for(int aa=0;aa<bRows;aa++)
		{
			for(int ab=0;ab<bColumns;ab++)
			{
			b[aa][ab]=matrix1[c];	
			c++;
			}
			c++;
		}
		MatrixMult2 multiply=new MatrixMult2();
		int ac[][]= multiply.mult(a,b);
		for(int row = 0; row < ac.length; row++)
		{
			for(int col = 0; col < ac[row].length; col++)
			{
				System.out.print(ac[row][col] + "\t");
			}
			System.out.println(" ");
		}
	}

}
