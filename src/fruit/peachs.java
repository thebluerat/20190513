package fruit;

public class peachs implements fruits {

	@Override
	public void correct(String 품종) {
		
			String[] 품종들 = {"황도복숭아", "천도복숭아"};
			
			for(int i = 0; i < 품종들.length; i++) {
			if(품종.equals(품종들[i]))
			{
				System.out.println("복숭아가 맞다");
			}else
			{
				System.out.println("아니다");
			}break;

		}

	}

}
