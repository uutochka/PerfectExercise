package pupupu;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymmetryTest {
    protected Symmetry numb = new Symmetry();

    @Test
    public void SymmetryTests() {

        int a;
        String expected;
        String actual;

        {
            a = 2002;
            expected = "The number is symmetric";
            actual = numb.symmetry(a);

            assertEquals(expected, actual);
        }

        {
            a = 1383;
            expected = "The number isn't symmetric";
            actual = numb.symmetry(a);

            assertEquals(expected, actual);
        }

        {
            a = 3535;
            expected = "The number isn't symmetric";
            actual = numb.symmetry(a);

            assertEquals(expected, actual);
        }

        {
            a = 2882;
            expected = "The number is symmetric";
            actual = numb.symmetry(a);

            assertEquals(expected, actual);
        }

        {
            a = 6953;
            expected = "The number isn't symmetric";
            actual = numb.symmetry(a);

            assertEquals(expected, actual);
        }
    }
}
