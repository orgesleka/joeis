package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154017 Decimal expansion of <code>log_18 (9)</code>.
 * @author Sean A. Irvine
 */
public class A154017 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
