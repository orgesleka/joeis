package irvine.oeis.a106;

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
    suite.addTestSuite(A106006Test.class);
    suite.addTestSuite(A106037Test.class);
    suite.addTestSuite(A106056Test.class);
    suite.addTestSuite(A106133Test.class);
    suite.addTestSuite(A106157Test.class);
    suite.addTestSuite(A106175Test.class);
    suite.addTestSuite(A106176Test.class);
    suite.addTestSuite(A106197Test.class);
    suite.addTestSuite(A106201Test.class);
    suite.addTestSuite(A106202Test.class);
    suite.addTestSuite(A106233Test.class);
    suite.addTestSuite(A106247Test.class);
    suite.addTestSuite(A106248Test.class);
    suite.addTestSuite(A106249Test.class);
    suite.addTestSuite(A106250Test.class);
    suite.addTestSuite(A106251Test.class);
    suite.addTestSuite(A106252Test.class);
    suite.addTestSuite(A106253Test.class);
    suite.addTestSuite(A106256Test.class);
    suite.addTestSuite(A106257Test.class);
    suite.addTestSuite(A106273Test.class);
    suite.addTestSuite(A106274Test.class);
    suite.addTestSuite(A106275Test.class);
    suite.addTestSuite(A106318Test.class);
    suite.addTestSuite(A106328Test.class);
    suite.addTestSuite(A106329Test.class);
    suite.addTestSuite(A106330Test.class);
    suite.addTestSuite(A106331Test.class);
    suite.addTestSuite(A106354Test.class);
    suite.addTestSuite(A106373Test.class);
    suite.addTestSuite(A106374Test.class);
    suite.addTestSuite(A106387Test.class);
    suite.addTestSuite(A106388Test.class);
    suite.addTestSuite(A106389Test.class);
    suite.addTestSuite(A106390Test.class);
    suite.addTestSuite(A106392Test.class);
    suite.addTestSuite(A106393Test.class);
    suite.addTestSuite(A106400Test.class);
    suite.addTestSuite(A106403Test.class);
    suite.addTestSuite(A106434Test.class);
    suite.addTestSuite(A106435Test.class);
    suite.addTestSuite(A106466Test.class);
    suite.addTestSuite(A106498Test.class);
    suite.addTestSuite(A106511Test.class);
    suite.addTestSuite(A106515Test.class);
    suite.addTestSuite(A106517Test.class);
    suite.addTestSuite(A106521Test.class);
    suite.addTestSuite(A106523Test.class);
    suite.addTestSuite(A106525Test.class);
    suite.addTestSuite(A106526Test.class);
    suite.addTestSuite(A106533Test.class);
    suite.addTestSuite(A106565Test.class);
    suite.addTestSuite(A106568Test.class);
    suite.addTestSuite(A106570Test.class);
    suite.addTestSuite(A106586Test.class);
    suite.addTestSuite(A106607Test.class);
    suite.addTestSuite(A106609Test.class);
    suite.addTestSuite(A106624Test.class);
    suite.addTestSuite(A106627Test.class);
    suite.addTestSuite(A106632Test.class);
    suite.addTestSuite(A106648Test.class);
    suite.addTestSuite(A106664Test.class);
    suite.addTestSuite(A106666Test.class);
    suite.addTestSuite(A106668Test.class);
    suite.addTestSuite(A106669Test.class);
    suite.addTestSuite(A106670Test.class);
    suite.addTestSuite(A106672Test.class);
    suite.addTestSuite(A106673Test.class);
    suite.addTestSuite(A106674Test.class);
    suite.addTestSuite(A106675Test.class);
    suite.addTestSuite(A106676Test.class);
    suite.addTestSuite(A106677Test.class);
    suite.addTestSuite(A106678Test.class);
    suite.addTestSuite(A106679Test.class);
    suite.addTestSuite(A106680Test.class);
    suite.addTestSuite(A106681Test.class);
    suite.addTestSuite(A106682Test.class);
    suite.addTestSuite(A106684Test.class);
    suite.addTestSuite(A106685Test.class);
    suite.addTestSuite(A106691Test.class);
    suite.addTestSuite(A106707Test.class);
    suite.addTestSuite(A106710Test.class);
    suite.addTestSuite(A106729Test.class);
    suite.addTestSuite(A106791Test.class);
    suite.addTestSuite(A106803Test.class);
    suite.addTestSuite(A106804Test.class);
    suite.addTestSuite(A106805Test.class);
    suite.addTestSuite(A106832Test.class);
    suite.addTestSuite(A106839Test.class);
    suite.addTestSuite(A106845Test.class);
    suite.addTestSuite(A106850Test.class);
    suite.addTestSuite(A106851Test.class);
    suite.addTestSuite(A106852Test.class);
    suite.addTestSuite(A106853Test.class);
    suite.addTestSuite(A106854Test.class);
    suite.addTestSuite(A106855Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

