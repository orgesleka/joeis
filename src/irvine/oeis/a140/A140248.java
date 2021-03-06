package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140248 Decimal expansion of <code>0.3 * sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A140248 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(135).sqrt().divide(CR.valueOf(10));

  @Override
  protected CR getCR() {
    return N;
  }
}
