import java.util.Scanner;
class Symmetric
{
	public static void main(String[]args)
	{
		Scanner sn = new Scanner(System.in);
		int r,c;
		System.out.println("Enter the number of rows:");
		r=sn.nextInt();
		System.out.println("Enter the number of columns:");
		c=sn.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sn.nextInt();
			}
		}
		boolean flag = true;
		if(r!=c)
		{
			flag = false;
		}
		else
		{
			for(int i=0;i<r;i++)
			{
	               	for(int j=0;j<c;j++)
				{
					if(a[i][j] != a[j][i])
					{
						flag=false;
						break;
					}
				}
			}
		}
		if(flag)
		{
			System.out.println("This is Symmetric");
		}
		else
		{
			System.out.println("This is not symmetric.");
		}
		sn.close();
	}
}
