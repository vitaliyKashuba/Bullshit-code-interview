package bullshit;

import org.junit.Test;

public class Uncategorized {

    @Test
    public void typeOverflow() {
        byte b = 127;
        b++;
        System.out.println(b);  // -128
    }
}
