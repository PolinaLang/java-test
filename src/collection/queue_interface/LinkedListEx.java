//4. Коллекции, lesson 23
package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Donna");
        queue.add("Kale");
        queue.add("Peter");
        queue.add("Mary");
        queue.offer("Hanna");
        //при добавлении элемента методом add, если очередь ограничена, выходит exception
        //при добавлении элемента методом offer исключение не выходит, элемент не добавляется
        System.out.println(queue);

//        queue.remove("Mary");
//        System.out.println(queue);

        //аналогичные методы remove и poll
        //аналогичные методы element и peek - показывает первый элемент очереди
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
