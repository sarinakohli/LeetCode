class Sol 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int [] index = new int[2];
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] + nums[i+1] == target)
            {
                index[0] = i;
                index[1] = i+1;
                return index;
            }
            else if(nums[i] + nums[nums.length -1] == target)
            {
                index[0] = i;
                index[1] = nums.length-1;
                return index;
            }
            else
            {
                return null;
            }
        } 
        return index;
    }
}