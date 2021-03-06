package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019551 <code>a(n)</code> is the concatenation of n and <code>3n</code>.
 * @author Sean A. Irvine
 */
public class A019551 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(3 * mN));
  }
}
