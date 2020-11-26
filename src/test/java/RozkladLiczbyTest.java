import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RozkladLiczbyTest {

    private RozkladLiczby rozkladLiczby;

    @Before
    public void setUp() throws Exception {
        rozkladLiczby = new RozkladLiczby(10);
    }

    @Test(expected = Exception.class)
    public void shouldThrownExceptionOnWrongParametersInKonstruktor() throws Exception {
        new RozkladLiczby(-50);
    }

    @Test(expected = Exception.class)
    public void shouldThrownExceptionOnWrongParametersInCzynnikiPierwsze() throws Exception {
        rozkladLiczby.czynnikiPierwsze(0);
    }

    @Test
    public void shouldReturnTheCorrectArray() throws Exception {
        int[] result = rozkladLiczby.czynnikiPierwsze(6);
        Assert.assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    public void shouldReturnTheCorrectString() throws Exception {
        String result = Main.zliczanieWystapien(new int[]{2, 2, 2, 3, 5});
        String expectedResult = "2^3*3*5";
        Assert.assertEquals(expectedResult, result);
    }
}