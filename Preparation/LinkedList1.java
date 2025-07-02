package Preparation;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addLast("b");
        list.add("correct");


//        For simple iteration: Use an enhanced for loop or a basic for loop.
//                For removing elements while iterating: Use an Iterator.
//                For bidirectional iteration: Use a ListIterator.
//                For parallel processing: Use a Spliterator


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
          iterator.remove();
        }

        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
            System.out.println(listItr.previous());
            listItr.set("a");

        }

        Spliterator<String> listItr2 =  list.spliterator();
        listItr2.forEachRemaining(e-> {
            System.out.println(e);

        });


//        Direction:
//        Iterator only supports forward traversal, while ListIterator allows both forward and backward traversal.
//                Modification:
//        Iterator only provides the remove() method, whereas ListIterator provides add() and set() methods as well.
//                Index Access:
//        ListIterator allows you to access the index of elements using nextIndex() and previousIndex().
    }
}
