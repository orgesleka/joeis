package irvine.oeis.a244;

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
    suite.addTestSuite(A244005Test.class);
    suite.addTestSuite(A244008Test.class);
    suite.addTestSuite(A244047Test.class);
    suite.addTestSuite(A244055Test.class);
    suite.addTestSuite(A244082Test.class);
    suite.addTestSuite(A244160Test.class);
    suite.addTestSuite(A244196Test.class);
    suite.addTestSuite(A244213Test.class);
    suite.addTestSuite(A244309Test.class);
    suite.addTestSuite(A244310Test.class);
    suite.addTestSuite(A244352Test.class);
    suite.addTestSuite(A244368Test.class);
    suite.addTestSuite(A244369Test.class);
    suite.addTestSuite(A244431Test.class);
    suite.addTestSuite(A244470Test.class);
    suite.addTestSuite(A244497Test.class);
    suite.addTestSuite(A244498Test.class);
    suite.addTestSuite(A244511Test.class);
    suite.addTestSuite(A244512Test.class);
    suite.addTestSuite(A244529Test.class);
    suite.addTestSuite(A244552Test.class);
    suite.addTestSuite(A244603Test.class);
    suite.addTestSuite(A244604Test.class);
    suite.addTestSuite(A244613Test.class);
    suite.addTestSuite(A244630Test.class);
    suite.addTestSuite(A244631Test.class);
    suite.addTestSuite(A244632Test.class);
    suite.addTestSuite(A244633Test.class);
    suite.addTestSuite(A244634Test.class);
    suite.addTestSuite(A244635Test.class);
    suite.addTestSuite(A244636Test.class);
    suite.addTestSuite(A244655Test.class);
    suite.addTestSuite(A244663Test.class);
    suite.addTestSuite(A244725Test.class);
    suite.addTestSuite(A244726Test.class);
    suite.addTestSuite(A244727Test.class);
    suite.addTestSuite(A244728Test.class);
    suite.addTestSuite(A244729Test.class);
    suite.addTestSuite(A244730Test.class);
    suite.addTestSuite(A244802Test.class);
    suite.addTestSuite(A244803Test.class);
    suite.addTestSuite(A244804Test.class);
    suite.addTestSuite(A244805Test.class);
    suite.addTestSuite(A244806Test.class);
    suite.addTestSuite(A244842Test.class);
    suite.addTestSuite(A244845Test.class);
    suite.addTestSuite(A244848Test.class);
    suite.addTestSuite(A244849Test.class);
    suite.addTestSuite(A244851Test.class);
    suite.addTestSuite(A244852Test.class);
    suite.addTestSuite(A244855Test.class);
    suite.addTestSuite(A244864Test.class);
    suite.addTestSuite(A244865Test.class);
    suite.addTestSuite(A244866Test.class);
    suite.addTestSuite(A244867Test.class);
    suite.addTestSuite(A244868Test.class);
    suite.addTestSuite(A244869Test.class);
    suite.addTestSuite(A244870Test.class);
    suite.addTestSuite(A244871Test.class);
    suite.addTestSuite(A244872Test.class);
    suite.addTestSuite(A244873Test.class);
    suite.addTestSuite(A244874Test.class);
    suite.addTestSuite(A244875Test.class);
    suite.addTestSuite(A244876Test.class);
    suite.addTestSuite(A244877Test.class);
    suite.addTestSuite(A244878Test.class);
    suite.addTestSuite(A244879Test.class);
    suite.addTestSuite(A244880Test.class);
    suite.addTestSuite(A244881Test.class);
    suite.addTestSuite(A244882Test.class);
    suite.addTestSuite(A244883Test.class);
    suite.addTestSuite(A244892Test.class);
    suite.addTestSuite(A244895Test.class);
    suite.addTestSuite(A244951Test.class);
    suite.addTestSuite(A244953Test.class);
    suite.addTestSuite(A244975Test.class);
    suite.addTestSuite(A244998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

