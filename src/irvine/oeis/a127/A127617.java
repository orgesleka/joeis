package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127617 Number of walks from <code>(0,0)</code> to <code>(n,n)</code> in the region <code>0 &lt;= x-y &lt;= 3</code> with the steps <code>(1,0), (0, 1), (2,0)</code> and <code>(0,2)</code>.
 * @author Sean A. Irvine
 */
public class A127617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127617() {
    super(new long[] {-1, 2, 5, 3}, new long[] {1, 1, 5, 22});
  }
}
