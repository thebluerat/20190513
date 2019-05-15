package java0515;

public class dog implements animals {

	@Override
	public void cry(String 품종) {
		String[] 품종들 = { "포메라니안", "치와와", "푸들"};

		for(int i = 0; i < 품종들.length; i++)
		{
			if(품종.equals(품종들[i]))
			{
				System.out.println("강아지가 맞다");
				break;
			}
		}
	}

}
