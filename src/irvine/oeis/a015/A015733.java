package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015733 <code>d(n)</code> does not divide <code>phi(n)</code>.
 * @author Sean A. Irvine
 */
public class A015733 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      if (!Z.ZERO.equals(fs.phi().mod(fs.sigma0()))) {
        return mN;
      }
    }
  }
}
