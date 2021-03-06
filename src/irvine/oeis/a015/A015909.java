package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015909 Inverse of <code>A015908</code>, that is, k is the first occurrence for which <code>n | k^n +</code> k.
 * @author Sean A. Irvine
 */
public class A015909 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      k += 2;
      if ((Z.valueOf(k).modPow(n, n).longValueExact() + k) % mN == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
