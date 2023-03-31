/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
package Task_2;

import java.util.ArrayDeque;

public class Main {
    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
        linkedList.addLast(element);

        return linkedList;
    }

    public static int dequeue(ArrayDeque<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();

        return firstElement;
    }

    public static int first(ArrayDeque<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> linkedList = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add((int) (Math.random() * (10 - 1)));
        }
        int element = 13;
        System.out.println("Очередь linkedList: " + linkedList);
        System.out.println("Помещаем добавленый элемент в конец очереди: " + enqueue(linkedList, element) + "\n"
                + "Добавленый элемент " + element);
        System.out.println("Удаляемый первый элемент: " + dequeue(linkedList));
        System.out.println("Очередь после удаления: " + linkedList);
        System.out.println("Первый не удаленный элемент: " + first(linkedList));
        System.out.println("Очередь: " + linkedList);
    }

}