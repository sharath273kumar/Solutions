package Codiva;

import java.io.*;
import java.util.*;

public class MiniMaxi {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int type,l,r,val,count=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int index=0;index<n;index++)
            ar.add(0);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
               
        
        for(int counter=0;counter<q;counter++)
        {
        String pair[]=br.readLine().split(" ");
        type=Integer.parseInt(pair[0]);
            if(type==1)
            {
                l=Integer.parseInt(pair[1])-1;
                r=Integer.parseInt(pair[2])-1;
                val=Integer.parseInt(pair[3]);
                for(int indexloop=l;indexloop<=r;indexloop++)
                {
                    ar.set(indexloop, ar.get(indexloop)^val);
                }
                //System.out.println(ar.toString());
            }
            else if(type==2)
            {
                count=0;
                l=Integer.parseInt(pair[1])-1;
                r=Integer.parseInt(pair[2])-1;
                for(int index=l;index<=r;index++)
                {
                    if(ar.get(index)==1)
                        {
                    	for(int countloop=l+1;countloop<=r;countloop++)
	                        {
	                            count++;
	                            //System.out.println(count);
	                            if((ar.get(countloop)==1))
	                                break;                         
	                        }
                        break;
                        }
                }
                System.out.println(count);
            }
            else if(type==3)
            {
                count=0;
                l=Integer.parseInt(pair[1])-1;
                r=Integer.parseInt(pair[2])-1;
                for(int index=l;index<=r;index++)
                {
                    if(ar.get(index)==1)
                    {
                        for(int countloop=r;countloop>=index;countloop--)
                        {
                            if(ar.get(countloop)==1)
                            {
                                count=r-index;
                            }
                        }
                        break;
                    }
                }
                System.out.println(count-1);
            }
            
        }
        
    }
}
