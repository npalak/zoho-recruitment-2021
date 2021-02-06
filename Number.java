import java.util.Scanner;
 
public class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         //Taking value from the user
        System.out.println("How many rows you want in this pattern?");
         int n = sc.nextInt();
         int a=n+2;
        System.out.println("Here is your pattern....!!!");
         for (int i =1 ; i <=n; i++)
         {
         for (int j = 1 ; j <=n; j++)
          {
          for(int k=1;k<=n-1;k++)
           {
          if(i==k && j>=k || j==k && i>=k)
             {
              System.out.print((a-k-1)+" ");
              }
            }
          if(i==n && j>=n || j==n && i>=n)
           {
           System.out.print((a-n-1)+" ");
           }
          }    
        System.out.println();
        } 
        sc.close();
    }
}
