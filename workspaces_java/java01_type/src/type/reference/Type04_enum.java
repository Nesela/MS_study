package type.reference;

public class Type04_enum {
    public static void main(String[] args){
        enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

        //이름으로 직접꺼내기
        System.out.println(Day.SUNDAY);
        //values() 배열이용해서 꺼내기
        System.out.println(Day.values()[0]);
    }
}
