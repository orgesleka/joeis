package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010812 <code>24th</code> powers: <code>a(n) = n^24</code>.
 * @author Sean A. Irvine
 */
public class A010812 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(24);
  }
}
