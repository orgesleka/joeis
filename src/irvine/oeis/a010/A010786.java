package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010786 Floor-factorial numbers: <code>a(n) = Product_{k=1..n} floor(n/k)</code>.
 * @author Sean A. Irvine
 */
public class A010786 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 1; k < mN; ++k) {
      prod = prod.multiply(mN / k);
    }
    return prod;
  }
}
