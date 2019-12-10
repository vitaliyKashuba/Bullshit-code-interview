package bullshit;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {

    /**
     * if you use java 8+ correct answer will be list.stream().filter(...
     * but usually interviewers wanna hear you are familiar with iterator. useless shit, never saw it on real projects
     */
    @Test
    public void howToRemoveElementsFromList() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);     // breaks the iterator
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

//        for(int x : list) {               // will not work because you not able to modify collection
//            if (x > 5) {
//                list.remove(x);
//            }
//        }

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {        // but will broken if list created like Arrays.asList
            int x = (Integer)iterator.next();
            if (x > 5) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    /**
     * 'what will happen if we override hashcode as 'return 1'
     * one more stupid question, who ever will do such shit ?
     */
    @Test
    public void hashSetWithDumbHashCodeFunction() {
        Set<BrokenEqualAndHashCode> set = new HashSet<>();

        BrokenEqualAndHashCode x = new BrokenEqualAndHashCode(1,2);
        BrokenEqualAndHashCode y = new BrokenEqualAndHashCode(3,4);
        BrokenEqualAndHashCode z = y;

        set.add(x);
        set.add(y);
        set.add(z);

        System.out.println(set);    // it will store x and y objects
    }

    @ToString
    @AllArgsConstructor
    static class BrokenEqualAndHashCode {
        int x, y;

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
