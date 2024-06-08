import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the number of rotations using a modified binary search
        int rotationCount = findRotationCount(arr);

        // Print the number of rotations
        System.out.println("Number of rotations: " + rotationCount);

        // Rotate the array back to its original sorted order
        int[] sortedArray = rotateBackToSorted(arr, rotationCount);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println(sortedArray[0]);
    }

    private static int findRotationCount(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                // The smallest value is in the right half
                low = mid + 1;
            } else {
                // The smallest value is in the left half, including mid
                high = mid;
            }
        }
        return low;  // low will be the index of the smallest element
    }


    private static int[] rotateBackToSorted(int[] arr, int rotationCount) {
        int n = arr.length;
        int[] sortedArray = new int[n];

        // Copy elements from rotationCount to the end
        System.arraycopy(arr, rotationCount, sortedArray, 0, n - rotationCount);

        // Copy elements from the start to rotationCount - 1
        System.arraycopy(arr, 0, sortedArray, n - rotationCount, rotationCount);

        return sortedArray;
    }
}
