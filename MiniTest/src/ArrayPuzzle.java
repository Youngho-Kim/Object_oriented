
public class ArrayPuzzle {

	// Ŭ������ ����� ������ ���� ���ؼ� �Լ��� ����� �ִ� ���� ����.
	
	
	
	public void puzzle(int count){
		
		int temp[] = new int[9];
		int x = 0;
		int y = 0;
		
		
		
		for(int i=0; i<count*count;i++)
		{
			temp[i] = i+1;
		}
		for(int i=0; i<count;i++)
		{
			if(i < count)
			{
				System.out.print(i+1);
			}
			else
			{
				for(int j=i;j>=0;j--)
				{
					System.out.print(temp[j]);
				}
			}
			if(temp[i]%3 == 0)
			System.out.println();
		}
		
//		
//
//		
//		
//		
//		
//		int result[][] = new int[3][3];
//		int count = 0;
//		int temp = 0;
//		int temp1 = 0;
//		for(int i=0;i<result.length;i++)
//		{
//				temp++;
//			    result[i][temp]=count;
//			    count=count+1;
//		}
//		// 2���� �迭 ���
//		for(int i=0; i<result.length;i++)
//		{
//			for(int j=0;j<result[0].length;j++)
//			{
//				System.out.print(result[i][j]);
//			}
//			System.out.println("");
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void drawSnail(int count)
	{
		// �� ����ؾ��ϴ� ����� ����
		int total = count*count;
		int array[][] = new int[count][count];
		int i=0;
		int j=0;
		
		
		int x = 0;
		int y = -1;
		int n=1;
		
		int t=1;
		
		while(n<=total)
		{
			// ��
			for(; j<count;j++)	//3�� �ݺ�
			{
				array[i][j] = n++;
			}
			j--;
			
			// ��
			for(i=1;i<count;i++)		// 2�� �ݺ�
			{
				array[i][j] = n++;
//				System.out.println(array[i][j]);
			}
			i--;
//			System.out.println(i);
//			System.out.println(j);
			// ��
			for(j=1; j>=0;j--)				// 2�� �ݺ�
			{
				
//				System.out.println(j);
				array[i][j] = n++;
			}
			
			j++;
			// ��
			for( ; i>0;i--)				// 1�� �ݺ�
			{
				
				System.out.println(i);
				array[i][j] = n++;
				System.out.println(array[i][j]);
			}
			
			i = 1;
			j = 1;
			

		}
		// 2���� �迭 ���
		for(i=0; i<array.length;i++)
		{
			for(j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");	// array���
			}
			System.out.println("");
		}
	}
	public void finddrawSnail(int count)
	{
		// �� ����ؾ��ϴ� ����� ����
		int total = count*count;
		int array[][] = new int[count][count];
		int i=0;	// for��
		int x = 0;	// x�� ��
		int y = -1;	// y�� ��
		int n=1	;	// ��
				
		
		int t=1;	// reverse �� 
//		����ϱ�
		while(n<=total)
		{
			for(i=0;i<count;i++) //�� ǥ��
		    {
		      y=y+t;		// y�� �� ����(���϶��� ������(+1) �Ʒ��϶��� �ݴ����(-1))
		      array[x][y]=n++;	// array�� �� �ø���
		    }
			count--;	// ó������ count �� ��ŭ�� �ݺ������� y��� x���� �ѹ��� �ݺ��Ҽ��� count ���� ��������.
		    for(i=0;i<count;i++)// �� ǥ��
		    {
		      x=x+t;// x�� �� ����(���϶��� ������(+1) ���϶��� �ݴ����(-1))
		      array[x][y]=n++;	// array�� �� �ø���
		    }
		    t=t*-1;	// ���� �����ϱ� ������ +1 / �ݴ���� -1
		} 	
		// 2���� �迭 ���
		for(x=0; x<array.length;x++)
		{
			for(y=0;y<array[0].length;y++)
			{
				System.out.print(array[x][y]);
				// ���ڸ� �̻��� ���� ������ ���� �򰥷��� ���⸦ �־����
				if(array[x][y]<10)
				{
					System.out.print("  ");
				}
				else if(array[x][y]>=10||array[x][y]<100)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}
