package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000038 Twice <code>A000007</code>.
 * @author Sean A. Irvine
 */
public class A000038 implements Sequence {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return Z.ZERO;
  }
}

