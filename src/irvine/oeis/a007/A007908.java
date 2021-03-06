package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007908 Concatenation of the numbers from 1 to n.
 * @author Sean A. Irvine
 */
public class A007908 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(++mN);
    return new Z(mS);
  }
}
