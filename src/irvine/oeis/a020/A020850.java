package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020850 Decimal expansion of <code>1/sqrt(93)</code>.
 * @author Sean A. Irvine
 */
public class A020850 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(93).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
