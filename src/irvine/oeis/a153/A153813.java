package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153813 Decimal expansion of <code>log_12 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153813 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
