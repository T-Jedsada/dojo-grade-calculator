import org.junit.Assert
import org.junit.Test

class GradeGradeCalculatorTest {

    private val gradeCalculator = GradeCalculator()

    @Test
    fun testScoreNegative() {
        val score = -1
        val sum = gradeCalculator.calculate(score)
        Assert.assertEquals("please input score 0-100", sum)
    }

    @Test
    fun score_zero_should_be_F() {
        Assert.assertEquals("F", gradeCalculator.calculate(0))
    }

    @Test
    fun score_100_should_be_A() {
        Assert.assertEquals("A", gradeCalculator.calculate(100))
    }

    @Test
    fun score_101_should_be_text_error() {
        Assert.assertEquals("please input score 0-100", gradeCalculator.calculate(101))
    }

    @Test
    fun score_49_should_be_F() {
        Assert.assertEquals("F", gradeCalculator.calculate(49))
    }
}