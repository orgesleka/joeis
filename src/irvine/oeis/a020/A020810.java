package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020810 Decimal expansion of <code>1/sqrt(53)</code>.
 * @author Sean A. Irvine
 */
public class A020810 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(53).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
