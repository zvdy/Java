// LeetCode problem 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        // we initialize the length of the array to 0
        int i = 0;
        // We loop through the array and check if the current element is equal to the next element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}