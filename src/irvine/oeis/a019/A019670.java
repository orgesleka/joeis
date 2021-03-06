package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019670 Decimal expansion of <code>Pi/3</code>.
 * @author Sean A. Irvine
 */
public class A019670 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
