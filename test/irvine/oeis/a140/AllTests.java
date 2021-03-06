package irvine.oeis.a140;

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
    suite.addTestSuite(A140044Test.class);
    suite.addTestSuite(A140045Test.class);
    suite.addTestSuite(A140062Test.class);
    suite.addTestSuite(A140063Test.class);
    suite.addTestSuite(A140064Test.class);
    suite.addTestSuite(A140065Test.class);
    suite.addTestSuite(A140066Test.class);
    suite.addTestSuite(A140081Test.class);
    suite.addTestSuite(A140085Test.class);
    suite.addTestSuite(A140090Test.class);
    suite.addTestSuite(A140091Test.class);
    suite.addTestSuite(A140096Test.class);
    suite.addTestSuite(A140107Test.class);
    suite.addTestSuite(A140113Test.class);
    suite.addTestSuite(A140150Test.class);
    suite.addTestSuite(A140156Test.class);
    suite.addTestSuite(A140157Test.class);
    suite.addTestSuite(A140158Test.class);
    suite.addTestSuite(A140159Test.class);
    suite.addTestSuite(A140160Test.class);
    suite.addTestSuite(A140162Test.class);
    suite.addTestSuite(A140165Test.class);
    suite.addTestSuite(A140167Test.class);
    suite.addTestSuite(A140170Test.class);
    suite.addTestSuite(A140171Test.class);
    suite.addTestSuite(A140173Test.class);
    suite.addTestSuite(A140184Test.class);
    suite.addTestSuite(A140201Test.class);
    suite.addTestSuite(A140205Test.class);
    suite.addTestSuite(A140230Test.class);
    suite.addTestSuite(A140236Test.class);
    suite.addTestSuite(A140239Test.class);
    suite.addTestSuite(A140240Test.class);
    suite.addTestSuite(A140241Test.class);
    suite.addTestSuite(A140242Test.class);
    suite.addTestSuite(A140243Test.class);
    suite.addTestSuite(A140244Test.class);
    suite.addTestSuite(A140245Test.class);
    suite.addTestSuite(A140246Test.class);
    suite.addTestSuite(A140247Test.class);
    suite.addTestSuite(A140248Test.class);
    suite.addTestSuite(A140249Test.class);
    suite.addTestSuite(A140282Test.class);
    suite.addTestSuite(A140289Test.class);
    suite.addTestSuite(A140290Test.class);
    suite.addTestSuite(A140295Test.class);
    suite.addTestSuite(A140298Test.class);
    suite.addTestSuite(A140318Test.class);
    suite.addTestSuite(A140322Test.class);
    suite.addTestSuite(A140335Test.class);
    suite.addTestSuite(A140342Test.class);
    suite.addTestSuite(A140345Test.class);
    suite.addTestSuite(A140354Test.class);
    suite.addTestSuite(A140359Test.class);
    suite.addTestSuite(A140402Test.class);
    suite.addTestSuite(A140403Test.class);
    suite.addTestSuite(A140404Test.class);
    suite.addTestSuite(A140406Test.class);
    suite.addTestSuite(A140407Test.class);
    suite.addTestSuite(A140411Test.class);
    suite.addTestSuite(A140413Test.class);
    suite.addTestSuite(A140420Test.class);
    suite.addTestSuite(A140426Test.class);
    suite.addTestSuite(A140428Test.class);
    suite.addTestSuite(A140430Test.class);
    suite.addTestSuite(A140455Test.class);
    suite.addTestSuite(A140498Test.class);
    suite.addTestSuite(A140504Test.class);
    suite.addTestSuite(A140532Test.class);
    suite.addTestSuite(A140576Test.class);
    suite.addTestSuite(A140657Test.class);
    suite.addTestSuite(A140660Test.class);
    suite.addTestSuite(A140672Test.class);
    suite.addTestSuite(A140673Test.class);
    suite.addTestSuite(A140674Test.class);
    suite.addTestSuite(A140675Test.class);
    suite.addTestSuite(A140676Test.class);
    suite.addTestSuite(A140677Test.class);
    suite.addTestSuite(A140678Test.class);
    suite.addTestSuite(A140679Test.class);
    suite.addTestSuite(A140680Test.class);
    suite.addTestSuite(A140681Test.class);
    suite.addTestSuite(A140683Test.class);
    suite.addTestSuite(A140689Test.class);
    suite.addTestSuite(A140716Test.class);
    suite.addTestSuite(A140724Test.class);
    suite.addTestSuite(A140730Test.class);
    suite.addTestSuite(A140764Test.class);
    suite.addTestSuite(A140766Test.class);
    suite.addTestSuite(A140780Test.class);
    suite.addTestSuite(A140781Test.class);
    suite.addTestSuite(A140787Test.class);
    suite.addTestSuite(A140794Test.class);
    suite.addTestSuite(A140806Test.class);
    suite.addTestSuite(A140811Test.class);
    suite.addTestSuite(A140824Test.class);
    suite.addTestSuite(A140827Test.class);
    suite.addTestSuite(A140833Test.class);
    suite.addTestSuite(A140870Test.class);
    suite.addTestSuite(A140871Test.class);
    suite.addTestSuite(A140872Test.class);
    suite.addTestSuite(A140898Test.class);
    suite.addTestSuite(A140899Test.class);
    suite.addTestSuite(A140955Test.class);
    suite.addTestSuite(A140960Test.class);
    suite.addTestSuite(A140961Test.class);
    suite.addTestSuite(A140966Test.class);
    suite.addTestSuite(A140976Test.class);
    suite.addTestSuite(A140991Test.class);
    suite.addTestSuite(A140992Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

