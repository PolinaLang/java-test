//4. Коллекции, lesson 12
package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Bob");
        stringStack.push("Ann");
        stringStack.push("Kate");
        stringStack.push("Jon");
        System.out.println(stringStack);
//        while (!stringStack.isEmpty()) {
//            System.out.println(stringStack.pop());
//            System.out.println(stringStack);
//        }
        System.out.println(stringStack.peek());
        System.out.println(stringStack);
    }
}
