package NewFeatures;

import java.util.*;

public class SequencedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(1, "b");
        list.addFirst("abc");
        list.addLast("def");
        list.add(2, "g");
        list.set(3, "kn");
        System.out.println(list);
        System.out.println(list.reversed());

        List<Integer> immutableList = List.of(12345, 23456, 345678, 3456789);
        var myList = new ArrayList<Integer>(immutableList);
        myList.add(7869);
        System.out.println(myList);

        Iterator<Integer> itr = myList.iterator();
        itr.next();
        while (itr.hasNext()) {
            Integer s = itr.next();
            System.out.println(s);
            if (s == 12345) {
                itr.remove();
            }
        }
            System.out.println(myList);

        Collections.sort(myList);
        Collections.sort(myList,Comparator.reverseOrder());
        myList.sort(Comparator.naturalOrder());
        myList.sort(Comparator.reverseOrder());


        ListIterator<Integer> listIterator = myList.listIterator();
        while(listIterator.hasNext()) {
            Integer s = listIterator.next();
            System.out.println(s);
        }






//        immutableList.add(7869);
//        System.out.println(immutableList);


        }
    }

