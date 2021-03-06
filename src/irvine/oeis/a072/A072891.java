package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072891 The 5-cycle of the <code>n =&gt; sigma(n)-n</code> process, where <code>sigma(n)</code> is the sum of divisors of <code>n (A000203)</code>.
 * @author Georg Fischer
 */
public class A072891 extends FiniteSequence {

  /** Construct the sequence. */
  public A072891() {
    super(12496, 14288, 15472, 14536, 14264, 12496);
  }
}
