package irvine.oeis.a214;

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
    suite.addTestSuite(A214036Test.class);
    suite.addTestSuite(A214066Test.class);
    suite.addTestSuite(A214067Test.class);
    suite.addTestSuite(A214068Test.class);
    suite.addTestSuite(A214082Test.class);
    suite.addTestSuite(A214085Test.class);
    suite.addTestSuite(A214090Test.class);
    suite.addTestSuite(A214091Test.class);
    suite.addTestSuite(A214092Test.class);
    suite.addTestSuite(A214260Test.class);
    suite.addTestSuite(A214285Test.class);
    suite.addTestSuite(A214297Test.class);
    suite.addTestSuite(A214345Test.class);
    suite.addTestSuite(A214392Test.class);
    suite.addTestSuite(A214393Test.class);
    suite.addTestSuite(A214395Test.class);
    suite.addTestSuite(A214429Test.class);
    suite.addTestSuite(A214438Test.class);
    suite.addTestSuite(A214439Test.class);
    suite.addTestSuite(A214446Test.class);
    suite.addTestSuite(A214463Test.class);
    suite.addTestSuite(A214464Test.class);
    suite.addTestSuite(A214465Test.class);
    suite.addTestSuite(A214466Test.class);
    suite.addTestSuite(A214467Test.class);
    suite.addTestSuite(A214470Test.class);
    suite.addTestSuite(A214473Test.class);
    suite.addTestSuite(A214476Test.class);
    suite.addTestSuite(A214482Test.class);
    suite.addTestSuite(A214483Test.class);
    suite.addTestSuite(A214484Test.class);
    suite.addTestSuite(A214485Test.class);
    suite.addTestSuite(A214486Test.class);
    suite.addTestSuite(A214493Test.class);
    suite.addTestSuite(A214525Test.class);
    suite.addTestSuite(A214568Test.class);
    suite.addTestSuite(A214572Test.class);
    suite.addTestSuite(A214580Test.class);
    suite.addTestSuite(A214616Test.class);
    suite.addTestSuite(A214630Test.class);
    suite.addTestSuite(A214659Test.class);
    suite.addTestSuite(A214660Test.class);
    suite.addTestSuite(A214663Test.class);
    suite.addTestSuite(A214675Test.class);
    suite.addTestSuite(A214683Test.class);
    suite.addTestSuite(A214684Test.class);
    suite.addTestSuite(A214699Test.class);
    suite.addTestSuite(A214727Test.class);
    suite.addTestSuite(A214729Test.class);
    suite.addTestSuite(A214731Test.class);
    suite.addTestSuite(A214732Test.class);
    suite.addTestSuite(A214733Test.class);
    suite.addTestSuite(A214778Test.class);
    suite.addTestSuite(A214779Test.class);
    suite.addTestSuite(A214814Test.class);
    suite.addTestSuite(A214815Test.class);
    suite.addTestSuite(A214816Test.class);
    suite.addTestSuite(A214817Test.class);
    suite.addTestSuite(A214818Test.class);
    suite.addTestSuite(A214819Test.class);
    suite.addTestSuite(A214820Test.class);
    suite.addTestSuite(A214821Test.class);
    suite.addTestSuite(A214822Test.class);
    suite.addTestSuite(A214823Test.class);
    suite.addTestSuite(A214825Test.class);
    suite.addTestSuite(A214826Test.class);
    suite.addTestSuite(A214827Test.class);
    suite.addTestSuite(A214828Test.class);
    suite.addTestSuite(A214829Test.class);
    suite.addTestSuite(A214830Test.class);
    suite.addTestSuite(A214831Test.class);
    suite.addTestSuite(A214832Test.class);
    suite.addTestSuite(A214838Test.class);
    suite.addTestSuite(A214863Test.class);
    suite.addTestSuite(A214864Test.class);
    suite.addTestSuite(A214865Test.class);
    suite.addTestSuite(A214899Test.class);
    suite.addTestSuite(A214934Test.class);
    suite.addTestSuite(A214951Test.class);
    suite.addTestSuite(A214954Test.class);
    suite.addTestSuite(A214982Test.class);
    suite.addTestSuite(A214992Test.class);
    suite.addTestSuite(A214993Test.class);
    suite.addTestSuite(A214994Test.class);
    suite.addTestSuite(A214995Test.class);
    suite.addTestSuite(A214996Test.class);
    suite.addTestSuite(A214997Test.class);
    suite.addTestSuite(A214998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

