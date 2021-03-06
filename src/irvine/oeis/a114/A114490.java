package irvine.oeis.a114;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A114490 Decimal expansion of <code>log_10(3)</code>.
 * @author Sean A. Irvine
 */
public class A114490 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(10).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
