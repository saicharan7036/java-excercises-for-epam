import java.io.*;
import java.util.*;
class week3
{
public static void main(String args[])
{ 
int m,i,sum=0,avg;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
int arr[]=new int[m];
for(i=0;i<m;i++)
{
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println(sum);
avg=sum/m;
System.out.println(avg);
}
}