package irvine.oeis.a063;

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
    suite.addTestSuite(A063000Test.class);
    suite.addTestSuite(A063001Test.class);
    suite.addTestSuite(A063002Test.class);
    suite.addTestSuite(A063092Test.class);
    suite.addTestSuite(A063197Test.class);
    suite.addTestSuite(A063201Test.class);
    suite.addTestSuite(A063204Test.class);
    suite.addTestSuite(A063208Test.class);
    suite.addTestSuite(A063212Test.class);
    suite.addTestSuite(A063213Test.class);
    suite.addTestSuite(A063216Test.class);
    suite.addTestSuite(A063217Test.class);
    suite.addTestSuite(A063218Test.class);
    suite.addTestSuite(A063224Test.class);
    suite.addTestSuite(A063226Test.class);
    suite.addTestSuite(A063227Test.class);
    suite.addTestSuite(A063231Test.class);
    suite.addTestSuite(A063232Test.class);
    suite.addTestSuite(A063235Test.class);
    suite.addTestSuite(A063237Test.class);
    suite.addTestSuite(A063238Test.class);
    suite.addTestSuite(A063241Test.class);
    suite.addTestSuite(A063242Test.class);
    suite.addTestSuite(A063245Test.class);
    suite.addTestSuite(A063246Test.class);
    suite.addTestSuite(A063249Test.class);
    suite.addTestSuite(A063267Test.class);
    suite.addTestSuite(A063270Test.class);
    suite.addTestSuite(A063310Test.class);
    suite.addTestSuite(A063358Test.class);
    suite.addTestSuite(A063417Test.class);
    suite.addTestSuite(A063436Test.class);
    suite.addTestSuite(A063469Test.class);
    suite.addTestSuite(A063470Test.class);
    suite.addTestSuite(A063481Test.class);
    suite.addTestSuite(A063488Test.class);
    suite.addTestSuite(A063489Test.class);
    suite.addTestSuite(A063491Test.class);
    suite.addTestSuite(A063492Test.class);
    suite.addTestSuite(A063493Test.class);
    suite.addTestSuite(A063495Test.class);
    suite.addTestSuite(A063496Test.class);
    suite.addTestSuite(A063521Test.class);
    suite.addTestSuite(A063522Test.class);
    suite.addTestSuite(A063523Test.class);
    suite.addTestSuite(A063524Test.class);
    suite.addTestSuite(A063650Test.class);
    suite.addTestSuite(A063651Test.class);
    suite.addTestSuite(A063652Test.class);
    suite.addTestSuite(A063691Test.class);
    suite.addTestSuite(A063722Test.class);
    suite.addTestSuite(A063723Test.class);
    suite.addTestSuite(A063727Test.class);
    suite.addTestSuite(A063757Test.class);
    suite.addTestSuite(A063782Test.class);
    suite.addTestSuite(A063810Test.class);
    suite.addTestSuite(A063823Test.class);
    suite.addTestSuite(A063831Test.class);
    suite.addTestSuite(A063833Test.class);
    suite.addTestSuite(A063841Test.class);
    suite.addTestSuite(A063842Test.class);
    suite.addTestSuite(A063843Test.class);
    suite.addTestSuite(A063865Test.class);
    suite.addTestSuite(A063892Test.class);
    suite.addTestSuite(A063920Test.class);
    suite.addTestSuite(A063924Test.class);
    suite.addTestSuite(A063925Test.class);
    suite.addTestSuite(A063926Test.class);
    suite.addTestSuite(A063927Test.class);
    suite.addTestSuite(A063942Test.class);
    suite.addTestSuite(A063950Test.class);
    suite.addTestSuite(A063951Test.class);
    suite.addTestSuite(A063953Test.class);
    suite.addTestSuite(A063954Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

