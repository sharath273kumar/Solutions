package Home;

import java.util.ArrayList;
import java.util.HashMap;
public class X {
    public static ArrayList<String> letterCombinations(String digits) {
    	String letters;
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> preres = new ArrayList<String>();
        res.add("");

        for(int i=0;i<digits.length();i++){
            for(String str: res)
            {
            	//System.out.println(str);
                letters = map.get(digits.charAt(i));
                for(int j=0;j<letters.length();j++)
                    preres.add(str+letters.charAt(j));
            }

            res = preres;
            preres = new ArrayList<String>();
        }      
        return res;
    }

    static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }} ;
    public static void main(String aa[])
    {
    	ArrayList<String> ar=new ArrayList<String>();
    	ar=letterCombinations("234");
    	
    	for(String x:ar)
    	{
    		System.out.println(x);
    	}
    }
}