package irvine.oeis.a110;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A110117 <code>a(n) = floor(n * (sqrt(2) + sqrt(3)))</code>.
 * @author Sean A. Irvine
 */
public class A110117 extends BeattySequence {

  private static final CR N = CR.SQRT2.add(CR.THREE.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
