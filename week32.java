import java.io.*;
import java.util.*;
class week32
{
public static void main(String args[])
{ 
int m,i,max,min;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
int arr[]=new int[m];
for(i=0;i<m;i++)
{
arr[i]=sc.nextInt();
}
min=arr[0];
max=arr[0];
for(i=0;i<m;i++)
{
if(arr[i]>min)
{
System.out.println(min);
}
else if(arr[i]<max)
{
System.out.println(max);
}
} 
}
}