package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019704 Decimal expansion of <code>sqrt(Pi)/2</code>.
 * @author Sean A. Irvine
 */
public class A019704 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
