import java.util.HashMap;



public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    	int[] index = new int[2];
    	int temp = 0;
    	
    	if (numbers.length < 2) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
        	
        	if (!map.containsKey(numbers[i])) 
        		map.put(numbers[i], 1);        	
        	
        	if (map.containsKey(target - numbers[i])) {
        		index[0] = i;
        		temp = target - numbers[i];
        		break;
        	}        	

        }
        
        for (int i = index[0] + 1; i < numbers.length; i++) {
        	if (numbers[i] == temp) {
        		index[1] = i;
        		break;
        	}
        }
        return index;
    }
    
    public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int a[];
		a = new Solution().twoSum(numbers, 3);
		for (int i : a) {
			System.out.println(i);
		}
	}
}