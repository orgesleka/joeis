package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020859 Decimal expansion of <code>log_2(6)</code>.
 * @author Sean A. Irvine
 */
public class A020859 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
