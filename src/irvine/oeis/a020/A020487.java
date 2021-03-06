package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020487 Antiharmonic numbers: numbers n such that <code>sigma_1(n)</code> divides <code>sigma_2(n)</code>.
 * @author Sean A. Irvine
 */
public class A020487 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma2().mod(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
