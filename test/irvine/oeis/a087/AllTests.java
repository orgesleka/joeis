package irvine.oeis.a087;

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
    suite.addTestSuite(A087005Test.class);
    suite.addTestSuite(A087021Test.class);
    suite.addTestSuite(A087035Test.class);
    suite.addTestSuite(A087076Test.class);
    suite.addTestSuite(A087092Test.class);
    suite.addTestSuite(A087123Test.class);
    suite.addTestSuite(A087124Test.class);
    suite.addTestSuite(A087125Test.class);
    suite.addTestSuite(A087130Test.class);
    suite.addTestSuite(A087131Test.class);
    suite.addTestSuite(A087161Test.class);
    suite.addTestSuite(A087168Test.class);
    suite.addTestSuite(A087169Test.class);
    suite.addTestSuite(A087170Test.class);
    suite.addTestSuite(A087171Test.class);
    suite.addTestSuite(A087204Test.class);
    suite.addTestSuite(A087205Test.class);
    suite.addTestSuite(A087206Test.class);
    suite.addTestSuite(A087213Test.class);
    suite.addTestSuite(A087215Test.class);
    suite.addTestSuite(A087265Test.class);
    suite.addTestSuite(A087279Test.class);
    suite.addTestSuite(A087281Test.class);
    suite.addTestSuite(A087287Test.class);
    suite.addTestSuite(A087288Test.class);
    suite.addTestSuite(A087289Test.class);
    suite.addTestSuite(A087290Test.class);
    suite.addTestSuite(A087292Test.class);
    suite.addTestSuite(A087312Test.class);
    suite.addTestSuite(A087327Test.class);
    suite.addTestSuite(A087330Test.class);
    suite.addTestSuite(A087348Test.class);
    suite.addTestSuite(A087369Test.class);
    suite.addTestSuite(A087420Test.class);
    suite.addTestSuite(A087423Test.class);
    suite.addTestSuite(A087424Test.class);
    suite.addTestSuite(A087426Test.class);
    suite.addTestSuite(A087431Test.class);
    suite.addTestSuite(A087438Test.class);
    suite.addTestSuite(A087439Test.class);
    suite.addTestSuite(A087444Test.class);
    suite.addTestSuite(A087445Test.class);
    suite.addTestSuite(A087446Test.class);
    suite.addTestSuite(A087448Test.class);
    suite.addTestSuite(A087449Test.class);
    suite.addTestSuite(A087451Test.class);
    suite.addTestSuite(A087452Test.class);
    suite.addTestSuite(A087453Test.class);
    suite.addTestSuite(A087455Test.class);
    suite.addTestSuite(A087462Test.class);
    suite.addTestSuite(A087463Test.class);
    suite.addTestSuite(A087464Test.class);
    suite.addTestSuite(A087475Test.class);
    suite.addTestSuite(A087483Test.class);
    suite.addTestSuite(A087503Test.class);
    suite.addTestSuite(A087504Test.class);
    suite.addTestSuite(A087507Test.class);
    suite.addTestSuite(A087508Test.class);
    suite.addTestSuite(A087509Test.class);
    suite.addTestSuite(A087551Test.class);
    suite.addTestSuite(A087567Test.class);
    suite.addTestSuite(A087573Test.class);
    suite.addTestSuite(A087579Test.class);
    suite.addTestSuite(A087584Test.class);
    suite.addTestSuite(A087603Test.class);
    suite.addTestSuite(A087619Test.class);
    suite.addTestSuite(A087620Test.class);
    suite.addTestSuite(A087621Test.class);
    suite.addTestSuite(A087622Test.class);
    suite.addTestSuite(A087627Test.class);
    suite.addTestSuite(A087628Test.class);
    suite.addTestSuite(A087629Test.class);
    suite.addTestSuite(A087635Test.class);
    suite.addTestSuite(A087645Test.class);
    suite.addTestSuite(A087669Test.class);
    suite.addTestSuite(A087778Test.class);
    suite.addTestSuite(A087798Test.class);
    suite.addTestSuite(A087799Test.class);
    suite.addTestSuite(A087800Test.class);
    suite.addTestSuite(A087811Test.class);
    suite.addTestSuite(A087863Test.class);
    suite.addTestSuite(A087908Test.class);
    suite.addTestSuite(A087935Test.class);
    suite.addTestSuite(A087936Test.class);
    suite.addTestSuite(A087944Test.class);
    suite.addTestSuite(A087945Test.class);
    suite.addTestSuite(A087946Test.class);
    suite.addTestSuite(A087955Test.class);
    suite.addTestSuite(A087960Test.class);
    suite.addTestSuite(A087989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

