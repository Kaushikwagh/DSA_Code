//  Q1. find target index in array

// public class F_BruteForce_06 {
//    public static int bruteForce(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i; // Return the index of the first occurrence
//            }
//        }
//
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] no = {1, 5, 8, 3, 7, 9, 2};
//        int target = 7;
//        int result = bruteForce(no, target);
//        if (result != -1) {
//            System.out.println("Target number " + target + " found at index: " + result);
//        } else {
//            System.out.println("Target number " + target + " not found in the array.");
//        }
//    }
//}

// Q2. find all pairs of elements in an array that add up to a specific target sum

import java.util.ArrayList;
import java.util.List;
class F_BruteForce_06{
    public static List<int[]> findPairsWithSum(int[] array, int targetSum) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    int[] pair = {array[i], array[j]};
                    result.add(pair);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] numbers = {2, 7, 4, 5, 11, 15};
        int targetSum = 9;

        List<int[]> pairs = findPairsWithSum(numbers, targetSum);
        if (!pairs.isEmpty()) {
            System.out.println("Pairs with sum " + targetSum + ":");
            for (int[] pair : pairs) {
                System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            }
        } else {
            System.out.println("No pairs found with sum " + targetSum);
        }
    }
}