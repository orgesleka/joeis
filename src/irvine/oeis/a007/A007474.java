package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007474 Number of circular chord diagrams with n chords, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A007474 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Gheorghe Coserea

  protected long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.valueOf(1 - (k & 1));
    }
    if (n == 2) {
      return Z.valueOf(k - (k & 1));
    }
    if ((k & 1) == 1) {
      return get(n - 2, k).multiply(k).multiply(n - 1).add(get(n - 4, k));
    } else {
      return get(n - 1, k).add(get(n - 2, k).multiply(k).multiply(n - 1)).subtract(get(n - 3, k)).add(get(n - 4, k));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(2 * mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(get(2 * mN / d, d).subtract(get(2 * mN / d  - 2, d)).multiply(LongUtils.phi(d)));
    }
    return sum.divide(2 * mN);
  }
}

