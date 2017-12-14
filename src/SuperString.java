import java.util.*;


public class SuperString {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
         StringBuffer str=new StringBuffer(s);
         
        // int len=str.length();
         //str=new StringBuffer(len);
         //System.out.println(str.capacity());
        for(int count=0;count<str.length();count++)
        {
            if(str.charAt(count)==str.charAt(count+1))    
            {
                str.delete(count,count+2);
                System.out.println(str);
                count--;;
            }

        }
       if(str.capacity()==0)
            System.out.println("Empty String");
        else
            System.out.println(str);
            in.close();
    }
  
    }

