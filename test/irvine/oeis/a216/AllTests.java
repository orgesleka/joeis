package irvine.oeis.a216;

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
    suite.addTestSuite(A216034Test.class);
    suite.addTestSuite(A216073Test.class);
    suite.addTestSuite(A216074Test.class);
    suite.addTestSuite(A216076Test.class);
    suite.addTestSuite(A216100Test.class);
    suite.addTestSuite(A216106Test.class);
    suite.addTestSuite(A216107Test.class);
    suite.addTestSuite(A216108Test.class);
    suite.addTestSuite(A216109Test.class);
    suite.addTestSuite(A216110Test.class);
    suite.addTestSuite(A216111Test.class);
    suite.addTestSuite(A216112Test.class);
    suite.addTestSuite(A216113Test.class);
    suite.addTestSuite(A216114Test.class);
    suite.addTestSuite(A216115Test.class);
    suite.addTestSuite(A216122Test.class);
    suite.addTestSuite(A216123Test.class);
    suite.addTestSuite(A216134Test.class);
    suite.addTestSuite(A216162Test.class);
    suite.addTestSuite(A216172Test.class);
    suite.addTestSuite(A216173Test.class);
    suite.addTestSuite(A216175Test.class);
    suite.addTestSuite(A216178Test.class);
    suite.addTestSuite(A216193Test.class);
    suite.addTestSuite(A216243Test.class);
    suite.addTestSuite(A216257Test.class);
    suite.addTestSuite(A216263Test.class);
    suite.addTestSuite(A216289Test.class);
    suite.addTestSuite(A216398Test.class);
    suite.addTestSuite(A216402Test.class);
    suite.addTestSuite(A216414Test.class);
    suite.addTestSuite(A216450Test.class);
    suite.addTestSuite(A216453Test.class);
    suite.addTestSuite(A216486Test.class);
    suite.addTestSuite(A216508Test.class);
    suite.addTestSuite(A216540Test.class);
    suite.addTestSuite(A216597Test.class);
    suite.addTestSuite(A216605Test.class);
    suite.addTestSuite(A216676Test.class);
    suite.addTestSuite(A216710Test.class);
    suite.addTestSuite(A216714Test.class);
    suite.addTestSuite(A216755Test.class);
    suite.addTestSuite(A216757Test.class);
    suite.addTestSuite(A216801Test.class);
    suite.addTestSuite(A216823Test.class);
    suite.addTestSuite(A216825Test.class);
    suite.addTestSuite(A216844Test.class);
    suite.addTestSuite(A216852Test.class);
    suite.addTestSuite(A216853Test.class);
    suite.addTestSuite(A216861Test.class);
    suite.addTestSuite(A216865Test.class);
    suite.addTestSuite(A216869Test.class);
    suite.addTestSuite(A216870Test.class);
    suite.addTestSuite(A216871Test.class);
    suite.addTestSuite(A216875Test.class);
    suite.addTestSuite(A216876Test.class);
    suite.addTestSuite(A216972Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

