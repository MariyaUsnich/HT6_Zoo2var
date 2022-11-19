import Zoo.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ZooTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void doTestShowList(){
        (new List()).animalList();

        Assertions.assertEquals(
                "In the zoo: \n1: Tiger\n2: Elephant\n3: Panda\n4: Straus\n5: Peacock\n6: Goldfish",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    void doTestChoiceNumber1() {
        Main.reactOnChoice(1);

        Assertions.assertEquals(
                "TIGER\r\nIt breathes with the lungs.\r\nIt Goes, runs, jumps.\r\nIt also roars.\r\nIs dangerous: true",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    void doTestChoiceNumber2() {
        Main.reactOnChoice(2);
        Assertions.assertEquals(
                "ELEPHANT\r\nIt breathes with the lungs.\r\nIt Goes, runs, jumps.\r\nIt also has a trunk.\r\nIs dangerous: true",
                outputStreamCaptor.toString().trim()
        );
    }
    @Test
    void doTestChoiceNumber3() {
        Main.reactOnChoice(3);
        Assertions.assertEquals(
                "PANDA\r\nIt breathes with the lungs.\r\nIt Goes, runs, jumps.\r\nIt is protected.",
                outputStreamCaptor.toString().trim()
        );
    }
    @Test
    void doTestChoiceNumber4() {
        Main.reactOnChoice(4);
        Assertions.assertEquals(
                "STRAUS\r\nIt breathes with the lungs.\r\nIt Runs, goes, but does not fly",
                outputStreamCaptor.toString().trim()
        );
    }
    @Test
    void doTestChoiceNumber5() {
        Main.reactOnChoice(5);
        Assertions.assertEquals(
                "PEACOCK\r\nIt breathes with the lungs.\r\nIt flies, goes",
                outputStreamCaptor.toString().trim()
        );
    }
    @Test
    void doTestChoiceNumber6() {
        Main.reactOnChoice(6);
        Assertions.assertEquals(
                "GOLDFISH\r\nIt breathes with the gills.\r\nIt swims.",
                outputStreamCaptor.toString().trim()
        );
    }
}
