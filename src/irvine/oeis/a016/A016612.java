package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016612 Decimal expansion of <code>log(71/2)</code>.
 * @author Sean A. Irvine
 */
public class A016612 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(71, 2)).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
