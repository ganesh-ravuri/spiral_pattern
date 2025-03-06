import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int tt=s.nextInt();
        for(int ll=0;ll<tt;ll++)
        {
            System.out.println("Case #"+(ll+1)+":");
            int n=s.nextInt();
            int t=0,d=n-1,l=0,r=n-1;
            int v=0;
            int c=0;
            if(n<=0)
            {
                System.out.println();
                continue;
            }
            if(n==2)
            {
                System.out.println("* *");
                System.out.println("* *");
                continue;
            }
            int ar[][]=new int[n][n];
            while(t<=d && l<=r)
            {
                if(v==0)
                {
                    c+=1;
                    if(c==1)
                    {
                    for(int i=l;i<=r;i++)
                    {
                        ar[t][i]=1;
                    }
                    }
                    else{
                        if(l-1>=0)
                        {
                        for(int i=l-1;i<=r;i++)
                        {
                            ar[t][i]=1;
                        }
                        }
                    }
                    t+=2;
                }
                else if(v==1)
                {
                    if(t-1>=0)
                    {
                    for(int i=t-1;i<=d;i++)
                    {
                        ar[i][r]=1;
                    }
                    }
                    r-=2;
                }
                else if(v==2)
                {   if(r+1<n)
                {
                    for(int i=r+1;i>=l;i--)
                    {
                        ar[d][i]=1;
                    }
                }
                    d-=2;
                }
                else if(v==3)
                {
                    if(d+1<n)
                    {
                    for(int i=d+1;i>=t;i--)
                    {
                        ar[i][l]=1;
                    }
                    }
                    l+=2;
                }
                v=(v+1)%4;
            }
            if(n%2==0)
            {
                t=n/2;
                d=n/2;
                l=n/2;
                r=n/2;
                for(int i=t;i<=d;i++)
                {
                    if(ar[i][r+1]==1)
                    {
                        ar[i][l-2]=1;    
                    }
                    else{
                    ar[i][r]=1;
                }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(ar[i][j]==1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {

                    System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}
