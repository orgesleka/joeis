package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020861 Decimal expansion of <code>log_2(9)</code>.
 * @author Sean A. Irvine
 */
public class A020861 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
