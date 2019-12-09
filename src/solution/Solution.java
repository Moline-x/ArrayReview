package solution;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return null;
        }
        int i=0,j=nums.length-1;
        while (i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int[] sum = new Solution().twoSum(arr, 9);
        for (int i = 0; i <sum.length ; i++) {
            System.out.println(sum[i]);
        }
    }
}