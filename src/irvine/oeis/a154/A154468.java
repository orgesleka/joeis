package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154468 Decimal expansion of <code>log_8 (14)</code>.
 * @author Sean A. Irvine
 */
public class A154468 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(8).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
