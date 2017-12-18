package home11;

public class EgyptialFracction {
	public static void main(String agr[])
	{
		int nr=7,dr=15;
		fraction(nr,dr);
		
	}
	public static void fraction(int nr,int dr)
	{
		int f=(int) Math.ceil(dr/nr)+1;
		System.out.println("1/"+f);
		if((nr*f)-(dr*1)/dr*f>0)
			fraction((nr*f)-(dr*1),dr*f);
	}

}
