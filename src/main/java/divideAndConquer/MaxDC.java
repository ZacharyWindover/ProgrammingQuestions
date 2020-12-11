package divideAndConquer;

public class MaxDC {
    
	public static int maxDivideAndConquer(int[] list) {
		
		int max = list[0];
		
		findMax(list, max);		
		
		return max;
	}
	
	public static int findMax(int[] list, int max) {
		
		
		
		if (list.length == 1) {
			
			for (int x = 0; x < list.length; x++) {
				System.out.print(list[x] + ", ");
			}
			
			System.out.println("Entered");
			if (list[0] > max) {
				max = list[0];
			}
			
		}
		
		else {
			
			for (int x = 0; x < list.length; x++) {
				System.out.print(list[x] + ", ");
			}
			
			System.out.println("entered");
			
			int leftList[];
			int rightList[];
		
			// if list has even elements
			if (list.length % 2 == 0) {
				leftList = new int[list.length/2];
				
				for (int x = 0; x < list.length / 2; x++) {
					leftList[x] = list[x];
				}
				
				rightList = new int[list.length/2];
				
				for (int x = leftList.length; x < list.length; x++) {
					rightList[x-list.length] = list[x];
				}
			}
			
            /*
            I know the lack of working code may make it seem like I don't know what I'm doing,
            but please go through the code, I know what to do
            I'm having an index error, and it's just that,
            but even though I've tried to diagnose it with print statements,
            I can't identify why it isn't adding the characters to the arrays in time
            */
			// if list has odd elements
			else {
				leftList = new int[list.length / 2];
				
				for (int x = 0; x < leftList.length; x++) {
					leftList[x] = list[x];
				}
				
				rightList = new int[list.length - leftList.length];
				
				for (int x = leftList.length; x < rightList.length; x++) {
					int y = 0;
					
					rightList[y] = list[x];
					
					y++;
				}
				
			}
			
			System.out.println("left list: ");
			
			for (int x = 0; x < leftList.length; x++) {
				System.out.println(leftList[x]);
			}
			
			System.out.println("right list: ");
			
			for (int x = 0; x < rightList.length; x++) {
				System.out.println(rightList[x]);
			}
			
			findMax(leftList, max);
			findMax(rightList, max);
		
		}
		
		return max;
		
	}
	
}
