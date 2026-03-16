import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'prims' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY edges
     *  3. INTEGER start
     */

    public static int prims(int n, List<List<Integer>> edges, int start) {
    // Write your code here

    List<List<int[]>> adj = new ArrayList<List<int[]>>();

    for (int i = 0; i <= n; i++) {
        adj.add(new ArrayList<int[]>());
    }

    for (List<Integer> e : edges) {
        int u = e.get(0);
        int v = e.get(1);
        int w = e.get(2);

        adj.get(u).add(new int[]{v, w});
        adj.get(v).add(new int[]{u, w});
    }

    boolean[] visited = new boolean[n + 1];

    PriorityQueue<int[]> pq = new PriorityQueue<int[]>(n, new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    });

    pq.add(new int[]{start, 0});

    int totalWeight = 0;

    while (!pq.isEmpty()) {

        int[] curr = pq.poll();
        int node = curr[0];
        int weight = curr[1];

        if (visited[node]) continue;

        visited[node] = true;
        totalWeight += weight;

        for (int[] neighbor : adj.get(node)) {
            if (!visited[neighbor[0]]) {
                pq.add(new int[]{neighbor[0], neighbor[1]});
            }
        }
    }

    return totalWeight;
}
    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] edgesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> edgesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int edgesItem = Integer.parseInt(edgesRowTempItems[j]);
                edgesRowItems.add(edgesItem);
            }

            edges.add(edgesRowItems);
        }

        int start = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.prims(n, edges, start);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
