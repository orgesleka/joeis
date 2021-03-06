package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020393 Numbers n such that continued fraction for <code>sqrt(n)</code> has period 54.
 * @author Sean A. Irvine
 */
public class A020393 implements Sequence {

  private Z mN = Z.valueOf(885);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(mN.sqrtAndRemainder()[1])) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 55) {
          return mN;
        }
      }
    }
  }
}
