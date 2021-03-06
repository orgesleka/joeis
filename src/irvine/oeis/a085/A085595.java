package irvine.oeis.a085;

/**
 * A085595 Maximal cycle lengths in a certain class of one-dimensional cellular automata.
 * @author Sean A. Irvine
 */
public class A085595 extends A085593 {

  @Override
  protected byte mod4(final byte a, final byte b, final byte c) {
    return (byte) ((a + b + b + b + c) & 3);
  }
}
