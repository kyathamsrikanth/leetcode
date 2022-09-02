package amazon;

import java.util.HashMap;


// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 0;

        for(int i= 0;i<=nums.length-1;i++){
            k = target - nums[i];
            if(map.containsKey(k)){
                return new int[]{map.get(k),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = new TwoSum().twoSum(new int[]{3,4,2},6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
