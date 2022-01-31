public class Ex43 {

    class Main
{
    public static void findPair(int[] nums, int target)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
                    return;
                }
            }
        }

        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 6, 2, 5, 3, 1 };
        int target = 10;
 
        findPair(nums, target);
    }
}
}
