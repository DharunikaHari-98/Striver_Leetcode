public class Solution {
    public int[] sortArray(int[] nums) {
        // Call merge sort on the entire array
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    // Merge sort method
    private void mergeSort(int[] nums, int left, int right) {
        // Base case: if the subarray has more than one element
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort left half
            mergeSort(nums, left, mid);

            // Recursively sort right half
            mergeSort(nums, mid + 1, right);

            // Merge the sorted halves
            merge(nums, left, mid, right);
        }
    }

    // Merge method to combine two sorted subarrays
    private void merge(int[] nums, int left, int mid, int right) {
        // Calculate lengths of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = nums[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = nums[mid + 1 + j];
        }

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;

        // Merge the temporary arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method for debugging
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5500, 420, 365, 810, 125, 230}; // Example input with higher values

        System.out.println("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        int[] sortedArray = solution.sortArray(nums);

        System.out.println("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
