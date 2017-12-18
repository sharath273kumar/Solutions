/*
QUESTION:https://www.hackerrank.com/challenges/countingsort4/problem
In this challenge you need to print the data that accompanies each integer in a list. In addition, if two strings have the same integers, you need to print the strings in their original order. Hence, your sorting algorithm should be stable, i.e. the original order should be maintained for equal elements.

Insertion Sort and the simple version of Quicksort were stable, but the faster in-place version of Quicksort was not (since it scrambled around elements while sorting).

In cases where you care about the original order, it is important to use a stable sorting algorithm. In this challenge, you will use counting sort to sort a list while keeping the order of the strings (with the accompanying integer) preserved.

Challenge 
In the previous challenge, you created a "helper array" that contains information about the starting position of each element in a sorted array. Can you use this array to help you create a sorted array of the original list?

Hint: You can go through the original array to access the strings. You can then use your helper array to help determine where to place those strings in the sorted array. Be careful about being one off.

Details and a Twist 
You will be given a list that contains both integers and strings. Can you print the strings in order of their accompanying integers? If the integers for two strings are equal, ensure that they are print in the order they appeared in the original list.

The Twist - Your clients just called with an update. They don't want you to print the first half of the original array. Instead, they want you to print a dash for any element from the first half.

Input Format 
- , the size of the list . 
-  lines follow, each containing an integer  and a string .

Output Format 
Print the strings in their correct order.

Constraints 
 
 is even 
 length(s)  
 
The characters in every string in lowercase.

Sample Input

20
0 ab
6 cd
0 ef
6 gh
4 ij
0 ab
6 cd
0 ef
6 gh
0 ij
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the
Sample Output

- - - - - to be or not to be - that is the question - - - -
Explanation 
Below is the list in the correct order. The strings of each number were printed above for the second half of the array. Elements from the first half of the original array were replaced with dashes.

0 ab
0 ef
0 ab
0 ef
0 ij
0 to
1 be
1 or
2 not
2 to
3 be
4 ij
4 that
4 is
4 the
5 question
6 cd
6 gh
6 cd
6 gh
*/
package Star;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

// Performance Improvements:
//     - used BufferedReader instead of Scanner: https://www.hackerrank.com/challenges/countingsort4/forum/comments/223339
//     - used StringBuffer to do 1 output to console instead of multiple outputs

public class FullCountingSort {
    public static void main(String[] args) throws IOException {
        final int maxValue = 100;
        
        /* Create HashMap with empty "buckets" to put Strings into */
        HashMap<Integer, ArrayList<String>> map = new HashMap<>(maxValue);
        for (int i = 0; i < maxValue; i++) {
            map.put(i, new ArrayList<String>());
        }
        
        /* Save input */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String [] pair = br.readLine().split(" ");
            int key        = Integer.parseInt(pair[0]);
            String value   = (i < n/2) ? "-" : pair[1];
            
            ArrayList<String> list = map.get(key);
            list.add(value);
        }
        br.close();
        
        /* Print output */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < maxValue; i++) {
            ArrayList<String> values = map.get(i);
            for (String str : values) {
                sb.append(str + " ");
            }
        }
        System.out.println(sb);
    }
}
