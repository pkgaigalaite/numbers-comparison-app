package numbers;

public class NumberGeneratorB implements NumberGenerator {
    @Override
    public long generate(long number) {
        return (number * 48271) % 2147483647;
    }
}
