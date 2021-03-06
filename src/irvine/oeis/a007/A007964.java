package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007964 Numbers n such that product of proper divisors of n is <code>&lt;=</code> n; i.e., product of divisors of n is <code>&lt;= n^2</code>.
 * @author Sean A. Irvine
 */
public class A007964 extends A007956 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(mN) <= 0) {
        return mN;
      }
    }
  }
}
