package irvine.oeis.a123;

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
    suite.addTestSuite(A123003Test.class);
    suite.addTestSuite(A123004Test.class);
    suite.addTestSuite(A123007Test.class);
    suite.addTestSuite(A123008Test.class);
    suite.addTestSuite(A123009Test.class);
    suite.addTestSuite(A123012Test.class);
    suite.addTestSuite(A123016Test.class);
    suite.addTestSuite(A123020Test.class);
    suite.addTestSuite(A123056Test.class);
    suite.addTestSuite(A123057Test.class);
    suite.addTestSuite(A123069Test.class);
    suite.addTestSuite(A123071Test.class);
    suite.addTestSuite(A123093Test.class);
    suite.addTestSuite(A123095Test.class);
    suite.addTestSuite(A123102Test.class);
    suite.addTestSuite(A123111Test.class);
    suite.addTestSuite(A123115Test.class);
    suite.addTestSuite(A123116Test.class);
    suite.addTestSuite(A123120Test.class);
    suite.addTestSuite(A123138Test.class);
    suite.addTestSuite(A123154Test.class);
    suite.addTestSuite(A123155Test.class);
    suite.addTestSuite(A123156Test.class);
    suite.addTestSuite(A123167Test.class);
    suite.addTestSuite(A123184Test.class);
    suite.addTestSuite(A123188Test.class);
    suite.addTestSuite(A123190Test.class);
    suite.addTestSuite(A123194Test.class);
    suite.addTestSuite(A123197Test.class);
    suite.addTestSuite(A123203Test.class);
    suite.addTestSuite(A123208Test.class);
    suite.addTestSuite(A123219Test.class);
    suite.addTestSuite(A123222Test.class);
    suite.addTestSuite(A123224Test.class);
    suite.addTestSuite(A123228Test.class);
    suite.addTestSuite(A123231Test.class);
    suite.addTestSuite(A123236Test.class);
    suite.addTestSuite(A123259Test.class);
    suite.addTestSuite(A123268Test.class);
    suite.addTestSuite(A123270Test.class);
    suite.addTestSuite(A123278Test.class);
    suite.addTestSuite(A123282Test.class);
    suite.addTestSuite(A123283Test.class);
    suite.addTestSuite(A123290Test.class);
    suite.addTestSuite(A123296Test.class);
    suite.addTestSuite(A123304Test.class);
    suite.addTestSuite(A123335Test.class);
    suite.addTestSuite(A123336Test.class);
    suite.addTestSuite(A123337Test.class);
    suite.addTestSuite(A123347Test.class);
    suite.addTestSuite(A123350Test.class);
    suite.addTestSuite(A123362Test.class);
    suite.addTestSuite(A123363Test.class);
    suite.addTestSuite(A123392Test.class);
    suite.addTestSuite(A123478Test.class);
    suite.addTestSuite(A123479Test.class);
    suite.addTestSuite(A123480Test.class);
    suite.addTestSuite(A123482Test.class);
    suite.addTestSuite(A123513Test.class);
    suite.addTestSuite(A123520Test.class);
    suite.addTestSuite(A123522Test.class);
    suite.addTestSuite(A123526Test.class);
    suite.addTestSuite(A123552Test.class);
    suite.addTestSuite(A123596Test.class);
    suite.addTestSuite(A123613Test.class);
    suite.addTestSuite(A123614Test.class);
    suite.addTestSuite(A123650Test.class);
    suite.addTestSuite(A123653Test.class);
    suite.addTestSuite(A123654Test.class);
    suite.addTestSuite(A123656Test.class);
    suite.addTestSuite(A123657Test.class);
    suite.addTestSuite(A123658Test.class);
    suite.addTestSuite(A123684Test.class);
    suite.addTestSuite(A123720Test.class);
    suite.addTestSuite(A123752Test.class);
    suite.addTestSuite(A123865Test.class);
    suite.addTestSuite(A123866Test.class);
    suite.addTestSuite(A123867Test.class);
    suite.addTestSuite(A123868Test.class);
    suite.addTestSuite(A123877Test.class);
    suite.addTestSuite(A123888Test.class);
    suite.addTestSuite(A123889Test.class);
    suite.addTestSuite(A123890Test.class);
    suite.addTestSuite(A123892Test.class);
    suite.addTestSuite(A123893Test.class);
    suite.addTestSuite(A123894Test.class);
    suite.addTestSuite(A123913Test.class);
    suite.addTestSuite(A123941Test.class);
    suite.addTestSuite(A123942Test.class);
    suite.addTestSuite(A123943Test.class);
    suite.addTestSuite(A123947Test.class);
    suite.addTestSuite(A123950Test.class);
    suite.addTestSuite(A123952Test.class);
    suite.addTestSuite(A123957Test.class);
    suite.addTestSuite(A123958Test.class);
    suite.addTestSuite(A123959Test.class);
    suite.addTestSuite(A123960Test.class);
    suite.addTestSuite(A123968Test.class);
    suite.addTestSuite(A123972Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

