package bullshit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DealWithNulls {

    /**
     * yes, we can do all dat shit
     */
    @Test
    public void canWeKeepNullInCollections() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        list.add(null);
        set.add(null);
        map.put(1, null);
        map.put(null, 1);
        map.put(null, null);

        System.out.println(map);

    }
}
