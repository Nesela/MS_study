package collection04.generics;

public record Dog(AnimalInfo info, int isSleep) implements Animal {
    @Override
    public void bark() {
        System.out.println("멍멍~");
    }
}
