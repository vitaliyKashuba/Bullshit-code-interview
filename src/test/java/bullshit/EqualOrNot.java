package bullshit;

import org.junit.Test;

public class EqualOrNot {

    /**
     * Shitty question you will never use that way in prod, because of using .equals()
     * trick is that values [-128,127] boxing in same object and can be compared with ==
     *
     * @see "https://stackoverflow.com/a/7672338"
     */
    @Test
    public void willIntegerEqualByOperator() {
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println(x == y);     // false

        Integer x2 = new Integer(999);
        Integer y2 = new Integer(999);
        System.out.println(x2 == y2);   // false

        Integer x3 = 1;
        Integer y3 = 1;
        System.out.println(x3 == y3);   // true

        Integer x4 = 999;
        Integer y4 = 999;
        System.out.println(x4 == y4);   // false

        Integer x5 = Integer.valueOf(1);
        Integer y5 = Integer.valueOf(1);
        System.out.println(x5 == y5);   // true

        Integer x6 = Integer.valueOf(999);
        Integer y6 = Integer.valueOf(999);
        System.out.println(x6 == y6);   // false
    }
}
