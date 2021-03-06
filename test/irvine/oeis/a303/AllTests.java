package irvine.oeis.a303;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A303005Test.class);
    suite.addTestSuite(A303054Test.class);
    suite.addTestSuite(A303148Test.class);
    suite.addTestSuite(A303226Test.class);
    suite.addTestSuite(A303275Test.class);
    suite.addTestSuite(A303276Test.class);
    suite.addTestSuite(A303298Test.class);
    suite.addTestSuite(A303302Test.class);
    suite.addTestSuite(A303303Test.class);
    suite.addTestSuite(A303304Test.class);
    suite.addTestSuite(A303305Test.class);
    suite.addTestSuite(A303332Test.class);
    suite.addTestSuite(A303427Test.class);
    suite.addTestSuite(A303611Test.class);
    suite.addTestSuite(A303615Test.class);
    suite.addTestSuite(A303692Test.class);
    suite.addTestSuite(A303704Test.class);
    suite.addTestSuite(A303813Test.class);
    suite.addTestSuite(A303814Test.class);
    suite.addTestSuite(A303815Test.class);
    suite.addTestSuite(A303834Test.class);
    suite.addTestSuite(A303878Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
