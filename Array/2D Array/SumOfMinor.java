class SumOfMinor
{
	public static void main(String[] args) 
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int i,j,res=0;
		for(i=0;i<a.length;i++)
		{
			for (j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<a.length;i++)
		{
			for (j=0;j<a[i].length;j++)
			{
				if(i+j==2)
				{
					res=res+a[i][j];
				}
			}
			
		}
		System.out.println("SumOfMinorIs:"+res);

	}
}