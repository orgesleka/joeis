package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155524 Decimal expansion of <code>log_12 (20)</code>.
 * @author Sean A. Irvine
 */
public class A155524 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
