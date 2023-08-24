
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EulerTester {
    @Test
    public void testGivens(){
        System.out.println("Inside testGivens()");
        assertEquals(23, Euler.multiplesThreesFives(10));
        assertEquals(2318,Euler.multiplesThreesFives(100));

    }

    @Test
    public void testEdges(){

    }

    @Test
    public void testLongs(){

    }


    @Test
    public void testTiming(){
        final long startTime = System.currentTimeMillis();

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}

