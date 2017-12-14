import java.util.*;


public class HackerString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("hello");
        int q = in.nextInt();
        int a,b=0,flag=0;
        String w="hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
         //  int len=s.length();
        while(flag <=8)
        {
            a=s.indexOf(w.charAt(flag),b);
            b=s.indexOf(w.charAt(flag+1),a+1);
            //System.out.println(w.charAt(flag)+"<"+w.charAt(flag+1));
            //System.out.println(a+"<"+b);
            if(a<b)
            {
                flag++;
                //System.out.println(flag);
            }
            else
                flag=11;
        }
            if(flag==9)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
