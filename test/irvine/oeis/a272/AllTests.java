package irvine.oeis.a272;

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
    suite.addTestSuite(A272000Test.class);
    suite.addTestSuite(A272029Test.class);
    suite.addTestSuite(A272039Test.class);
    suite.addTestSuite(A272058Test.class);
    suite.addTestSuite(A272071Test.class);
    suite.addTestSuite(A272072Test.class);
    suite.addTestSuite(A272073Test.class);
    suite.addTestSuite(A272100Test.class);
    suite.addTestSuite(A272103Test.class);
    suite.addTestSuite(A272104Test.class);
    suite.addTestSuite(A272123Test.class);
    suite.addTestSuite(A272124Test.class);
    suite.addTestSuite(A272125Test.class);
    suite.addTestSuite(A272126Test.class);
    suite.addTestSuite(A272127Test.class);
    suite.addTestSuite(A272128Test.class);
    suite.addTestSuite(A272129Test.class);
    suite.addTestSuite(A272130Test.class);
    suite.addTestSuite(A272131Test.class);
    suite.addTestSuite(A272132Test.class);
    suite.addTestSuite(A272133Test.class);
    suite.addTestSuite(A272134Test.class);
    suite.addTestSuite(A272144Test.class);
    suite.addTestSuite(A272162Test.class);
    suite.addTestSuite(A272199Test.class);
    suite.addTestSuite(A272212Test.class);
    suite.addTestSuite(A272263Test.class);
    suite.addTestSuite(A272297Test.class);
    suite.addTestSuite(A272298Test.class);
    suite.addTestSuite(A272299Test.class);
    suite.addTestSuite(A272331Test.class);
    suite.addTestSuite(A272333Test.class);
    suite.addTestSuite(A272341Test.class);
    suite.addTestSuite(A272352Test.class);
    suite.addTestSuite(A272357Test.class);
    suite.addTestSuite(A272358Test.class);
    suite.addTestSuite(A272362Test.class);
    suite.addTestSuite(A272365Test.class);
    suite.addTestSuite(A272378Test.class);
    suite.addTestSuite(A272379Test.class);
    suite.addTestSuite(A272380Test.class);
    suite.addTestSuite(A272381Test.class);
    suite.addTestSuite(A272382Test.class);
    suite.addTestSuite(A272384Test.class);
    suite.addTestSuite(A272399Test.class);
    suite.addTestSuite(A272404Test.class);
    suite.addTestSuite(A272406Test.class);
    suite.addTestSuite(A272407Test.class);
    suite.addTestSuite(A272409Test.class);
    suite.addTestSuite(A272459Test.class);
    suite.addTestSuite(A272525Test.class);
    suite.addTestSuite(A272549Test.class);
    suite.addTestSuite(A272552Test.class);
    suite.addTestSuite(A272574Test.class);
    suite.addTestSuite(A272576Test.class);
    suite.addTestSuite(A272647Test.class);
    suite.addTestSuite(A272648Test.class);
    suite.addTestSuite(A272665Test.class);
    suite.addTestSuite(A272690Test.class);
    suite.addTestSuite(A272696Test.class);
    suite.addTestSuite(A272764Test.class);
    suite.addTestSuite(A272765Test.class);
    suite.addTestSuite(A272775Test.class);
    suite.addTestSuite(A272850Test.class);
    suite.addTestSuite(A272870Test.class);
    suite.addTestSuite(A272871Test.class);
    suite.addTestSuite(A272914Test.class);
    suite.addTestSuite(A272915Test.class);
    suite.addTestSuite(A272931Test.class);
    suite.addTestSuite(A272975Test.class);
    suite.addTestSuite(A272982Test.class);
    suite.addTestSuite(A272999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

