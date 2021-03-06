package irvine.oeis.a246;

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
    suite.addTestSuite(A246036Test.class);
    suite.addTestSuite(A246038Test.class);
    suite.addTestSuite(A246057Test.class);
    suite.addTestSuite(A246058Test.class);
    suite.addTestSuite(A246059Test.class);
    suite.addTestSuite(A246069Test.class);
    suite.addTestSuite(A246114Test.class);
    suite.addTestSuite(A246135Test.class);
    suite.addTestSuite(A246136Test.class);
    suite.addTestSuite(A246137Test.class);
    suite.addTestSuite(A246139Test.class);
    suite.addTestSuite(A246168Test.class);
    suite.addTestSuite(A246172Test.class);
    suite.addTestSuite(A246178Test.class);
    suite.addTestSuite(A246313Test.class);
    suite.addTestSuite(A246324Test.class);
    suite.addTestSuite(A246416Test.class);
    suite.addTestSuite(A246417Test.class);
    suite.addTestSuite(A246508Test.class);
    suite.addTestSuite(A246552Test.class);
    suite.addTestSuite(A246556Test.class);
    suite.addTestSuite(A246557Test.class);
    suite.addTestSuite(A246599Test.class);
    suite.addTestSuite(A246638Test.class);
    suite.addTestSuite(A246639Test.class);
    suite.addTestSuite(A246640Test.class);
    suite.addTestSuite(A246641Test.class);
    suite.addTestSuite(A246642Test.class);
    suite.addTestSuite(A246643Test.class);
    suite.addTestSuite(A246645Test.class);
    suite.addTestSuite(A246651Test.class);
    suite.addTestSuite(A246655Test.class);
    suite.addTestSuite(A246767Test.class);
    suite.addTestSuite(A246880Test.class);
    suite.addTestSuite(A246902Test.class);
    suite.addTestSuite(A246924Test.class);
    suite.addTestSuite(A246925Test.class);
    suite.addTestSuite(A246943Test.class);
    suite.addTestSuite(A246961Test.class);
    suite.addTestSuite(A246985Test.class);
    suite.addTestSuite(A246986Test.class);
    suite.addTestSuite(A246987Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

