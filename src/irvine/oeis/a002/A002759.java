package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A002759 Number of bipartite partitions of n white objects and 10 black ones.
 * @author Sean A. Irvine
 */
public class A002759 extends A054225 {

  private static final Z POW3 = Z.THREE.pow(10);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = POW3.shiftLeft(++mN);
    return get(r, r);
  }
}
