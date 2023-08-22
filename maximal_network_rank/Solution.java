package maximal_network_rank;

import Utils.ArrayUtils;

public class Solution {

    // TODO

    /*
     * There is an infrastructure of n cities with some number of roads connecting
     * these cities. Each roads[i] = [ai, bi] indicates that there is a
     * bidirectional road between cities ai and bi.
     * 
     * The network rank of two different cities is defined as the total number of
     * directly connected roads to either city. If a road is directly connected to
     * both cities, it is only counted once.
     * 
     * The maximal network rank of the infrastructure is the maximum network rank of
     * all pairs of different cities.
     * 
     * Given the integer n and the array roads, return the maximal network rank of
     * the entire infrastructure.
     */


    public int maximalNetworkRank(int n, int[][] roads) {

        ArrayUtils.printIntMatrix(roads);

        int maxRank = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxRank = Math.max(networkRank(roads, i), maxRank);
        }

        return maxRank;
    }

    public int networkRank(int[][] roads, int city) {
        int count = 1;

        for (int[] road : roads) {
            if (road[0] == city || road[1] == city) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }

}
