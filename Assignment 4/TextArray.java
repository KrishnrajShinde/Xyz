public class TextArray
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10};
try
{
System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("Array Size is 5 you are trying to 6th element: "+e);
}
System.out.println(arr[1]);
}
}

