package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019614.
 * @author Sean A. Irvine
 */
public class A019614 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return mN;
  }
}
