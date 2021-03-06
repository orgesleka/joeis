package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153870 Decimal expansion of <code>log_18 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153870 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
