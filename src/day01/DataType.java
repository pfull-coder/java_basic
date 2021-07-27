package day01;

public class DataType {

    public static void main(String[] args) {

        // 정수형
        // byte a = 128; // 1byte
        // short b = 32768; // 2byte
        // int c = 2147483648; // 4byte
        // long d = 2147483648; // int리터럴의 값보다 큰 값이기에 오류, 8byte
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L;

        // 실수형
        float f1 = 3.84848484848F; // 4byte
        double d1 = 3.84848484848484; // 8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        double n = 0.0;
        for (int i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);

        // 논리합
        boolean b1 = true;
        boolean b2 = false;
        // 자바의 논리형은 js처럼 falsy값이 존재하지 않는다.
        // boolean b3 = 0;

        // 문자형
        // char : 단일 문자를 저장, 홑따옴표 사용
        char c1 = 'A';
        // string : 문자열을 저장, 겹따옴표 사용, 기본타입 아님
        String s1 = "";

        System.out.println("100" + "200");
        // 숫자와 문자열의 덧셈은 문자열 덧셈처리
        System.out.println(100 + "200");
        // ystem.out.println("200" - 100);
    }

}
