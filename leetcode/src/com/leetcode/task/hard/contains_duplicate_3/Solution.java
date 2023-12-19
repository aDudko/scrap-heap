package com.leetcode.task.hard.contains_duplicate_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));      // true
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,91}, 2, 3)); // false
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff < 1 || valueDiff < 0) return false;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) valueDiff + 1);
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= valueDiff)
                    || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= valueDiff))
                return true;
            if (map.entrySet().size() >= indexDiff) {
                long lastBucket = ((long) nums[i - indexDiff] - Integer.MIN_VALUE) / ((long) valueDiff + 1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }

//    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
//        int i = 0, j = 1;
//        while(j < nums.length){
//            int indexDistance = Math.abs(i - j);
//            int valueDistance = Math.abs(nums[i] - nums[j]);
//            if (indexDistance <= indexDiff && valueDistance <= valueDiff) {
//                return true;
//            } else if (indexDistance == indexDiff || j == nums.length - 1) {
//                j = ++i;
//            }
//            j++;
//        }
//        return false;
//    }

//    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j <= i + indexDiff; j++) {
//                if (j < nums.length) {
//                    boolean isIndex = Math.abs(i - j) <= indexDiff;
//                    boolean isValue = Math.abs(nums[i] - nums[j]) <= valueDiff;
//                    if (isIndex && isValue) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}
