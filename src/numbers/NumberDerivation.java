package numbers;

public class NumberDerivation {
    private NumberComparator comparator;
    private NumberGenerator firstNumberGenerator;
    private NumberGenerator secondNumberGenerator;

    public NumberDerivation(NumberComparator comparator,
                            NumberGenerator firstNumberGenerator,
                            NumberGenerator secondNumberGenerator) {
        this.comparator = comparator;
        this.firstNumberGenerator = firstNumberGenerator;
        this.secondNumberGenerator = secondNumberGenerator;
    }

    public int getResult(long number1, long number2) {
        int count = 0;

        for (int i = 0; i < 1000000; i++) {
            number1 = firstNumberGenerator.generate(number1);
            number2 = secondNumberGenerator.generate(number2);
            if (comparator.compare(number1, number2)) {
                count++;
            }
        }
        return count;
    }
}
