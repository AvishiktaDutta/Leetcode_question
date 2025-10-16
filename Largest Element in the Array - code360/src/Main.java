//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int largestElement(int[] arr, int n) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,66,7,8};
        int n = arr.length;
        int val  = largestElement(arr,n);
        System.out.println(val);
    }
}