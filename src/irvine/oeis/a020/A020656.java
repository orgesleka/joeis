package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a005.A005838;

/**
 * A020656 Lexicographically earliest increasing sequence of nonnegative numbers that contains no arithmetic progression of length 6.
 * @author Sean A. Irvine
 */
public class A020656 extends A005838 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
