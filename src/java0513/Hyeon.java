package java0513;

public class Hyeon
{
	public int map[][]=
		{
				{1,1,1,1,1,1,1},
				{1,0,0,0,0,0,1},
				{1,0,1,1,1,2,1},
				{1,0,1,4,0,1,1},
				{1,0,1,1,0,1,1},
				{1,0,3,0,0,0,5},
				{1,1,1,1,1,1,1}
		};
	
	public void screen(int tx, int ty)
	{
		for(int y = 0; y < map.length; y++)
		{
			for(int x = 0; x < map[y].length; x++)
			{
				if(tx == x && ty == y)
				{
					System.out.print("P\t");
				}else if(map[y][x]==1)
				{
					System.out.print("■\t");
				}else if(map[y][x]==2)
				{
					System.out.print("＠\t");
				}else if(map[y][x]==4)
				{
					System.out.print("↔\t");
				}else if(map[y][x]==3)
				{
					System.out.print("○\t");
				}else if(map[y][x]==5)
				{
					System.out.print("●\t");
				}else if(map[y][x]==0)
				{
					System.out.print("□\t");
				}
			}System.out.println();
		}
		
	}
	
	public void game()
	{
		
	}
	
}
