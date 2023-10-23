// A. Create an array with the values (1,2,3,4,5,6,7) and shuffle it.

class ShuffleArr {
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArr(originalArr);
        
        System.out.print("Shuffle Array is : ");
        for (int num : originalArr) {
            System.out.print(num + " ");
        }
    }
    
    public static void shuffleArr(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1)); // Random index without Random class
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}



















