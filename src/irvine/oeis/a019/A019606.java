package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019606 Decimal expansion of <code>2*Pi*e/19</code>.
 * @author Sean A. Irvine
 */
public class A019606 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return mN;
  }
}
