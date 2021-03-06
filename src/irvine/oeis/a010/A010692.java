package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010692 Constant sequence: <code>a(n) = 10</code>.
 * @author Sean A. Irvine
 */
public class A010692 implements Sequence {

  @Override
  public Z next() {
    return Z.TEN;
  }
}
