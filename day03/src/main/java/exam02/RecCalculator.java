package exam02;

import exam02.Calculator;

public class RecCalculator implements Calculator {
    //팩토리얼 재귀적 방식
    public long factorial(long num) {

            if (num == 0) {
                return 1;

            }
        return num * factorial(num - 1);


    }




}
