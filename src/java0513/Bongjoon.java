package java0513;

import java.util.Scanner;

public class Bongjoon
{
	private int map[][]=
	{
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,1,0,0,0,0,0,0,1},
			{1,0,1,0,1,1,0,1,0,1},
			{1,0,1,2,1,0,0,1,0,1},
			{1,0,1,1,1,0,0,1,0,1},
			{1,0,1,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,1,0,1,1,0,1},
			{1,0,0,1,1,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	
	public void screen(int tx, int ty)
	{
		for(int y = 0; y < map.length; y++)
		{
			for(int x = 0; x < map[y].length; x++)
			{
				if(tx == x && ty == y)
				{
					System.out.print("p\t");
				}else if(map[y][x]==1)
				{
					System.out.print("■\t");
				}else if(map[y][x]==2)
				{
					System.out.print("▲\t");
				}else if(map[y][x]==0)
				{
					System.out.print("□\t");
				}
			}System.out.println();
		}
	}
	
	public void game()
	{
		int tx = 1;
		int ty = 1;
		int my = ty;
		int mx = tx;
		
		screen(tx, ty);
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			switch(sc.next().toUpperCase())
			{
			case "W": my--;
			break;
			case "A": mx--;
			break;
			case "D": mx++;
			break;
			case "S": my++;
			break;
			default:
				break;
			}
			
			if(move(mx, my)) //여기 때문에?
			{
				tx = mx;
				ty = my;
			}else if(tx==3 && ty==3)
			{
				tx = 1;
				ty = 1;
			}else
			{
				mx = tx;
				my = ty;
			}
			screen(tx, ty);
			
			if(tx==8 && ty==8)
			{
				System.out.println("끝");
				break;
			}
		}
	}
	
	public boolean move(int mx, int my) //순서가 바뀌면 작동하지 않음...
	{
		if(map[my][mx]==0 || map[my][mx]==2)
		{
			return true;
	}return false;
  }
}
