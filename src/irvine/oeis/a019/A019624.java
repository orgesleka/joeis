package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019624 Decimal expansion of <code>Pi*e/16</code>.
 * @author Sean A. Irvine
 */
public class A019624 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return mN;
  }
}
