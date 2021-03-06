package irvine.oeis.a197;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A197682 Decimal expansion of <code>pi/(2+2*pi)</code>.
 * @author Sean A. Irvine
 */
public class A197682 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.TWO.add(CR.TWO.multiply(CR.PI)));

  @Override
  protected CR getCR() {
    return N;
  }
}
