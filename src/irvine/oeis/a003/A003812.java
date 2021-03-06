package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003812 Order of simple Chevalley group <code>A_7(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003812 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003793.orderSimpleChevalleyA(super.next(), 7);
  }
}
