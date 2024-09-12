import java.util.Stack;

/**
 * Highways & Hospitals
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Niko Madriz
 *
 */

public class HighwaysAndHospitals {

    /**
     * TODO: Complete this function, cost(), to return the minimum cost to provide
     *  hospital access for all citizens in Menlo County.
     */
    public static long cost(int n, int hospitalCost, int highwayCost, int cities[][]) {
        int[] twins = new int[n * 2];
        Stack<Integer> node = new Stack<>();

         for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[0].length; i++) {
                node.add(cities[i][j]);
            }
        }
         for (int no : node) {
             if (no)
         }


        return 0;
    }

}
