package irvine.oeis.a275;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A275016Test.class);
    suite.addTestSuite(A275060Test.class);
    suite.addTestSuite(A275112Test.class);
    suite.addTestSuite(A275155Test.class);
    suite.addTestSuite(A275156Test.class);
    suite.addTestSuite(A275173Test.class);
    suite.addTestSuite(A275174Test.class);
    suite.addTestSuite(A275175Test.class);
    suite.addTestSuite(A275176Test.class);
    suite.addTestSuite(A275195Test.class);
    suite.addTestSuite(A275277Test.class);
    suite.addTestSuite(A275436Test.class);
    suite.addTestSuite(A275439Test.class);
    suite.addTestSuite(A275441Test.class);
    suite.addTestSuite(A275443Test.class);
    suite.addTestSuite(A275445Test.class);
    suite.addTestSuite(A275447Test.class);
    suite.addTestSuite(A275496Test.class);
    suite.addTestSuite(A275543Test.class);
    suite.addTestSuite(A275546Test.class);
    suite.addTestSuite(A275581Test.class);
    suite.addTestSuite(A275591Test.class);
    suite.addTestSuite(A275627Test.class);
    suite.addTestSuite(A275634Test.class);
    suite.addTestSuite(A275635Test.class);
    suite.addTestSuite(A275636Test.class);
    suite.addTestSuite(A275637Test.class);
    suite.addTestSuite(A275638Test.class);
    suite.addTestSuite(A275639Test.class);
    suite.addTestSuite(A275640Test.class);
    suite.addTestSuite(A275641Test.class);
    suite.addTestSuite(A275709Test.class);
    suite.addTestSuite(A275766Test.class);
    suite.addTestSuite(A275778Test.class);
    suite.addTestSuite(A275788Test.class);
    suite.addTestSuite(A275793Test.class);
    suite.addTestSuite(A275794Test.class);
    suite.addTestSuite(A275795Test.class);
    suite.addTestSuite(A275796Test.class);
    suite.addTestSuite(A275799Test.class);
    suite.addTestSuite(A275830Test.class);
    suite.addTestSuite(A275831Test.class);
    suite.addTestSuite(A275856Test.class);
    suite.addTestSuite(A275857Test.class);
    suite.addTestSuite(A275858Test.class);
    suite.addTestSuite(A275859Test.class);
    suite.addTestSuite(A275860Test.class);
    suite.addTestSuite(A275861Test.class);
    suite.addTestSuite(A275874Test.class);
    suite.addTestSuite(A275876Test.class);
    suite.addTestSuite(A275903Test.class);
    suite.addTestSuite(A275905Test.class);
    suite.addTestSuite(A275906Test.class);
    suite.addTestSuite(A275907Test.class);
    suite.addTestSuite(A275908Test.class);
    suite.addTestSuite(A275909Test.class);
    suite.addTestSuite(A275910Test.class);
    suite.addTestSuite(A275930Test.class);
    suite.addTestSuite(A275931Test.class);
    suite.addTestSuite(A275932Test.class);
    suite.addTestSuite(A275944Test.class);
    suite.addTestSuite(A275970Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
