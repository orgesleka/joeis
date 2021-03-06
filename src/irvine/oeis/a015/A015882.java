package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015882 Numbers n such that <code>sigma(n) = sigma(n + 12)</code>.
 * @author Sean A. Irvine
 */
public class A015882 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private Z mSigmaD = Cheetah.factor(4).sigma();
  private Z mSigmaE = Cheetah.factor(5).sigma();
  private Z mSigmaF = Cheetah.factor(6).sigma();
  private Z mSigmaG = Cheetah.factor(7).sigma();
  private Z mSigmaH = Cheetah.factor(8).sigma();
  private Z mSigmaI = Cheetah.factor(9).sigma();
  private Z mSigmaJ = Cheetah.factor(10).sigma();
  private Z mSigmaK = Cheetah.factor(11).sigma();
  private Z mSigmaL = Cheetah.factor(12).sigma();
  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = mSigmaE;
      mSigmaE = mSigmaF;
      mSigmaF = mSigmaG;
      mSigmaG = mSigmaH;
      mSigmaH = mSigmaI;
      mSigmaI = mSigmaJ;
      mSigmaJ = mSigmaK;
      mSigmaK = mSigmaL;
      mSigmaL = Cheetah.factor(++mN).sigma();
      if (mSigmaL.equals(sigma)) {
        return Z.valueOf(mN - 12);
      }
    }
  }
}
