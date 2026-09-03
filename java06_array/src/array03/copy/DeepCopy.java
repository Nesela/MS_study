package array03.copy;

public class DeepCopy {
    public static void main(String[] args){
        Person[] original = new Person[] {new Person("hong-gd",100), new Person("kim-sd", 200)};

        Person[] copy = new Person[original.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = new Person(original[i].name, original[i].age);
        }

        //다르다.
        System.out.println(original == copy);

        //다르다.
        System.out.println(original[0] == copy[0]);

        /*
        shallow Copy / Deep Copy : 복사 방법/결과 에 대한 개념
        Defensive Copy : 외부로부터 객체의 상태를보호하기 위한 설꼐 방법
                => 외부에서 객체 내부의 값(상태) 를 마음대로 변경하지 못하도록 복사본 저장/리턴
         */
    }
}
