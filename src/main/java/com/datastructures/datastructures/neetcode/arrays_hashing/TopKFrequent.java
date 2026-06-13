package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        //count in map
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        //add in bucket
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for (Map.Entry<Integer, Integer> map: countMap.entrySet()) {
            int key = map.getKey();
            int val = map.getValue();
            if((bucket[val]) == null) {
                bucket[val] = new ArrayList<>();
                bucket[val].add(key);
            } else {
                bucket[val].add(key);
            }
        }

        //scan the bucket
        List<Integer> sortedResult = new ArrayList<>();
        for (List<Integer> arr : bucket) {
            if(arr !=null){
                for (Integer element: arr) {
                    sortedResult.add(element);
                }
            }
        }

        //return the result for k
        int[] result = new int[k];
        int j = 0;

        for (int i = sortedResult.size() - 1; i >= 0 && j < k; i--) {
            result[j] = sortedResult.get(i);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
       TopKFrequent topKFrequent = new TopKFrequent();
       int [] nums = {1,2,2,3,3,3};
       int[] res = topKFrequent.topKFrequent(nums, 2);
        Arrays.asList(res).stream().forEach(s -> System.out.print(s + " "));
    }
}
