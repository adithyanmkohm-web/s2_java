import java.util.Scanner;
class Matrix
{
public static void main(String [] args)
{
Scanner sn = new Scanner(System.in);
System.out.println("Enter the number of rows in first matrix:");
int r1=sn.nextInt();
System.out.println("Enter the number of columns in first matrix:");
int c1=sn.nextInt();
int matrix1[][]=new int[r1][c1];
System.out.println("Enter the first matrix:");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
matrix1[i][j]=sn.nextInt();
}
}
System.out.println("Enter the number of rows in second matrix:");
int r2=sn.nextInt();
System.out.println("Enter the number of columns in second matrix :");
int c2=sn.nextInt();
int matrix2[][]=new int[r2][c2];
System.out.println("enter the second matrix:");
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
{
matrix2[i][j]= sn.nextInt();
}
}
if(r1==r2 && c1==c2)
{
int result[][]=new int[r1][c1];
for(int i=0; i<r1; i++)
{
for(int j=0; j<c1; j++)
{
result[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("Addition of matrix");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.println("Addition is not possible");
}
}
}

