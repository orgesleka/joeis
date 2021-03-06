package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A014549 Decimal expansion of <code>1 / M(1,sqrt(2)) (Gauss</code>'s constant).
 * @author Sean A. Irvine
 */
public class A014549 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).divide(CR.ONE.agm(CR.SQRT2));

  @Override
  protected CR getCR() {
    return N;
  }
}
