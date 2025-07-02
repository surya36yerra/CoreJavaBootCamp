package Preparation.Tests;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class BracketsTest {
    public static void main(String[] args) {
        String s = "(){}[]";
        boolean correctBrackets = checkBrackets(s);
        String finalResult = correctBrackets==true? "valid string" : "invalid string ";
        System.out.println(finalResult);
    }

    static boolean checkBrackets(String s) {
        Stack<Character> stack1 = new Stack<>();
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack1.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack1.isEmpty()) {
                    return false; // No matching open bracket
                }
                    if ((c == ')' && stack1.pop() != '(') || (c == '}' && stack1.pop() != '{') || (c == ']' && stack1.pop() != '[')) {
                        return false;
                    }
                }
            }
        return stack1.isEmpty();
        }
    }

