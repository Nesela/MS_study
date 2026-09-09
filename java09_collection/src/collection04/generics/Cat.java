package collection04.generics;

public record Cat(AnimalInfo info, boolean isSleep) implements Animal{

    @Override
    public void bark() {
        System.out.println("야옹~");
    }
}
