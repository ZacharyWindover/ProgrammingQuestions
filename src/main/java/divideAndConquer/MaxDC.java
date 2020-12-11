package divideAndConquer;

public class MaxDC {
    
	static int max;
	
	public static int maxDivideAndConquer(int[] list) {
		
		int max = list[0];
		
		findMax(list);		
		
		return max;
	}
	
	public static int findMax(int[] list) {
		
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
			
			int leftList[] = new int[(list.length + 1) / 2];
			int rightList[] = new int[(list.length) - (leftList.length)];
			
			System.arraycopy(list, 0, leftList, 0, leftList.length);
			System.arraycopy(list,  leftList.length, rightList, 0, rightList.length);		
			
			findMax(leftList);
			findMax(rightList);
		
		}
		
		return max;
		
	}
	
}
