package excludes;

class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) return;
        int start = 0, mid = 0, end = nums.length - 1;
        while (mid <= end) {
            int num = nums[mid];
            switch (num) {
                case 0:
                    swap(nums, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, end);
                    end--;
                default:
                    break;
            }
            
        }
    }
    
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        // zero points to the first non zero element
        int zero = 0;
        while (zero < nums.length && nums[zero] == 0) {
            zero++;
        }
        // second points to the first non 2 element from the last
        int second = nums.length - 1;
        while (second >= 0 && nums[second] == 2) {
            second--;
        }

        int i = zero;

        while (i <= second) {
            if (nums[i] == 0) {
                swap(nums, zero, i);
                zero++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, second, i);
                second--;
            } else {
                i++;
            }


        }
    }
}