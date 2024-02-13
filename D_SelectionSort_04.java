public class D_SelectionSort_04 {
    public static void print(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={6,4,5,3,7,1,2};
        for(int i=0; i<arr.length-1;i++){
            int small = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
}