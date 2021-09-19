public class Homework2{
    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;
        int a[] = Solution.twoSum(nums,target);
        for(int b:a)
            System.out.println(b);
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        //我们要找到2个数之和等于target
        //即我们需要找到nums[i] + nums[j] == target，并且返回他们的下标，即i和j，其中i != j
        int[] ans = new int[2]; //声明一个大小为2的数组用来保存结果
        //我们通过循环来遍历所有的数字
        int n = nums.length;  //用一个变量len保存nums的长度
        //i为第一个数的下标，nums一共有n个数，所以i的取值范围是[0, n-1]
        for(int i = 0; i < n; i++){
            //j为第二个数的下标。
            for(int j = i + 1; j < n; j++){
                //对于每个数nums[i]，我们验证一遍其他数（nums[j]）跟它的和是否等于target
                //如果满足条件
                if(nums[i] + nums[j] == target){
                    //将下标写入返回值数组里
                    ans[0] = i;
                    ans[1] = j;
                    //返回
                    return ans;

                }
            }
        }
        //默认返回值
        return new int[0];

    }
}



