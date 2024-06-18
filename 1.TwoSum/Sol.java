import java.util.Scanner;
class Sol 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int arrSize = s.nextInt();
        
        int [] numbers = new int[arrSize];

        for(int i = 0; i < arrSize; i++)
        {
            numbers[i] = s.nextInt();
        }

        System.out.println(twoSum(numbers, target));
    }
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
            }
            else
            {
                return null;
            }
        } 
        return index;
    }
}