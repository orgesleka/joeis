package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a121.A121596;

/**
 * A007260 McKay-Thompson series of class <code>6a</code> for Monster.
 * @author Sean A. Irvine
 */
public class A007260 extends A007262 {

  private Sequence mA = new PrependSequence(new A121596(), Z.ZERO);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(27));
  }
}
