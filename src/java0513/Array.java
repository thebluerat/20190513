package java0513;

import java.util.Scanner;

public class Array
{

	private int sanghyeok[][] = //왜 private int?
	{
				{1,1,1,1,1,1,1,1,1,1},
				{1,0,2,0,0,0,3,3,3,1},
				{1,0,2,0,4,0,0,0,3,1},
				{1,0,2,0,4,0,5,0,0,1},
				{1,0,2,0,4,0,5,0,0,1},
				{1,0,2,0,4,0,5,0,0,1},
				{1,0,2,0,4,0,5,0,0,1},
				{1,0,2,0,4,0,5,5,0,1},
				{1,0,0,0,4,0,0,0,0,1},
				{1,1,1,1,1,1,1,1,0,1},
		}; //배열 만들기 - 타입, 우항을 좌항[][]에 넣기
		
	public void Screen(int tx, int ty) //맵 표현. tx, ty: 캐릭터 좌표. 맵 표현에 캐릭터 좌표가 들어간다! 왜 
	 {
		
		for(int y = 0; y<sanghyeok.length; y++ ) //맵 표현
		{
			for(int x = 0; x<sanghyeok[y].length; x++)
			{
				if(tx == x && ty == y) //
				{
					System.out.print("p");
				}else if(sanghyeok[y][x]==1)
				{
					System.out.print("■");
				}else if(sanghyeok[y][x]==2)
				{
					System.out.print("○");
				}else if(sanghyeok[y][x]==3)
				{
					System.out.print("＠");
				}else if(sanghyeok[y][x]==4)
				{
					System.out.print("▲");
				}else if(sanghyeok[y][x]==5)
				{
					System.out.print("§");
				}else if(sanghyeok[y][x]==0)
				{
					System.out.print("□");
				}
			}System.out.println();
		}
	 }
	
	public void Game()
	{
		int tx = 1;
		int ty = 1; //캐릭터 좌표 (1,1)
		int mx = tx;
		int my = ty; //mx, my: 움직이는 x, y 좌표
		
		Screen(tx, ty); 
		Scanner sc = new Scanner(System.in);
		
		while(true) //true -> 0에 있을 때를 말함
		{
			switch(sc.next().toUpperCase())
			{
			case "W": my--;
			break;
			case "D": mx++;
			break;
			case "S": my++;
			break;
			case "A": mx--;
			break;
			default:
				break;
			}
			
			if(Move(mx, my))
			{
				tx = mx; 
				ty = my; //움직여라
			}else
			{
				mx = tx;
				my = ty; //그 자리에 있어라
			}
			Screen(tx, ty); //움직인 것을 출력하는 것
			
			if(tx==8 && ty==9) //끝내기
			{
				System.out.println("끝");
				break;
			}
				
		}
	}

    public boolean Move(int mx, int my) //Move: 움직이는 것
    {
    	if(sanghyeok[my][mx]==0) //0에서만 움직이게 하는 것
    	{
    		return true;
    	}return false;
    }
}