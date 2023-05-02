import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.example.StringUtils.parseInt;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    void exceptionPrintsCharacters() {
        char[] chars = new char[0];
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> System.out.println(chars[0]));
    }

    @Test
    void isBlankArrayTrueTest() {
        assertTrue(StringUtils.isBlank(new char[0]));
    }

    @Test
    void isBlankArrayFalseTest() {
        assertFalse(StringUtils.isBlank(new char[]{' ', '1', 't'}));
    }

    @Test
    void russianTestChar1() {
        assertTrue(StringUtils.isRussiaOneChar('А'));
    }

    @Test
    void russianTestChar2() {
        assertTrue(StringUtils.isRussiaOneChar('я'));
    }

    @Test
    void russianTestChar3() {
        assertTrue(StringUtils.isRussiaOneChar('ё'));
    }

    @Test
    void russianTestChar4() {
        assertTrue(StringUtils.isRussiaOneChar('Ё'));
    }

    @Test
    void russianTestChar5() {
        assertFalse(StringUtils.isRussiaOneChar('A'));
    }

    @Test
    void russianTestChar6() {
        assertFalse(StringUtils.isRussiaOneChar('z'));
    }

    @Test
    void russianTestChar7() {
        assertFalse(StringUtils.isRussiaOneChar('0'));
    }

    @Test
    public void testContains1() {
        assertTrue(StringUtils.contains(new char[]{'a', 'b', 'c', 'd', 'e'}, new char[]{'c', 'd'}));
    }

    @Test
    public void testContains2() {
        assertTrue(StringUtils.contains(new char[]{'a', 'b', 'c', 'd', 'e'}, new char[]{'a', 'b', 'c', 'd', 'e'}));
    }

    @Test
    public void testContains3() {
        assertTrue(StringUtils.contains(new char[]{'a', 'b', 'c', 'd', 'e'}, new char[]{'e'}));
    }

    @Test
    public void testContains4() {
        assertFalse(StringUtils.contains(new char[]{'a', 'b', 'c', 'd', 'e'}, new char[]{'f'}));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(new char[]{'a', 'b', 'c', 'd', 'e'}, new char[]{'c', 'e'}));
    }

    @Test
    public void correctParsCharArr1() {
        char[] arr1 = {'1', '2', '3', '4', '5'};
        assertEquals(12345, parseInt(arr1));
    }

    @Test
    public void correctParsCharArr2() {
        char[] arr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertEquals(123456789, parseInt(arr2));
    }

    @Test
    public void correctParsArr3() {
        char[] arr3 = {'1', '2', '3', '4', '5', 'a', 'b', 'c', 'd', 'e'};
        assertThrows(IllegalArgumentException.class, () -> parseInt(arr3));
    }
}



