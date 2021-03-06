package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004178 Omit <code>3</code>'s from n.
 * @author Sean A. Irvine
 */
public class A004178 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("3", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}
