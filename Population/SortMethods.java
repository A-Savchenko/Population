
import java.util.List;

/**
 *	SortMethods - Sorts an array of Integers in ascending order.
 *
 *	@author
 *	@since
 */
public class SortMethods {

    /**
     *	Bubble Sort algorithm - in ascending order
     *	@param arr		array of Integer objects to sort
     */
    public static void bubbleSort(List<City> arr) {
        bubbleSort(arr,"ASC");
    }
    public static void bubbleSort(List<City> arr, String order) {
        boolean doSwap = false;

        for(int outer = arr.size()-1; outer > 0; outer--)
         {
            for(int inner = 0; inner < outer; inner++)
            {
                if (order.equals("ASC")) {if(arr.get(inner).compareTo(arr.get(inner+1))>0) doSwap = true;}
                else {if(arr.get(inner).compareTo(arr.get(inner+1))<0) doSwap = true;}

                if (doSwap) swap(arr, inner, inner+1);
                doSwap = false;
            }
        }
    }

    /**
     *	Swaps two Integer objects in array arr
     *	@param arr		array of Integer objects
     *	@param x		index of first object to swap
     *	@param y		index of second object to swap
     */
    private static void swap(List<City> arr, int x, int y) {
        City temp = arr.get(x);
        arr.set(x, arr.get(y));
        arr.set(y, temp) ;
    }


    /**
     *	Selection Sort algorithm - in ascending order (you implement)
     *	@param arr		array of Integer objects to sort
     */
    public static void selectionSort(List<City> arr) {
        selectionSort(arr,"ASC");
    }
    public static void selectionSort(List<City> arr, String order) {
        boolean doSwap = false;

        int mainArrow = 0 ;
        int secondArrow = 0;
        for(int n = arr.size(); n > 1; n--)
        {
            int iMax = 0;
            for(int i = 1; i < n; i++)
            {
                if(arr.get(i).compareTo(arr.get(iMax)) > 0)
                    iMax = i;
            }
            if (doSwap) swap(arr, iMax, n-1);
            doSwap = false;
        }
    }

    /**
     *	Insertion Sort algorithm - in ascending order (you implement)
     *	@param arr		array of Integer objects to sort
     */
    public static void insertionSort(List<City> arr) {
        insertionSort(arr,"ASC");
    }
    public static void insertionSort(List<City> arr, String order) {
        if (order.equals("ASC")){
            for(int n = 1 ; n < arr.size(); n++)
            {
                City temp = arr.get(n);
                int i = n ;
                while(i > 0 && temp.compareTo(arr.get(i-1)) < 0)
                {
                    arr.set(i, arr.get(i-1));
                    i--;
                }
                arr.set(i, temp);
            }}else{
            for(int n = 1 ; n < arr.size(); n++)
            {
                City temp = arr.get(n);
                int i = n ;
                while(i > 0 && temp.compareTo(arr.get(i-1)) > 0)
                {
                    arr.set(i, arr.get(i-1));
                    i--;
                }
                arr.set(i, temp);
            } }
    }

    /**
     *	Merge Sort algorithm - in ascending order (you implement)
     *	@param arr		array of Integer objects to sort
     */
    public void mergeSort(List <City> arr, String order) {

    }

    /*****************************************************************/
    /************************* For Testing ***************************/
    /*****************************************************************/

    /**
     *	Print an array of Integers to the screen
     */
//    public void printArray(Integer[] arr) {
//        if (arr.length == 0) System.out.print("(");
//        else System.out.printf("( %4d", arr[0]);
//        for (int a = 1; a < arr.length; a++) {
//            if (a % 10 == 0) System.out.printf(",\n  %4d", arr[a]);
//            else System.out.printf(", %4d", arr[a]);
//        }
//        System.out.println(" )");
//    }

    public static void main(String[] args) {
        SortMethods se = new SortMethods();
        se.run();
    }

    public void run() {
//        Integer[] arr = new Integer[10];
//        // Fill arr with random numbers
//        for (int a = 0; a < 10; a++)
//            arr[a] = (int)(Math.random() * 100) + 1;
//        System.out.println("\nBubble Sort");
//        System.out.println("Array before sort:");
//        printArray(arr);
//        System.out.println();
//        bubbleSort(arr);
//        System.out.println("Array after sort:");
//        printArray(arr);
//        System.out.println();
//
//        for (int a = 0; a < 10; a++)
//            arr[a] = (int)(Math.random() * 100) + 1;
//        System.out.println("\nSelection Sort");
//        System.out.println("Array before sort:");
//        printArray(arr);
//        System.out.println();
//        selectionSort(arr);
//        System.out.println("Array after sort:");
//        printArray(arr);
//        System.out.println();
//
//
//        for (int a = 0; a < 10; a++)
//            arr[a] = (int)(Math.random() * 100) + 1;
//        System.out.println("\nInsertion Sort");
//        System.out.println("Array before sort:");
//        printArray(arr);
//        System.out.println();
//        insertionSort(arr);
//        System.out.println("Array after sort:");
//        printArray(arr);
//        System.out.println();
//
//
////		for (int a = 0; a < 10; a++)
////			arr[a] = (int)(Math.random() * 100) + 1;
////		System.out.println("\nMerge Sort");
////		System.out.println("Array before sort:");
////		printArray(arr);
////		System.out.println();
////		mergeSort(arr);
////		System.out.println("Array after sort:");
////		printArray(arr);
////		System.out.println();

    }
}
