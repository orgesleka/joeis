package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020814 Decimal expansion of <code>1/sqrt(57)</code>.
 * @author Sean A. Irvine
 */
public class A020814 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(57).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
