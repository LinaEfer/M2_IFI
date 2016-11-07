import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest{

  @Test
  public void testGetMessage (){
    assertEquals("Just Hello", new Hello().getMessage());

  }

}
