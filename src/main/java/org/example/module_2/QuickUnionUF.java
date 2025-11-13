package org.example.module_2;

import java.util.Arrays;

public class QuickUnionUF {
    private final int[] id;

    public QuickUnionUF(int n) {
        this.id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public int find(int idx) {
        while(id[idx] != idx) {
            idx = id[idx];
        }
        return idx;
    }

    public void union(int idx1, int idx2) {
        int root1 = find(idx1);
        int root2 = find(idx2);
        id[root1] = root2;
    }

    public boolean connected(int idx1, int idx2) {
        return find(idx1) == find(idx2);
    }

    public void printArray() {
        System.out.println(Arrays.toString(id));
    }
}