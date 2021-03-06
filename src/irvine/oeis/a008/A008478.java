package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008478 <code>n =</code> product <code>p_j^k_j =</code> product <code>k_j^p_j</code>.
 * @author Sean A. Irvine
 */
public class A008478 extends A008477 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
