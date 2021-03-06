package irvine.oeis.a015;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000741;

/**
 * A015616 Number of triples <code>(i,j,k)</code> with <code>1 &lt;=</code> i&lt;j&lt;k <code>&lt;= n</code> and <code>GCD{i,j,k} = 1</code>.
 * @author Sean A. Irvine
 */
public class A015616 extends PartialSumSequence {

  /** Construct the sequence. */
  public A015616() {
    super(new A000741());
  }
}
