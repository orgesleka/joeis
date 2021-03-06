package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019755 Decimal expansion of <code>e/18</code>.
 * @author Sean A. Irvine
 */
public class A019755 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(18));

  @Override
  protected CR getCR() {
    return N;
  }
}
