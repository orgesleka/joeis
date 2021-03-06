package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005279 Numbers having divisors d,e with d <code>&lt; e &lt; 2d</code>.
 * @author Sean A. Irvine
 */
public class A005279 implements Sequence {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z[] divisors = Cheetah.factor(mN).divisorsSorted();
      for (int k = 0; k < divisors.length - 1; ++k) {
        if (divisors[k + 1].compareTo(divisors[k].multiply2()) < 0) {
          return mN;
        }
      }
    }
  }
}

