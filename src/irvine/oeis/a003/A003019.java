package irvine.oeis.a003;

import irvine.oeis.a002.A002845;

/**
 * A003019 Number of distinct values taken by <code>4^4^...^4</code> (with <code>n 4</code>'s and parentheses inserted in all possible ways).
 * @author Sean A. Irvine
 */
public class A003019 extends A002845 {

  @Override
  protected long base() {
    return 4;
  }
}
