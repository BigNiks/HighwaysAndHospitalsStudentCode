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
        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        long cost = 0;
        int[] map = new int[n + 1];
        for(int i = 0; i < cities.length; i++) {
            map[i] = cities[0][i];
            x = cities[i][0];
            y = cities[i][1];
            while (map[a] > 0) {
                a = x;
                x = map[a];
            }
            while (map[b] > 0) {
                b = y;
                y = map[b];
            }
            if (a != b) {
                map[b] = a;
            }
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] < 0) {
                c++;
            }
        }
        cost = (long) hospitalCost * c + (n - c) * highwayCost;

        return cost;
    }

}
