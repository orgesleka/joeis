package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154212 Decimal expansion of <code>log_20 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154212 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
