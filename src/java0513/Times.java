package java0513;

 public class Times
{

/*	public static void main(String[] args) 
	{
		for(int i = 1; i < 10; i++)
		{System.out.println(i + "단");
			for(int j = 1; j < 10; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
			}System.out.println();
		}
	}*/
	
/*	public static void main(String[] args)
	{
		for(int i = 1; i <10; i+=3)
		{
			System.out.println(i + "단\t\t" + (i+1) + "단\t\t" + (i+2) + "단\t\t");
			for(int j = 1; j <10; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j + "\t" + (i+1) + " * " + j + " = " + (i+1)*j + "\t" + (i+2) + " * " + j + " = " + (i+2)*j);
			}System.out.println();
			
		}
	}*/
	 
	 public static void main(String[] args)
	 {
		 for(int i = 1; i < 4; i++)
		 {
			 System.out.println(i + "단\t\t" + (i+3) + "단\t\t" + (i+6) + "단\t\t");
			 for(int j = 1; j <10; j++)
			 {
				 System.out.println(i + " * " + j + " = " + i*j + "\t" + (i+3) + " * " + j + " = " + (i+3)*j + "\t" + (i+6) + " * " + j + " = " + (i+6)*j);
			 }System.out.println();
		 }
	 }

}
