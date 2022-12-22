package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPowSolTest {
    @Test
    void twoPowTwoShouldReturnFour() {
        assertEquals(4, MyPowSol.myPow(2, 2));
    }
    @Test
    void twoPowThreeShouldReturnF() {
        assertEquals(8, MyPowSol.myPow(2, 3));
    }
    @Test
    void twoPowFourShouldReturnFour() {
        assertEquals(16, MyPowSol.myPow(2, 4));
    }
    @Test
    void twoPowFiveShouldReturnFour() {
        assertEquals(32, MyPowSol.myPow(2, 5));
    }
    @Test
    void twoPowSixShouldReturnFour() {
        assertEquals(64, MyPowSol.myPow(2, 6));
    }
    @Test
    void twoPowSevenShouldReturnFour() {
        assertEquals(128, MyPowSol.myPow(2, 7));
    }

}