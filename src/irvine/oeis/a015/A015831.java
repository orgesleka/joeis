package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015831 Numbers n such that phi(n + 11) | sigma(n).
 * @author Sean A. Irvine
 */
public class A015831 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private FactorSequence mFactorSequenceF = Cheetah.factor(6);
  private FactorSequence mFactorSequenceG = Cheetah.factor(7);
  private FactorSequence mFactorSequenceH = Cheetah.factor(8);
  private FactorSequence mFactorSequenceI = Cheetah.factor(9);
  private FactorSequence mFactorSequenceJ = Cheetah.factor(10);
  private FactorSequence mFactorSequenceK = Cheetah.factor(11);
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = mFactorSequenceG;
      mFactorSequenceG = mFactorSequenceH;
      mFactorSequenceH = mFactorSequenceI;
      mFactorSequenceI = mFactorSequenceJ;
      mFactorSequenceJ = mFactorSequenceK;
      mFactorSequenceK = Cheetah.factor(++mN);
      if (sigma.mod(mFactorSequenceK.phi()).equals(Z.ZERO)) {
        return Z.valueOf(mN - 11);
      }
    }
  }
}
