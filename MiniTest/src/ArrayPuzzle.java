
public class ArrayPuzzle {

	// 클래스를 만들면 수식을 쓰기 위해서 함수를 만들어 주는 것이 좋다.
	
	
	
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
//		// 2차원 배열 출력
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
		// 총 출력해야하는 출력의 개수
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
			// 북
			for(; j<count;j++)	//3번 반복
			{
				array[i][j] = n++;
			}
			j--;
			
			// 동
			for(i=1;i<count;i++)		// 2번 반복
			{
				array[i][j] = n++;
//				System.out.println(array[i][j]);
			}
			i--;
//			System.out.println(i);
//			System.out.println(j);
			// 남
			for(j=1; j>=0;j--)				// 2번 반복
			{
				
//				System.out.println(j);
				array[i][j] = n++;
			}
			
			j++;
			// 서
			for( ; i>0;i--)				// 1번 반복
			{
				
				System.out.println(i);
				array[i][j] = n++;
				System.out.println(array[i][j]);
			}
			
			i = 1;
			j = 1;
			

		}
		// 2차원 배열 출력
		for(i=0; i<array.length;i++)
		{
			for(j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");	// array출력
			}
			System.out.println("");
		}
	}
	public void finddrawSnail(int count)
	{
		// 총 출력해야하는 출력의 개수
		int total = count*count;
		int array[][] = new int[count][count];
		int i=0;	// for문
		int x = 0;	// x축 값
		int y = -1;	// y축 값
		int n=1	;	// 합
				
		
		int t=1;	// reverse 값 
//		계산하기
		while(n<=total)
		{
			for(i=0;i<count;i++) //행 표현
		    {
		      y=y+t;		// y축 값 변경(위일때는 정방향(+1) 아래일때는 반대방향(-1))
		      array[x][y]=n++;	// array에 값 늘리기
		    }
			count--;	// 처음에는 count 값 만큼만 반복하지만 y축과 x축을 한번씩 반복할수록 count 값은 내려간다.
		    for(i=0;i<count;i++)// 열 표현
		    {
		      x=x+t;// x축 값 변경(우일때는 정방향(+1) 좌일때는 반대방향(-1))
		      array[x][y]=n++;	// array에 값 늘리기
		    }
		    t=t*-1;	// 방향 선택하기 정방향 +1 / 반대방향 -1
		} 	
		// 2차원 배열 출력
		for(x=0; x<array.length;x++)
		{
			for(y=0;y<array[0].length;y++)
			{
				System.out.print(array[x][y]);
				// 두자리 이상의 값을 나오면 보기 헷갈려서 띄어쓰기를 넣어놨음
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
