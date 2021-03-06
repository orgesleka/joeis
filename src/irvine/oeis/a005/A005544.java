package irvine.oeis.a005;

import irvine.oeis.a003.A003288;

/**
 * A005544 Number of <code>n-step self-avoiding</code> walks on f.c.c. lattice from <code>(0,0,0)</code> to <code>(1,1,2)</code>.
 * @author Sean A. Irvine
 */
public class A005544 extends A003288 {

  @Override
  protected long search() {
    final int tx = 1;
    final int ty = 1;
    final int tz = 2;
    // Cf. A003288 there are probably exploitable symmetries here
    return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
  }
}
