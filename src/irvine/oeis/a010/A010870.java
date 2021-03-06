package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010870 Constant sequence: <code>a(n) = 31</code>.
 * @author Sean A. Irvine
 */
public class A010870 implements Sequence {

  private static final Z N = Z.valueOf(31);

  @Override
  public Z next() {
    return N;
  }
}

