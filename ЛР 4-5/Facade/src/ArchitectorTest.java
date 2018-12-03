import org.junit.Test;

import static org.junit.Assert.*;

public class ArchitectorTest {
    @Test
    public void testStartWorking() throws Exception {
        Architector architector = new Architector();
        architector.startWorking();
        assertEquals(2, architector.getWorkers().size());
    }

}