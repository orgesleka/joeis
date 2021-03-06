package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020792 Decimal expansion of <code>1/sqrt(35)</code>.
 * @author Sean A. Irvine
 */
public class A020792 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(35).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
