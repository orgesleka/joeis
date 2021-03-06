package irvine.oeis.a094;

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
    suite.addTestSuite(A094002Test.class);
    suite.addTestSuite(A094012Test.class);
    suite.addTestSuite(A094013Test.class);
    suite.addTestSuite(A094014Test.class);
    suite.addTestSuite(A094015Test.class);
    suite.addTestSuite(A094024Test.class);
    suite.addTestSuite(A094025Test.class);
    suite.addTestSuite(A094026Test.class);
    suite.addTestSuite(A094027Test.class);
    suite.addTestSuite(A094028Test.class);
    suite.addTestSuite(A094038Test.class);
    suite.addTestSuite(A094091Test.class);
    suite.addTestSuite(A094096Test.class);
    suite.addTestSuite(A094103Test.class);
    suite.addTestSuite(A094125Test.class);
    suite.addTestSuite(A094148Test.class);
    suite.addTestSuite(A094152Test.class);
    suite.addTestSuite(A094153Test.class);
    suite.addTestSuite(A094159Test.class);
    suite.addTestSuite(A094160Test.class);
    suite.addTestSuite(A094161Test.class);
    suite.addTestSuite(A094173Test.class);
    suite.addTestSuite(A094188Test.class);
    suite.addTestSuite(A094195Test.class);
    suite.addTestSuite(A094196Test.class);
    suite.addTestSuite(A094200Test.class);
    suite.addTestSuite(A094209Test.class);
    suite.addTestSuite(A094211Test.class);
    suite.addTestSuite(A094214Test.class);
    suite.addTestSuite(A094224Test.class);
    suite.addTestSuite(A094256Test.class);
    suite.addTestSuite(A094259Test.class);
    suite.addTestSuite(A094260Test.class);
    suite.addTestSuite(A094286Test.class);
    suite.addTestSuite(A094292Test.class);
    suite.addTestSuite(A094309Test.class);
    suite.addTestSuite(A094311Test.class);
    suite.addTestSuite(A094328Test.class);
    suite.addTestSuite(A094338Test.class);
    suite.addTestSuite(A094347Test.class);
    suite.addTestSuite(A094351Test.class);
    suite.addTestSuite(A094353Test.class);
    suite.addTestSuite(A094359Test.class);
    suite.addTestSuite(A094360Test.class);
    suite.addTestSuite(A094361Test.class);
    suite.addTestSuite(A094364Test.class);
    suite.addTestSuite(A094374Test.class);
    suite.addTestSuite(A094375Test.class);
    suite.addTestSuite(A094421Test.class);
    suite.addTestSuite(A094429Test.class);
    suite.addTestSuite(A094430Test.class);
    suite.addTestSuite(A094432Test.class);
    suite.addTestSuite(A094433Test.class);
    suite.addTestSuite(A094434Test.class);
    suite.addTestSuite(A094501Test.class);
    suite.addTestSuite(A094556Test.class);
    suite.addTestSuite(A094567Test.class);
    suite.addTestSuite(A094569Test.class);
    suite.addTestSuite(A094584Test.class);
    suite.addTestSuite(A094586Test.class);
    suite.addTestSuite(A094588Test.class);
    suite.addTestSuite(A094620Test.class);
    suite.addTestSuite(A094621Test.class);
    suite.addTestSuite(A094622Test.class);
    suite.addTestSuite(A094623Test.class);
    suite.addTestSuite(A094624Test.class);
    suite.addTestSuite(A094625Test.class);
    suite.addTestSuite(A094626Test.class);
    suite.addTestSuite(A094627Test.class);
    suite.addTestSuite(A094628Test.class);
    suite.addTestSuite(A094629Test.class);
    suite.addTestSuite(A094632Test.class);
    suite.addTestSuite(A094633Test.class);
    suite.addTestSuite(A094648Test.class);
    suite.addTestSuite(A094649Test.class);
    suite.addTestSuite(A094650Test.class);
    suite.addTestSuite(A094659Test.class);
    suite.addTestSuite(A094682Test.class);
    suite.addTestSuite(A094686Test.class);
    suite.addTestSuite(A094687Test.class);
    suite.addTestSuite(A094688Test.class);
    suite.addTestSuite(A094703Test.class);
    suite.addTestSuite(A094704Test.class);
    suite.addTestSuite(A094705Test.class);
    suite.addTestSuite(A094706Test.class);
    suite.addTestSuite(A094707Test.class);
    suite.addTestSuite(A094708Test.class);
    suite.addTestSuite(A094723Test.class);
    suite.addTestSuite(A094726Test.class);
    suite.addTestSuite(A094776Test.class);
    suite.addTestSuite(A094789Test.class);
    suite.addTestSuite(A094790Test.class);
    suite.addTestSuite(A094792Test.class);
    suite.addTestSuite(A094793Test.class);
    suite.addTestSuite(A094794Test.class);
    suite.addTestSuite(A094797Test.class);
    suite.addTestSuite(A094799Test.class);
    suite.addTestSuite(A094800Test.class);
    suite.addTestSuite(A094801Test.class);
    suite.addTestSuite(A094806Test.class);
    suite.addTestSuite(A094811Test.class);
    suite.addTestSuite(A094824Test.class);
    suite.addTestSuite(A094825Test.class);
    suite.addTestSuite(A094831Test.class);
    suite.addTestSuite(A094832Test.class);
    suite.addTestSuite(A094835Test.class);
    suite.addTestSuite(A094836Test.class);
    suite.addTestSuite(A094864Test.class);
    suite.addTestSuite(A094865Test.class);
    suite.addTestSuite(A094874Test.class);
    suite.addTestSuite(A094895Test.class);
    suite.addTestSuite(A094914Test.class);
    suite.addTestSuite(A094938Test.class);
    suite.addTestSuite(A094944Test.class);
    suite.addTestSuite(A094966Test.class);
    suite.addTestSuite(A094967Test.class);
    suite.addTestSuite(A094968Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

