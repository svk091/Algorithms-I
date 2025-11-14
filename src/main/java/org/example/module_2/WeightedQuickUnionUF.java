package org.example.module_2;

import java.util.Arrays;

public class WeightedQuickUnionUF {
    private final int[] id;
    private final int[] sz;

    public WeightedQuickUnionUF(int n) {
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int find(int idx) {
        while (id[idx] != idx) {
            idx = id[idx];
        }
        return idx;
    }

    public void union(int idx1, int idx2) {
        int root1 = find(idx1);
        int root2 = find(idx2);
        if(sz[root1] <= sz[root2]) {
            id[root1] = root2;
            sz[root2] += sz[root1];
        } else {
            id[root2] = root1;
            sz[root1] += sz[root2];
        }
    }

    public boolean connected(int idx1, int idx2)  {
        return find(idx1) == find(idx2);
    }

    public void printArray() {
        System.out.println("Array: " + Arrays.toString(id));
        System.out.println("Size: " + Arrays.toString(sz));
    }
}
