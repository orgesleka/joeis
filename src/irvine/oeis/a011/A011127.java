package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011127 Decimal expansion of 5th root of 42.
 * @author Sean A. Irvine
 */
public class A011127 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(42), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
