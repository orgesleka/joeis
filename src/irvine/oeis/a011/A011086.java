package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011086 Decimal expansion of 4th root of 95.
 * @author Sean A. Irvine
 */
public class A011086 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(95), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
