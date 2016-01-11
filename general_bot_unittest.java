import junit.framework.*;

/**
 * Class for unit testing generalBot
 *
 * @author: Jennifer Zhu
 * @version: 1/7/15
 */

public class generalBot_unittest extends TestCase {

  @Test
  public void testPrintFirstLine() {
    // set a string of what we expect here equa to message
    // set another equal to what calling generalBot's methoud should print out 
    assertEquals(message, messageUtil.printMessage());
  }


}

