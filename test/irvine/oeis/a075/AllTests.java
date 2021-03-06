package irvine.oeis.a075;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();

    suite.addTestSuite(A075091Test.class);
    suite.addTestSuite(A075112Test.class);
    suite.addTestSuite(A075115Test.class);
    suite.addTestSuite(A075116Test.class);
    suite.addTestSuite(A075118Test.class);
    suite.addTestSuite(A075150Test.class);
    suite.addTestSuite(A075151Test.class);
    suite.addTestSuite(A075155Test.class);
    suite.addTestSuite(A075156Test.class);
    suite.addTestSuite(A075193Test.class);
    suite.addTestSuite(A075269Test.class);
    suite.addTestSuite(A075298Test.class);
    suite.addTestSuite(A075411Test.class);
    suite.addTestSuite(A075412Test.class);
    suite.addTestSuite(A075415Test.class);
    suite.addTestSuite(A075427Test.class);
    suite.addTestSuite(A075458Test.class);
    suite.addTestSuite(A075528Test.class);
    suite.addTestSuite(A075536Test.class);
    suite.addTestSuite(A075561Test.class);
    suite.addTestSuite(A075603Test.class);
    suite.addTestSuite(A075604Test.class);
    suite.addTestSuite(A075664Test.class);
    suite.addTestSuite(A075665Test.class);
    suite.addTestSuite(A075666Test.class);
    suite.addTestSuite(A075667Test.class);
    suite.addTestSuite(A075668Test.class);
    suite.addTestSuite(A075676Test.class);
    suite.addTestSuite(A075796Test.class);
    suite.addTestSuite(A075797Test.class);
    suite.addTestSuite(A075821Test.class);
    suite.addTestSuite(A075823Test.class);
    suite.addTestSuite(A075835Test.class);
    suite.addTestSuite(A075836Test.class);
    suite.addTestSuite(A075839Test.class);
    suite.addTestSuite(A075841Test.class);
    suite.addTestSuite(A075843Test.class);
    suite.addTestSuite(A075844Test.class);
    suite.addTestSuite(A075848Test.class);
    suite.addTestSuite(A075869Test.class);
    suite.addTestSuite(A075870Test.class);
    suite.addTestSuite(A075871Test.class);
    suite.addTestSuite(A075873Test.class);
    suite.addTestSuite(A075886Test.class);
    suite.addTestSuite(A075907Test.class);
    suite.addTestSuite(A075911Test.class);
    suite.addTestSuite(A075912Test.class);
    suite.addTestSuite(A075913Test.class);
    suite.addTestSuite(A075914Test.class);
    suite.addTestSuite(A075915Test.class);
    suite.addTestSuite(A075921Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

