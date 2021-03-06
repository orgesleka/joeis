package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020823 Decimal expansion of <code>1/sqrt(66)</code>.
 * @author Sean A. Irvine
 */
public class A020823 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(66).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
