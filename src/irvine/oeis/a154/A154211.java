package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154211 Decimal expansion of <code>log_19 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154211 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
