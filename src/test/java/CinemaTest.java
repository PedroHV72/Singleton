import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CinemaTest {
    @Test
    public void deveRetornarPoltrona() {
        CinemaSingleton.getInstance().setPoltrona(1);
        assertEquals(1, CinemaSingleton.getInstance().getPoltrona());
    }
}
