import java.util.*;

public class Assignment10c {

    public static int getLastOccurrenceIndex(int arr[], int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int lastIndex;
        int iLength = 0;
        int[] p = null;

        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        iLength = sc.nextInt();
        p = new int[iLength];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < iLength; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        lastIndex = getLastOccurrenceIndex(p, target);

        if (lastIndex != -1) {
            System.out.println("Last Occurrence of " + target + " is at index " + lastIndex);
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
