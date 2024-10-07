package com.challenge.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task1 {

    public List<Node> rightViewOfTree(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<Node> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            result.add(currentNode);

            // check and enqueue if right node present
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            // if right node not present, check and push left node
            } else if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
        }

        return result;
    }


}


