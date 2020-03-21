public class FindMin {
    public static void main(String[] args) {
        int[] arr={4, 12, 7, 8, 1, 6, 9};
        int index=MinValue(arr);
        StringBuilder original=new StringBuilder();
        for (int i=0; i<arr.length; i++)
        {
            original.append(arr[i]).append(" ");
        }
        System.out.println("Array: "+original);
        System.out.println("The smallest element in the array is: "+index);
    }

    public static int MinValue(int[] arr){
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
