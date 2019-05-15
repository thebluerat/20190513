package fruit;

public class apples implements fruits {

	@Override
	public void correct(String 품종) {
		String[] 품종들 = {"황금사과", "독사과"};
		
		for(int i = 0; i < 품종들.length; i++) {
		if(품종.equals(품종들[i]))
		{
			System.out.println("사과가 맞다");
		}else
		{
			System.out.println("아니다");
		}break;

	}
	}

}
