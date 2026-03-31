package edu.pe.cibertec;

import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("IncomeTaxCalculator - Scaled Tax Brackets")
public class IncomeTaxCalculatorTest {

    private IncomeTaxCalculator calculator;
    private static final double UIT = 4_950.0;
    private static final double DELTA = 0.01;

    @BeforeEach
    void setUp()
    {
        calculator = new IncomeTaxCalculator();
    }

    @Test
    @DisplayName("Income below 7 UIT pays 0% tax")
    void givenIncomeBelowSevenUIT_wheCalculate_thenZeroTax()
    {
        double income = 7 * UIT;
        assertEquals(0.0, calculator.calculate(income),DELTA);
    }

    @Test
    @DisplayName("Income exactly 7 UIT pays 0% tax")
    void givenIncomeExactlySevenUIT_wheCalculate_thenZeroTax()
    {
        double income = 7 * UIT;
        assertEquals(0.0, calculator.calculate(income),DELTA);
    }

    @Test
    @DisplayName("Income within bracket 7 to 12 UIT pay 8% on excess")
    void givenIncomeInBracketSevenToTwelveUIT_wheCalcule_thenEightPercent()
    {
        double income = 10 * UIT;
        double expected = (10 - 7) * UIT * 0.08;
        assertEquals(expected, calculator.calculate(income), DELTA);
    }
}
