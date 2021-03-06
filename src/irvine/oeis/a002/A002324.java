package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.factor.Cheetah;

/**
 * A002324 Number of divisors of <code>n == 1 (mod 3)</code> minus number of divisors of <code>n == 2 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A002324 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long r = d.mod(3);
      if (r == 1) {
        ++c;
      } else if (r == 2) {
        --c;
      }
    }
    return Z.valueOf(c);
  }
}
