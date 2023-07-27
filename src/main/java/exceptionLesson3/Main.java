package exceptionLesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        Integer[] integers = {1, null, 2, 3};
//        //emptyIndex(integers, 1);
//        try {
//            notExisted("");
//        } catch (NonExistedFileException e) {
//            e.printStackTrace();
//        }

        //System.out.println(counter.getCount());
//        try {
//            counter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Counter counter1 = new Counter();
        counter1.add();
        counter1.close();
        counter1.add();
        try (Counter counter = new Counter()){
            counter.add();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void emptyIndex(Integer[] arg, int index) {
        if (arg[index] == null) {
            throw new EmptyIndexAppealException();
        }
        System.out.println("Все Ok");
    }

    private static void notExisted(String path) throws NonExistedFileException {
        if (new File(path).exists()) {
            throw new NonExistedFileException();
        }
        System.out.println("Ok");
    }
}