package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132702 Decimal expansion of <code>12/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132702 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
