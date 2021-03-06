package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242811 <code>a(n)</code> is the largest n-digit number whose truncation after its first k digits is divisible by the k-th Lucas number <code>(A000032(n))</code> for k <code>= 1..n</code>.
 * @author Georg Fischer
 */
public class A242811 extends FiniteSequence {

  /** Construct the sequence. */
  public A242811() {
    super(9, 99, 996, 9968, 99682, 996822, 9968228, 36894671, 368946712L);
  }
}
