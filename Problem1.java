/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] retArray = new int[2];
        for(int i=0;i<nums.length-1;i++){
           for(int j=i;j<nums.length;j++){
            if(i!=j && nums[i]+nums[j]==target){
                retArray[0]=i;
                retArray[1]=j;
                return retArray;
            }
           }
        }
        return retArray;
    }
}