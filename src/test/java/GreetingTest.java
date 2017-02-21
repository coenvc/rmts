import org.junit.Assert;
import org.junit.Test;
import rmts.Models.Greeting;

/**
 * Created by fhict on 20/02/2017.
 */
public class GreetingTest {
    @Test public void TestMehtod(){
        Greeting greeting = new Greeting(1,"hello");
        Assert.assertEquals(greeting.Test(),false);
    }
}
