package ctci;

/*
 	Given an array of integers, find two numbers such that they add up to a specific target number.

	The function twoSum should return indices of the two numbers such that they add up to the target, 
	where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

	You may assume that each input would have exactly one solution.

	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2
 
 */

public class Question1 {
	public static void main(String[] args){	
		int[] ints = {3,2,4};
		prt(twoSum(ints, 6));
	}
	
	public static void prt(Object obj){
		System.out.println(obj);
	}
	public static void prt(int[] ints){
		if(ints==null){
			System.out.println("null");
		}
		else{
			for(int i: ints)
				System.out.print(i);
		}
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i<nums.length; i++ ){
			for (int j = 1; j<nums.length; j++){
				if(i!=j && nums[i]+nums[j] == target){
					int[] indexes ={i+1, j+1};
					return indexes;
				}
			}
		}
		return null;
    }
}
