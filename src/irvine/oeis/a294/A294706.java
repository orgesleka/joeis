package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294706 Permutations of <code>[n]</code> avoiding <code>{4321, 3412, 1234}</code>.
 * @author Georg Fischer
 */
public class A294706 extends FiniteSequence {

  /** Construct the sequence. */
  public A294706() {
    super(1, 1, 2, 6, 21, 69, 162, 240, 199, 73);
  }
}
