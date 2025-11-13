package org.example.module_2;

import java.util.Arrays;

public class QuickFindUF {
    private final int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public int find(int idx) {
        return id[idx];
    }

    public boolean connected(int idx1, int idx2) {
        return id[idx1] == id[idx2];
    }

    public void union(int idx1, int idx2) {
        int value = id[idx1];
        for(int i = 0; i < id.length; i++) {
            if (id[i] == value)
                id[i] = id[idx2];
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(id));
    }
}
