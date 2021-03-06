package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020492 Balanced numbers: numbers n such that <code>phi(n) (A000010)</code> divides <code>sigma(n) (A000203)</code>.
 * @author Sean A. Irvine
 */
public class A020492 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
