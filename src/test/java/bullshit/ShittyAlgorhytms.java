package bullshit;

import org.junit.Test;

public class ShittyAlgorhytms {

    /**
     * are you kidding me ?
     * one of most shitty questions
     * because all expecting one kind of solution, you can just guess what they wanna hear
     *
     * check if string is palindrome - same shit
     */
    @Test
    public void reverseString() {
        String st = "qwerty";

        System.out.println((new StringBuffer(st).reverse()).toString());

        // maybe they want you to implement it manually - cycle to middle of array, switching 1st with last, 2nd with last-1 ...
        // but better say 'go fuck yourself, i dont wanna waste time for this shit'
        //
        // because they can say 'its too easy, why dont you use Stack.push, pop for splitted to chars string
        // but if you do it with stack - tha can say 'too complicated, why dont you use simple array and switch elements

    }
}
