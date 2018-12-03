import org.junit.Test;

import static org.junit.Assert.*;


public class ArchitectTest {
    @Test
    public void build() throws Exception {
        PartOfHouse part1 = new PartOfHouse();
        Painter painter = new Painter();
        painter.createPartOfHouse();
        painter.drive();
        painter.paint();
        PartOfHouse expected = painter.getPart();
        part1.setBricks(false);
        part1.setWalls(true);
        assertEquals(expected, part1);
    }

}