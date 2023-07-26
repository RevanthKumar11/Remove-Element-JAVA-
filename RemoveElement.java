package leecodes;
import java.util.Arrays;
public class RemoveElement {

	public static void main(String[] args) 
	{
		
		int[] nums = {3,2,2,3}; // 01222304
		int val = 3;
		String[] arr = new String[nums.length];
		int c = 0;
		int k = 0;
		
		for(int i = 0; i<= nums.length - 1; i++)
		{
			if(nums[i] != val)
			{
				arr[c] = String.valueOf(nums[i]); 
				c++;
			}
		}
		
		k = c;
	
		
		for(int i = 0; i <= (Math.abs(k - nums.length) - 1); i++)
		{
			String x = "_";
			arr[c] = x; 
			c++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}


// 