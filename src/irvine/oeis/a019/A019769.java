package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019769 Decimal expansion of <code>2*e/15</code>.
 * @author Sean A. Irvine
 */
public class A019769 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.valueOf(new Q(2, 15)));

  @Override
  protected CR getCR() {
    return N;
  }
}
