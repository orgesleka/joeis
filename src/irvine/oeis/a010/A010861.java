package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010861 Constant sequence: <code>a(n) = 22</code>.
 * @author Sean A. Irvine
 */
public class A010861 implements Sequence {

  private static final Z N = Z.valueOf(22);

  @Override
  public Z next() {
    return N;
  }
}

