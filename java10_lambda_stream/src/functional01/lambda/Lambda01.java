package functional01.lambda;

public class Lambda01 {
    void main() {
        /*
        () -> expression
        () -> {statements}

        parameter -> expression
        parameter -> {statement}

        (parameter) -> expression
        (parameter) -> {statement}

        (parameter...) -> expression
        (parameter...) -> {statement}

        expression은 return 생략 가능/ statements는 return 생략 불가능
        parameter 한개 일 땐 () 생략 가능
        parameter의 type 생략 가능
         */

        Parameter00 param00 = () -> IO.println("parameter 0개!");
        param00.prn();

//        Parameter01 param01 = () -> "parameter 0개, return String";
        Parameter01 param01 = () -> {
            return  "parameter 0개, return String";
        };
        IO.println(param01.prn());

//        Parameter10 param02 = (i) -> IO.println("i : " + i);          //true
//        Parameter10 param02 = (int i) -> IO.println("i : " + i);      //true
//        Parameter10 param02 = int i -> IO.println("i : " + i);        //false
        Parameter10 param02 = i -> IO.println("i : " + i);
        param02.prn(2);

        Parameter11 param03 = i -> i + 1;
        IO.println(param03.prn(2));

        Parameter20 param04 = (i, j) -> {
            int result = i + j;
            IO.println(result);
        };
        param04.prn(2, 3);

        Parameter21 param05 = Integer::sum;
        IO.println(param05.prn(2, 3));
    }
}
