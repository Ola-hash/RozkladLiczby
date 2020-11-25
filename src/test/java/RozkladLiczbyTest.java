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


}