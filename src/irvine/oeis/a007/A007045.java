package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a047.A047812;

/**
 * A007045 Second diagonal of partition triangle <code>A047812</code>.
 * @author Sean A. Irvine
 */
public class A007045 extends A047812 {

  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    return getValue(mN).coeff((mN - 3) * (mN + 1));
  }
}
