
public class Main
{
    public static void mohan(int a)
    {
        if (a==4)
        return;
        a++;
        mohan(a);
        System.out.println("Mohan ");
        mohan(a);
        System.out.println("Velu ");
    }
	public static void main(String[] args) {
		String num="12";
		for(char a:num.toCharArray())
		{
		    System.out.println();
		    mohan(a-'0');
		}
		
	}
}