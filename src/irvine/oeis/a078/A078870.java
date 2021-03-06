package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078870 Decimal concatenations of the 38 quintuples <code>(d1,d2,d3,d4,d5)</code> with elements in <code>{2,4,6}</code> for which there exists a prime p <code>&gt;= 7</code> such that the differences between the 6 consecutive primes starting with p are <code>(d1,d2,d3,d4,d5)</code>.
 * @author Georg Fischer
 */
public class A078870 extends FiniteSequence {

  /** Construct the sequence. */
  public A078870() {
    super(24246, 24626, 24662, 26424, 26426, 26462, 26466, 26642, 26646, 26664, 42424, 42462, 42466, 42646, 46246, 46264, 46266, 46626, 46662, 62462, 62642, 62646, 62664, 62666, 64242, 64246, 64264, 64624, 64626, 64662, 64666, 66264, 66266, 66424, 66462, 66466, 66626, 66646);
  }
}
