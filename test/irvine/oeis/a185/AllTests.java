package irvine.oeis.a185;

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
    suite.addTestSuite(A185019Test.class);
    suite.addTestSuite(A185028Test.class);
    suite.addTestSuite(A185039Test.class);
    suite.addTestSuite(A185065Test.class);
    suite.addTestSuite(A185092Test.class);
    suite.addTestSuite(A185096Test.class);
    suite.addTestSuite(A185098Test.class);
    suite.addTestSuite(A185123Test.class);
    suite.addTestSuite(A185126Test.class);
    suite.addTestSuite(A185127Test.class);
    suite.addTestSuite(A185138Test.class);
    suite.addTestSuite(A185170Test.class);
    suite.addTestSuite(A185193Test.class);
    suite.addTestSuite(A185212Test.class);
    suite.addTestSuite(A185241Test.class);
    suite.addTestSuite(A185256Test.class);
    suite.addTestSuite(A185268Test.class);
    suite.addTestSuite(A185270Test.class);
    suite.addTestSuite(A185273Test.class);
    suite.addTestSuite(A185276Test.class);
    suite.addTestSuite(A185311Test.class);
    suite.addTestSuite(A185312Test.class);
    suite.addTestSuite(A185346Test.class);
    suite.addTestSuite(A185357Test.class);
    suite.addTestSuite(A185374Test.class);
    suite.addTestSuite(A185375Test.class);
    suite.addTestSuite(A185394Test.class);
    suite.addTestSuite(A185395Test.class);
    suite.addTestSuite(A185438Test.class);
    suite.addTestSuite(A185452Test.class);
    suite.addTestSuite(A185453Test.class);
    suite.addTestSuite(A185505Test.class);
    suite.addTestSuite(A185615Test.class);
    suite.addTestSuite(A185616Test.class);
    suite.addTestSuite(A185617Test.class);
    suite.addTestSuite(A185647Test.class);
    suite.addTestSuite(A185669Test.class);
    suite.addTestSuite(A185688Test.class);
    suite.addTestSuite(A185724Test.class);
    suite.addTestSuite(A185787Test.class);
    suite.addTestSuite(A185788Test.class);
    suite.addTestSuite(A185918Test.class);
    suite.addTestSuite(A185939Test.class);
    suite.addTestSuite(A185940Test.class);
    suite.addTestSuite(A185950Test.class);
    suite.addTestSuite(A185963Test.class);
    suite.addTestSuite(A185964Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

