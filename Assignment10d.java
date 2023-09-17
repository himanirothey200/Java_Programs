import java.util.*;

public class Assignment10d {

    public static void main(String[] args) {
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

        int lastIndexInRange = -1;

        for (int i = p.length - 1; i >= 0; i--) {
            if (p[i] >= 60 && p[i] <= 90) {
                lastIndexInRange = i;
                break;
            }
        }

        if (lastIndexInRange != -1) {
            
            System.out.println("Numbers in the range 60 to 90 are:");
            for (int i = 0; i <= lastIndexInRange; i++) {
                if (p[i] >= 60 && p[i] <= 90) {
                    System.out.println(p[i]);
                }
            }
        } else {
            System.out.println("No element was found in the range 60 to 90.");
        }
    }
}
