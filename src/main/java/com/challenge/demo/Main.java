package com.challenge.demo;

public class Main {
    public static void main(String[] args) {

        Task1 t1 = new Task1();

        //Input for task 1
        // #1 input
        Node root1 = new Node(2);
        root1.right = new Node(10);
        root1.left = new Node(35);
        root1.right.right = new Node(2);
        root1.right.left = new Node(5);
        root1.left.left = new Node(2);
        root1.left.right = new Node(3);

        // #2 input
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.left = new Node(3);
        root2.left.left.left = new Node(4);
        root2.left.left.left.left = new Node(5);

        t1.rightViewOfTree(root1);
        t1.rightViewOfTree(root2);

        Task2 t2 = new Task2();

        //Input for task 2
        t2.decodeString("2[a]"); // #1 input
        t2.decodeString("3[a2[b]]"); // #2 input
        t2.decodeString("3[a]2[bc]"); // #3 input
        t2.decodeString("a1[b]1[cc]"); // #4 input
        t2.decodeString("ab2[c3[b]]"); // #5 input
    }
}
