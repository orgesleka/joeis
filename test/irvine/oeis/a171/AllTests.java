package irvine.oeis.a171;

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
    suite.addTestSuite(A171059Test.class);
    suite.addTestSuite(A171064Test.class);
    suite.addTestSuite(A171065Test.class);
    suite.addTestSuite(A171066Test.class);
    suite.addTestSuite(A171067Test.class);
    suite.addTestSuite(A171068Test.class);
    suite.addTestSuite(A171069Test.class);
    suite.addTestSuite(A171088Test.class);
    suite.addTestSuite(A171089Test.class);
    suite.addTestSuite(A171090Test.class);
    suite.addTestSuite(A171091Test.class);
    suite.addTestSuite(A171108Test.class);
    suite.addTestSuite(A171121Test.class);
    suite.addTestSuite(A171132Test.class);
    suite.addTestSuite(A171141Test.class);
    suite.addTestSuite(A171160Test.class);
    suite.addTestSuite(A171182Test.class);
    suite.addTestSuite(A171216Test.class);
    suite.addTestSuite(A171218Test.class);
    suite.addTestSuite(A171220Test.class);
    suite.addTestSuite(A171226Test.class);
    suite.addTestSuite(A171231Test.class);
    suite.addTestSuite(A171237Test.class);
    suite.addTestSuite(A171242Test.class);
    suite.addTestSuite(A171248Test.class);
    suite.addTestSuite(A171252Test.class);
    suite.addTestSuite(A171266Test.class);
    suite.addTestSuite(A171270Test.class);
    suite.addTestSuite(A171272Test.class);
    suite.addTestSuite(A171371Test.class);
    suite.addTestSuite(A171373Test.class);
    suite.addTestSuite(A171375Test.class);
    suite.addTestSuite(A171389Test.class);
    suite.addTestSuite(A171408Test.class);
    suite.addTestSuite(A171410Test.class);
    suite.addTestSuite(A171415Test.class);
    suite.addTestSuite(A171425Test.class);
    suite.addTestSuite(A171452Test.class);
    suite.addTestSuite(A171471Test.class);
    suite.addTestSuite(A171472Test.class);
    suite.addTestSuite(A171473Test.class);
    suite.addTestSuite(A171476Test.class);
    suite.addTestSuite(A171478Test.class);
    suite.addTestSuite(A171479Test.class);
    suite.addTestSuite(A171489Test.class);
    suite.addTestSuite(A171496Test.class);
    suite.addTestSuite(A171498Test.class);
    suite.addTestSuite(A171499Test.class);
    suite.addTestSuite(A171507Test.class);
    suite.addTestSuite(A171510Test.class);
    suite.addTestSuite(A171513Test.class);
    suite.addTestSuite(A171516Test.class);
    suite.addTestSuite(A171522Test.class);
    suite.addTestSuite(A171550Test.class);
    suite.addTestSuite(A171551Test.class);
    suite.addTestSuite(A171552Test.class);
    suite.addTestSuite(A171553Test.class);
    suite.addTestSuite(A171557Test.class);
    suite.addTestSuite(A171590Test.class);
    suite.addTestSuite(A171617Test.class);
    suite.addTestSuite(A171621Test.class);
    suite.addTestSuite(A171638Test.class);
    suite.addTestSuite(A171640Test.class);
    suite.addTestSuite(A171647Test.class);
    suite.addTestSuite(A171648Test.class);
    suite.addTestSuite(A171654Test.class);
    suite.addTestSuite(A171662Test.class);
    suite.addTestSuite(A171663Test.class);
    suite.addTestSuite(A171677Test.class);
    suite.addTestSuite(A171680Test.class);
    suite.addTestSuite(A171681Test.class);
    suite.addTestSuite(A171733Test.class);
    suite.addTestSuite(A171734Test.class);
    suite.addTestSuite(A171753Test.class);
    suite.addTestSuite(A171769Test.class);
    suite.addTestSuite(A171791Test.class);
    suite.addTestSuite(A171806Test.class);
    suite.addTestSuite(A171808Test.class);
    suite.addTestSuite(A171809Test.class);
    suite.addTestSuite(A171826Test.class);
    suite.addTestSuite(A171827Test.class);
    suite.addTestSuite(A171828Test.class);
    suite.addTestSuite(A171835Test.class);
    suite.addTestSuite(A171842Test.class);
    suite.addTestSuite(A171857Test.class);
    suite.addTestSuite(A171861Test.class);
    suite.addTestSuite(A171907Test.class);
    suite.addTestSuite(A171908Test.class);
    suite.addTestSuite(A171950Test.class);
    suite.addTestSuite(A171965Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
