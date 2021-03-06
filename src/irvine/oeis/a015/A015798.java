package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015798 Numbers n such that <code>phi(n) + 7 | sigma(n)</code>.
 * @author Sean A. Irvine
 */
public class A015798 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(7)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
