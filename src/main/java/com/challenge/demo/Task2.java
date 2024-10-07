package com.challenge.demo;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
//        String s = "3[a2[b]]"; // input 1
        String s = "2[a]"; // input 2


        Stack<String> stack = new Stack();
        int index = 0;
        stack.add(String.valueOf(s.charAt(index)));
        index++;

        while (index < s.length()) {
            if (s.charAt(index) == ']') {
                //pop the elements
                String decString = getDecodedString(stack);
                stack.push(decString);
            } else {
                stack.push(String.valueOf(s.charAt(index)));
            }
            index++;
        }
        System.out.println("Encoded String is: " + s);
        System.out.println("Decoded Strong is: " + stack.pop());
    }

    public static String getDecodedString(Stack<String> stack) {
        StringBuilder decoString = new StringBuilder();
        String result = "";

        while (!stack.peek().equals("[")) {
            decoString.append(stack.pop());
        }
        stack.pop();
        int occ = Integer.parseInt(stack.pop());
        decoString.reverse();

        for (int i = 0; i < occ; i++) {
            result = result + decoString;
        }

        return result;
    }
}
