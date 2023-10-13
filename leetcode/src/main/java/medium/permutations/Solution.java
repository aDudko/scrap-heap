package main.java.medium.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
        System.out.println(permute(new int[]{0,1}));
        System.out.println(permute(new int[]{1}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        find(nums, nums.length, 0, ans);
        return ans;
    }

    public static void find(int[] arr, int n, int ind, List<List<Integer>> ans){
        if(ind == n){
            List<Integer> ds = new ArrayList<>();
            for(int it : arr){
                ds.add(it);
            }
            ans.add(ds);
            return;
        }

        for(int i=ind; i<n;i++){
            swap(arr, i, ind);
            find(arr, n, ind+1, ans);
            swap(arr, i, ind);
        }
    }

    public static void swap(int[] arr, int si, int ei){
        int t = arr[si];
        arr[si] = arr[ei];
        arr[ei] = t;
    }
}
