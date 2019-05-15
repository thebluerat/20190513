package java0515;

public class cat implements animals {

	@Override
	public void cry(String 품종) {
		String[] 품종들 = { "러시안블루", "페르시안"};

		for(int i = 0; i < 품종들.length; i++)
		{
			if(품종.equals(품종들[i]))
			{
				System.out.println("고양이가 맞다");
				break;
			}
		}
	}

}
