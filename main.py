from unittest import TestCase
from calculator import Calculator


class CalculatorTest(TestCase):

    def test_mul(self):
        self.assertEqual(Calculator.mul(2, 2), 4)

    def test_div(self):
        self.assertEqual(Calculator.div(4, 2), 2)

    def test_sum(self):
        self.assertEqual(Calculator.sum(5, 5), 10)

    def test_sub(self):
        self.assertEqual(Calculator.sub(3, 2), 1)


if __name__ == '__main__':
    CalculatorTest.test_mul()
    CalculatorTest.test_div()
    CalculatorTest.test_sum()
    CalculatorTest.test_sub()
