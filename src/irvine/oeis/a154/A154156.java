package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154156 Decimal expansion of <code>log_5 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154156 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
