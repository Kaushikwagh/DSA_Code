public class K_BinarySearch_11 {
//    Steps:-
//    1. Start
//    2. Take input array and no
//    3. Initialise start = 0 and end = (array size -1)
//    4. Intialise mid variable
//    5. mid = (start+end)/2
//    6. if array[ mid ] == target then return mid
//    7. if array[ mid ] < target then start = mid+1
//    8. if array[ mid ] > target then end = mid-1
//    9. if start<=end then goto step 5
//    10. return -1 as Not element found
    public static int binary(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
       while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] < target)
            start = mid + 1;
        else
            end = mid - 1;
    }
       return -1;
}
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12,};
        int no = 6;
        int res = binary(arr, no);
        System.out.println("Element is " + res);
    }
}
