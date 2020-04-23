package numbers;

public class NumberGeneratorA implements NumberGenerator {
    @Override
    public long generate(long number) {
        return (number * 16807) % 2147483647;
    }
}
