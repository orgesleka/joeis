package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015786 Numbers k such that <code>phi(k) + 7 | sigma(k + 7)</code>.
 * @author Sean A. Irvine
 */
public class A015786 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private FactorSequence mFactorSequenceF = Cheetah.factor(6);
  private FactorSequence mFactorSequenceG = Cheetah.factor(7);
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z phi7 = mFactorSequenceA.phi().add(7);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = mFactorSequenceG;
      mFactorSequenceG = Cheetah.factor(++mN);
      if (mFactorSequenceG.sigma().mod(phi7).equals(Z.ZERO)) {
        return Z.valueOf(mN - 7);
      }
    }
  }
}
