
//QUESTION:https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
package Home;

import java.util.*;


public class BreakingRecords {

    static int[] getRecord(int[] s,int n){
        int high=0,low=0,highest,lowest;
        int result[]=new int[2];
        highest=s[0];
    	lowest=s[0];
        for(int count=0;count<n;count++)
        {
        	
            if(highest<s[count])
            {
                highest=s[count];
                high++;
            }
            if(lowest>s[count])
            {
                lowest=s[count];
                low++;
            }
        }
        result[0]=high;
        result[1]=low;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s,n);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
        in.close();
    }
}
