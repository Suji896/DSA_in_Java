package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Aggressive_cows {

    public static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1; // first cow at first stall
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];

                if (count == cows) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of stalls and no of cows: ");
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] stalls = new int[n];
        System.out.println("Enter the stall numbers: ");

        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(stalls, c, mid)) {
                ans = mid;
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        System.out.println("The max distance is: ");
        System.out.println(ans);
        sc.close();
    }
}
