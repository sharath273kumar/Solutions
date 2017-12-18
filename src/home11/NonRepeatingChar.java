package home11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
	public static void main(String arg[]) throws IOException
	{
		char x;
		int y,min;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int length=str.length();
		for(int count=0;count<length;count++)
		{
			x=str.charAt(count);
			if(map.get(x)==null)
				map.put(x, 1);
			else
			{
				y=map.get(x);
				//System.out.println(y);
				map.put(x, ++y);
			}
			
		}
		for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet())
		{
			min=(int) m.getValue();
			if(min==1)
			{
				System.out.println(m.getKey());
				break;
			}
		}
	}

}
