package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019762 Decimal expansion of <code>2*e</code>.
 * @author Sean A. Irvine
 */
public class A019762 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
