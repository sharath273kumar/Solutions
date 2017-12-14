package Codiva;

import java.util.*;
import java.util.ArrayList;
public class Camera {
	static ArrayList<Integer> ar=new ArrayList<Integer>();
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] brands = new int[n];
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(n);
        for (int i = 0; i < n; i++)
            map.put(i, new ArrayList<Integer>());
        
        for(int brands_i = 0; brands_i < n; brands_i++){
        	 brands[brands_i]= in.nextInt();
        }
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        int key;
        
        
        for(int count=0;count<n;count++)
        {
        	key=brands[count];
        	ArrayList<Integer> l=map.get(key);
        	l.add(prices[count]);
        }
       /* for (int i = 0; i < n; i++) {
            ArrayList<Integer> values = map.get(i);
            for (int str : values) {
                System.out.println(str + " ");
            }
        }*/
        int q = in.nextInt();
        ArrayList<Integer> answer=new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++){
            int d = in.nextInt();
            int[] cameras = new int[d];
            for(int cameras_i = 0; cameras_i < d; cameras_i++){
                cameras[cameras_i] = in.nextInt();
            }
            int k = in.nextInt();
            result(brands,prices,cameras,k,map);
        }
        
        in.close();
    }
	public static void result(int []brands,int []prices,int []cameras,int k,HashMap<Integer,ArrayList<Integer>> map)
	{
		int value;
		for(int count=0;count<cameras.length;count++)
		{
			ArrayList<Integer> ll=map.get(cameras[count]);
			for (int str : ll)
                System.out.println(str + " ");
			System.out.println("break");
			Object a[]=ll.toArray();
			Arrays.sort(a);
			//ar.add((Integer)a[k-1]);
			value=(int)a[k-1];
			System.out.println(value);
		}
		System.out.println("Done loop");
		for(int count:ar)
			System.out.println(count);
	}
	

}
