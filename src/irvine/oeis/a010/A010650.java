package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010650 Decimal expansion of cube root of 80.
 * @author Sean A. Irvine
 */
public class A010650 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(80), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
