package irvine.oeis.a089;

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
    suite.addTestSuite(A089068Test.class);
    suite.addTestSuite(A089074Test.class);
    suite.addTestSuite(A089098Test.class);
    suite.addTestSuite(A089108Test.class);
    suite.addTestSuite(A089116Test.class);
    suite.addTestSuite(A089117Test.class);
    suite.addTestSuite(A089128Test.class);
    suite.addTestSuite(A089181Test.class);
    suite.addTestSuite(A089269Test.class);
    suite.addTestSuite(A089304Test.class);
    suite.addTestSuite(A089314Test.class);
    suite.addTestSuite(A089343Test.class);
    suite.addTestSuite(A089350Test.class);
    suite.addTestSuite(A089352Test.class);
    suite.addTestSuite(A089444Test.class);
    suite.addTestSuite(A089445Test.class);
    suite.addTestSuite(A089473Test.class);
    suite.addTestSuite(A089474Test.class);
    suite.addTestSuite(A089483Test.class);
    suite.addTestSuite(A089491Test.class);
    suite.addTestSuite(A089499Test.class);
    suite.addTestSuite(A089507Test.class);
    suite.addTestSuite(A089508Test.class);
    suite.addTestSuite(A089574Test.class);
    suite.addTestSuite(A089594Test.class);
    suite.addTestSuite(A089598Test.class);
    suite.addTestSuite(A089599Test.class);
    suite.addTestSuite(A089658Test.class);
    suite.addTestSuite(A089659Test.class);
    suite.addTestSuite(A089660Test.class);
    suite.addTestSuite(A089661Test.class);
    suite.addTestSuite(A089662Test.class);
    suite.addTestSuite(A089663Test.class);
    suite.addTestSuite(A089746Test.class);
    suite.addTestSuite(A089772Test.class);
    suite.addTestSuite(A089775Test.class);
    suite.addTestSuite(A089781Test.class);
    suite.addTestSuite(A089817Test.class);
    suite.addTestSuite(A089830Test.class);
    suite.addTestSuite(A089883Test.class);
    suite.addTestSuite(A089903Test.class);
    suite.addTestSuite(A089904Test.class);
    suite.addTestSuite(A089905Test.class);
    suite.addTestSuite(A089906Test.class);
    suite.addTestSuite(A089907Test.class);
    suite.addTestSuite(A089908Test.class);
    suite.addTestSuite(A089909Test.class);
    suite.addTestSuite(A089911Test.class);
    suite.addTestSuite(A089926Test.class);
    suite.addTestSuite(A089927Test.class);
    suite.addTestSuite(A089928Test.class);
    suite.addTestSuite(A089931Test.class);
    suite.addTestSuite(A089932Test.class);
    suite.addTestSuite(A089947Test.class);
    suite.addTestSuite(A089950Test.class);
    suite.addTestSuite(A089977Test.class);
    suite.addTestSuite(A089978Test.class);
    suite.addTestSuite(A089979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

