package Star;

// can be used for getting combinations without having to use recursion
// Amazon
import java.util.ArrayList;
import java.util.HashMap;

public class MyPhoneNumber {
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
	public static ArrayList<String> result(String num)
	{
		String letters;
		ArrayList<String> result=new ArrayList<String>();
		ArrayList<String> tres=new ArrayList<String>();
		result.add("");
		for(int count=0;count<num.length();count++)
		{
			for(String s:result)
			{
				letters=map.get(num.charAt(count));
				for(int index=0;index<letters.length();index++)
					tres.add(s+letters.charAt(index));
			}
			result=tres;
			tres=new ArrayList<String>();
		}
		
		return result;
	}
	public static void main(String ar[])
	{
	/*final HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(2,"abc");
	map.put(3,"def");
	map.put(4,"ghi");
	map.put(5,"jkl");
	map.put(6,"mno");
	map.put(7,"pqrs");
	map.put(8,"tuv");
	map.put(9,"wxyz");
	*/
	ArrayList<String> a=new ArrayList<String>();
	a=result("234");
	
	for(String x:a)
	{
		System.out.println(x);
	}


	}
	

}
