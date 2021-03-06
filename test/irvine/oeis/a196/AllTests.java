package irvine.oeis.a196;

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
    suite.addTestSuite(A196081Test.class);
    suite.addTestSuite(A196230Test.class);
    suite.addTestSuite(A196279Test.class);
    suite.addTestSuite(A196280Test.class);
    suite.addTestSuite(A196288Test.class);
    suite.addTestSuite(A196289Test.class);
    suite.addTestSuite(A196290Test.class);
    suite.addTestSuite(A196291Test.class);
    suite.addTestSuite(A196305Test.class);
    suite.addTestSuite(A196382Test.class);
    suite.addTestSuite(A196468Test.class);
    suite.addTestSuite(A196472Test.class);
    suite.addTestSuite(A196506Test.class);
    suite.addTestSuite(A196507Test.class);
    suite.addTestSuite(A196508Test.class);
    suite.addTestSuite(A196513Test.class);
    suite.addTestSuite(A196514Test.class);
    suite.addTestSuite(A196545Test.class);
    suite.addTestSuite(A196570Test.class);
    suite.addTestSuite(A196593Test.class);
    suite.addTestSuite(A196655Test.class);
    suite.addTestSuite(A196657Test.class);
    suite.addTestSuite(A196787Test.class);
    suite.addTestSuite(A196791Test.class);
    suite.addTestSuite(A196792Test.class);
    suite.addTestSuite(A196875Test.class);
    suite.addTestSuite(A196876Test.class);
    suite.addTestSuite(A196923Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

