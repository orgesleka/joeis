package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106707 First entry of the vector <code>(M^n)v</code>, where M is the <code>2 X 2</code> matrix <code>[[0,-1],[1,4]]</code> and v is the column vector <code>[0,1]</code>.
 * @author Sean A. Irvine
 */
public class A106707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106707() {
    super(new long[] {-1, 4}, new long[] {0, -1});
  }
}
