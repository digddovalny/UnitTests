package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(int summa, int discount)
    {
        double res_sum = 0;
        if (summa <= 0)
        {
            throw new ArithmeticException("Сумма не может быть меньше или равна нулю");
        }
        if (discount < 0  || discount > 100)
        {
            throw new ArithmeticException("Неккоректное значение для скидки");
        }

        res_sum = summa * ((double)discount/100);

        return res_sum;
    }
}
