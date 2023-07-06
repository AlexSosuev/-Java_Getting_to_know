package lesson4;

import java.util.*;

public class MainClassForLessonFour {

    public static void main(String[] args) {
        // [1, 2, 3, ..., 10]
        ArrayList<String> arrayList = new ArrayList<>(10_000);

        arrayList.add(5, "as");

        // first[value, prev, next]
        // last [value, prev, next]
        // null <- [1] <-> [2] <-> [3] <-> ... <-> [10] -> null
//        LinkedList<String> linkedList = new LinkedList<>();

//        timerAddFirst();
//        timerRemoveFromMiddle();
//        iteratorTask();


        queueStack();
    }

    private static void queueStack() {
        // Stack LIFO Last In First Out
        // add 1 2 3
        // pop 3 2 1
        // peek
        // Queue FIFO First In First Out
        // add 1 2 3
        // pop 1 2 3

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        arrayDeque.addFirst(5);

        System.out.println(arrayDeque.pollFirst()); // 1
        System.out.println(arrayDeque.pollFirst()); // 2
        System.out.println(arrayDeque.peekFirst()); // 3
        System.out.println(arrayDeque.pollFirst()); // 3
        System.out.println(arrayDeque.pollFirst()); // 4
        System.out.println(arrayDeque.pollFirst()); // 5


//        Queue<String> queue;
//        Deque<String> deque;
//        Stack<String> stack;
//        PriorityQueue<String> priorityQueue;
    }

    private static void iteratorTask() {
        // Iterable
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 20, 23, 15, 10, 100, 1123));
        // Удалить все числа, которые делятся на 10



//        for (Integer next: list) {
//
//        }
        Iterator<Integer> iterator = list.iterator();
        iterator.next();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 10 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private static void timerAddFirst() {
        int count = 100_000;

        // Хочу замерить время добавления 100_000 элементов в начало списков
        ArrayList<Integer> arrayList = new ArrayList<>();
        Runnable arrayListRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    arrayList.add(0, i);
                }
            }
        };
        long arrayListTimer = timer(arrayListRunnable);
        System.out.println("Время добавления " + count + " элементов в начало ArrayList: " + arrayListTimer);

        LinkedList<Integer> linkedList = new LinkedList<>();
        Runnable linkedListRunnable = () -> {
            for (int i = 0; i < count; i++) {
                linkedList.add(0, i);
            }
        };
        long linkedListTimer = timer(linkedListRunnable);
        System.out.println("Время добавления " + count + " элементов в начало LinkedList: " + linkedListTimer);
    }

    private static void timerRemoveFromMiddle() {
        int count = 1_000_000;
        int removeCount = count / 100;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }

        Runnable arrayListRemoveRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < removeCount; i++) {
                    int middleIndex = arrayList.size() / 2;
                    arrayList.remove(middleIndex);
                }
            }
        };
        long arrayListRemoveTimer = timer(arrayListRemoveRunnable);
        System.out.println("Время удаления " + removeCount + " раз из ArrayList длины " + count + ": " + arrayListRemoveTimer);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }

        Runnable linkedListRemoveRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < removeCount; i++) {
                    int middleIndex = linkedList.size() / 2;
                    linkedList.remove(middleIndex);
                }
            }
        };
        long linkedListRemoveTimer = timer(linkedListRemoveRunnable);
        System.out.println("Время удаления " + removeCount + " раз из LinkedList длины " + count + ": " + linkedListRemoveTimer);
    }

    private static long timer(Runnable runnable) {
        // UNIX-время
        long start = System.currentTimeMillis(); // количество милисекунд, которые прошли с 01.01.1970г по UTC0
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }
}