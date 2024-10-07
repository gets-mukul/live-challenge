package com.challenge.demo;

import java.util.Stack;

public class Task2 {
    public void decodeString(String s) {
        Stack<String> stack = new Stack();
        int index = 0;
        stack.add(String.valueOf(s.charAt(index)));
        index++;

        while (index < s.length()) {
            if (s.charAt(index) == ']') { // check if current element is "]", its time to decode string
                String decString = decodeSubString(stack);
                stack.push(decString);
            } else {
                stack.push(String.valueOf(s.charAt(index)));
            }
            index++;
        }
        System.out.println("Encoded String is: " + s);
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        System.out.println("Decoded Strong is: " + result);
    }

    private String decodeSubString(Stack<String> stack) {
        StringBuilder decoString = new StringBuilder();
        String result = "";

        // keep appending string till we get "["
        while (!stack.peek().equals("[")) {
            decoString.append(stack.pop());
        }
        stack.pop();

        int occ = Integer.parseInt(stack.pop());
        decoString.reverse();

        // create sub decoded string
        for (int i = 0; i < occ; i++) {
            result = result + decoString;
        }

        return result;
    }
}
