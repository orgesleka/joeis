package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.BeattySequence;

/**
 * A003622 The Wythoff compound sequence AA: <code>[n*phi^2] - 1</code>, where phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A003622 extends BeattySequence {

  private static final CR PHI = CR.valueOf(5).sqrt().add(CR.ONE).multiply(CR.HALF);
  private static final CR N = PHI.multiply(PHI);

  @Override
  protected CR getCR() {
    return N;
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
