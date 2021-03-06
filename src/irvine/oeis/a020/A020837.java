package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020837 Decimal expansion of <code>1/sqrt(80) = sqrt(5)/20</code>.
 * @author Sean A. Irvine
 */
public class A020837 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(80).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
