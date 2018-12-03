import org.junit.Test;

import static org.junit.Assert.*;


public class CompositeTest {
    @Test
    public void testAddComponent() throws Exception {
       Composite composite = new Composite();
        House foundation = new Foundation();
        int val = composite.getListSize();
        composite.addComponent(foundation);
        int expected = --val;
        assertEquals(expected, val);
    }

}