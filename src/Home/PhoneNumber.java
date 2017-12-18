/*
QUESTION:http://www.geeksforgeeks.org/find-possible-words-phone-digits/
Print all possible words from phone digits
3.5
Before advent of QWERTY keyboards, texts and numbers were placed on the same key. For example 2 has “ABC” if we wanted to write anything starting with ‘A’ we need to type key 2 once. If we wanted to type ‘B’, press key 2 twice and thrice for typing ‘C’. below is picture of such keypad.

phoneKeyboard

Given a keypad as shown in diagram, and a n digit number, list all words which are possible by pressing these numbers.
For example if input number is 234, possible words which can be formed are (Alphabetical order):
adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
Let’s do some calculations first. How many words are possible with seven digits with each digit representing n letters? For first digit we have at most four choices, and for each choice for first letter, we have at most four choices for second digit and so on. So it’s simple maths it will be O(4n). Since keys 0 and 1 don’t have any corresponding alphabet and many characters have 3 characters, 4n would be the upper bound of number of words and not the minimum words.

Now let’s do some examples.
For number above 234. Do you see any pattern? Yes, we notice that the last character always either G,H or I and whenever it resets its value from I to G, the digit at the left of it gets changed.
Similarly whenever the second last alphabet resets its value, the third last alphabet gets changes and so on. First character resets only once when we have generated all words. This can be looked from other end also. That is to say whenever character at position i changes, character at position i+1 goes through all possible characters and it creates ripple effect till we reach at end.
Since 0 and 1 don’t have any characters associated with them. we should break as there will no iteration for these digits.
Let’s take the second approach as it will be easy to implement it using recursion. We go till the end and come back one by one. Perfect condition for recursion. let’s search for base case.
When we reach at the last character, we print the word with all possible characters for last digit and return. Simple base case.
When we reach at the last character, we print the word with all possible characters for last digit and return. Simple base case.
*/
package Home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
public static void main(String a[])
{
	ArrayList<String> ar=new ArrayList<String>();
	ar=letterCombinations("987");
	
	for(String x:ar)
	{
		System.out.println(x);
	}
	
}

public static ArrayList<String> letterCombinations(String digits) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(2, "abc");
    map.put(3, "def");
    map.put(4, "ghi");
    map.put(5, "jkl");
    map.put(6, "mno");
    map.put(7, "pqrs");
    map.put(8, "tuv");
    map.put(9, "wxyz");
    map.put(0, "");
 
    ArrayList<String> result = new ArrayList<String>();
 
    if(digits == null || digits.length() == 0)
        return result;
 
    ArrayList<Character> temp = new ArrayList<Character>();
    getString(digits, temp, result, map);
 
    return result;
}
 
public static void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
    if(digits.length() == 0){
        char[] arr = new char[temp.size()];
        for(int i=0; i<temp.size(); i++){
            arr[i] = temp.get(i);
        }
        result.add(String.valueOf(arr));
        return;
    }
 
    Integer curr = Integer.valueOf(digits.substring(0,1));
    String letters = map.get(curr);
    for(int i=0; i<letters.length(); i++){
        temp.add(letters.charAt(i));
        getString(digits.substring(1), temp, result, map);
        temp.remove(temp.size()-1);
    }
}
}
