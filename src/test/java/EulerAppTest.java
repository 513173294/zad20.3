import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class EulerAppTest {


    @Test
    public void shouldReturn9for10Test() {
        //given
        EulerApp eulerApp=new EulerApp();
        int i = 10;
        //when
        int calculator = eulerApp.eulerCalculator(i);
        //then
        assertThat(calculator, is(9));
    }

    @Test
    public void shouldReturn9009for100Test() {
        //given
        EulerApp eulerApp=new EulerApp();
        int i = 100;
        //when
        int calculator = eulerApp.eulerCalculator(i);
        //then
        assertThat(calculator, is(9009));
    }


}