package org.example;


import org.example.module_2.QuickFindUF;

public class Main {
    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.printArray();
        quickFindUF.union(2, 7);
        quickFindUF.printArray();

        quickFindUF.union(7, 9);
        quickFindUF.printArray();

        quickFindUF.union(1, 4);
        quickFindUF.printArray();

        System.out.println(quickFindUF.connected(2, 9));
        System.out.println(quickFindUF.connected(1, 2));
        System.out.println(quickFindUF.connected(7, 9));

    }
}