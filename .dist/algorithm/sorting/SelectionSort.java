public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={9,3,7,5,1,3};
       
         selectionSort(arr);
   }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]) min=j;
            }
            int temp=arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
        
         for(int i=0;i<arr.length;i++){
            System.out.println( arr[i]);
        }
         System.out.println(" Section sort completed");
    }
}
