package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020429 Numbers n such that continued fraction for <code>sqrt(n)</code> has period 90.
 * @author Sean A. Irvine
 */
public class A020429 implements Sequence {

  private Z mN = Z.valueOf(2850);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(mN.sqrtAndRemainder()[1])) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 91) {
          return mN;
        }
      }
    }
  }
}
