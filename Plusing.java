package myPack;

public class Plusing {
		float PI=22/7 ;
		
public int add(int a, int b)
{
	return a+b;
}
public int sub(int a, int b)
{
	return a-b;
}

	public static void main(String[] args) 
	{
		Plusing obj = new Plusing();
		System.out.println("add of numb:" +obj.add(5, 10));
		System.out.println("add of numb:" +obj.sub(10, 5));

	}

}
