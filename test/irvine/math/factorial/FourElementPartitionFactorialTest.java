package irvine.math.factorial;


/**
 * Test corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FourElementPartitionFactorialTest extends AbstractFactorialTest {

  @Override
  public Factorial getInstance() {
    return new FourElementPartitionFactorial();
  }

}
