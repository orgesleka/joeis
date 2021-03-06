package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008789 <code>n^(n+3)</code>.
 * @author Sean A. Irvine
 */
public class A008789 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 3);
  }
}


