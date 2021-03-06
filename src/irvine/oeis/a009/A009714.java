package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009714 <code>Product( [ (n+i)/9 ] ), i=0..8</code>.
 * @author Sean A. Irvine
 */
public class A009714 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 9)
      .multiply((mN + 1) / 9)
      .multiply((mN + 2) / 9)
      .multiply((mN + 3) / 9)
      .multiply((mN + 4) / 9)
      .multiply((mN + 5) / 9)
      .multiply((mN + 6) / 9)
      .multiply((mN + 7) / 9)
      .multiply((mN + 8) / 9);
  }
}
