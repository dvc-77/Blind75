class Solution {
    public int findMin(int[] nums) {
        int lowerBound = 0;
        int upperBound = nums.length-1;

        while(lowerBound <= upperBound){
            int midpoint = (lowerBound + upperBound) / 2;
            if(nums[lowerBound] <= nums[upperBound])
                return nums[lowerBound];
            else if(nums[midpoint] > nums[lowerBound])
                lowerBound = midpoint + 1;
            else
                upperBound = midpoint - 1;
        }
        return 0;

    }

}