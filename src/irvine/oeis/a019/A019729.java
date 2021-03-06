package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019729 Decimal expansion of <code>sqrt(2*Pi)/5</code>.
 * @author Sean A. Irvine
 */
public class A019729 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
