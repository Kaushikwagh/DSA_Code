public class C_BubbleSort_03 {
    public static void print(int arr[]){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {6,4,5,3,7,1,2};
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } print(arr);
    }
}
