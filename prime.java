public class power {
	public int sumofprime(int x)
	{
		int a[]=new int[100];
		int l=0,m=0;
	for(int i=11;i<100;i++)
	{
		int f=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			a[l]=i;
			l++;
			m++;
			System.out.println(i);	
		}
	}
	
	if(x>0)
	{
		int n=0,tmp=0;
		for(int i=m-1;i>=0;i--)
		{
			for(int j=1;a[i]*j<=x;j++)
			{
				if((n=sumofprime(x-a[i]*j))!=-1 || (x-a[i]*j)==0)
				{ 
					if(n==-1)
				   tmp=j;
					else
				  tmp=tmp+j+n;
					i=0;
					break;
				}
			}
		}if(tmp!=0)
			return tmp;
	}return -1;
	
	}


public static void main(String args[])
{
	power a=new power();
System.out.println(a.sumofprime(352));
}
}
