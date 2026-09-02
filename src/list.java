import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;

public class list {
    void main() {

        // list or collection --> interface

        // ArrayList --> concrete class

        // Collection<Integer>  collection = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        list.add(40);
        System.out.println(list);


        // remove
        list.remove(1);
        list.remove(0);
        System.out.println(list);


        // AddAll
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list.addAll(list2);
        System.out.println(list);

        // size of list
        System.out.println(list.size());

        // RemoveAll
        list.removeAll(list2);
        System.out.println(list);

        // size of list
        System.out.println(list.size());

        System.out.println("printing list2" + list2);
        // clear
        list2.clear();
        System.out.println(list2.size());
        System.out.println(list2);


        // I want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element  : " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();

        // get
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        list3.add(15);
        System.out.println(list3.get(4));
        // set
        list3.set(0, 20);
        System.out.println(list3);

        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);

            // contains method
        }
        System.out.println(list3.contains(20));

        list.add(20);
        list.add(15);
        list.add(10);
        System.out.println(list);

        // sort an Arraylist
        Collections.sort(list);
        System.out.println(list);
        // in decresing order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // clone value
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println(newList);

        // ensure capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(10);

        System.out.println(marks);

        // empty
        System.out.println(marks.isEmpty());

    // index
        System.out.println(newList.indexOf(20));
    }
}
