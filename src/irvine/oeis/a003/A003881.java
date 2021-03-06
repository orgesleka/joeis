package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A003881 Decimal expansion of <code>Pi/4</code>.
 * @author Sean A. Irvine
 */
public class A003881 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
