package com.sde;
import java.io.*;
import java.lang.*;
import java.util.*;


public class Bar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many customer");
		    int c=sc.nextInt();
		    ArrayList<Integer>al[]= new ArrayList[c];
		    for(int i=0;i<c;i++)
		    {
		        al[i]=new ArrayList<Integer>();
		    }
		    int bmax=0;
		    
		    // here brands are separated based on customers
		    for(int i=0;i<c;i++)
		    {
		        System.out.println("Enter Customer Number");
		        int key=sc.nextInt();
		        System.out.println("Enter Brand Nnumbers");
		        String s=sc.next();
		        String temp[]=s.split(",");
		        for(int j=0;j<temp.length;j++)
		           {
		               int a=Integer.parseInt(temp[j]);
		               bmax=a>bmax?a:bmax;
		               al[key].add(a);
		           }
		        
		    }
		    System.out.println(bmax);
		    
		    ArrayList<Integer>real[]= new ArrayList[bmax+1];
		    for(int i=0;i<=bmax;i++)
		    {
		        real[i]=new ArrayList<Integer>();
		    }
		    int cust=0;
		    for(int i=0;i<c;i++)
		    {
		    	List<Integer>temp=al[i];
		    	System.out.println(temp.size());
		    	for(int j=0;j<temp.size();j++)
		    	{
		    		System.out.println(temp.get(j));
		    		List<Integer>t=real[temp.get(j)];
		    		
		    				t.add(i);
		    	}
		    	
		    }
		    for(int i=0;i<=bmax;i++)
		    {
		    	if(real[i].size()>cust)
		    	{
		    		cust=real[i].size();
		    	}
		    }
		    System.out.println("largest customer size is"+cust);
		    boolean remaining[]=new boolean[c];
		    boolean index[]=new boolean[bmax+1];
		    boolean temp[]=new boolean[c];
		    int count=0;
int k;		    
for(int i=cust;i>=1;i--)
   {
  		 for(int j=0;j<=bmax;j++)
		    {
		       if(real[j].size()==i)
	    		   {
	    		     for(k=0;k<c;k++)
		    		    {
		    			    if(!temp[k]&&real[j].contains(k))
		    			      {
		    				     temp[k]=true;
		    				     count+=1;
		    			      }
		    		    }
	    		   }
		       if(count==i)
		          {
		    	      for(int l=0;l<c;l++)
		    	         {
		    		        if(temp[l])
		    		          {
		    			         remaining[l]=true;
		    		          }
		    	         }
		    	       index[j]=true;
		          }
		      else
		       {
		    	    for(int l=0;l<c;l++)
		    	      {
		    		
		    			temp[l]=remaining[l];
		    		
		    	     }
		       }
		       count=0;
		  }
    }
for(int i=0;i<=bmax;i++)
{
	if(index[i])
	{
	System.out.println("Brand number you need to remember is "+i);
	}
}
		    
		     

	}
	

}
