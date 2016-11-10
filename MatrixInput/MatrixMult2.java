
public class MatrixMult2 {

	private static int jj[][];


	public static int[][] mult(int [][]a, int [][]b){
		int z=a.length;//2
		int zz=a[0].length;//3
		int y=b.length;//3
		int yy=b[0].length;//2
		int q, r;
	
		if (z<=y)
		{
			q=z;
		}
		else
		{
		q=y;
		}
		if (zz<=yy)
		{
		r=zz;
		}
		else
		{
		r=yy;
		}
	
		int multi=0;
		jj=new int[q][r];//int[2][2];
		int l=0;
		for(int m=0;m<q-1;m++)
			{
			multi=0;
				for(int n=0;n<q;n++)
				{
					multi=0;
					for(l=0;l<r+2;l++)
					{
						multi+=a[n][l]*b[l][m];
				}
				jj[n][m]=multi;
		}
	}
	int ii[][]=jj;
	return jj;
	
}
}
