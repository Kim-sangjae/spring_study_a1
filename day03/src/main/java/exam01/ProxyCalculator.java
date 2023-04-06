package exam01;

public class ProxyCalculator implements Calculator{
    private Calculator calculator;


    //의존주입
    //ImplCalculator , RecCalculator 둘다 쓰기 위해 파라미터를 Calculator로 했다
    public ProxyCalculator(Calculator calculator){
        this.calculator = calculator;
    }




    @Override
    public long factorial(long num) {

        long startTime = System.nanoTime(); // 공통기능


        long result = calculator.factorial(num); // 핵심기능 (대신수행)


        long endTime = System.nanoTime(); // 공통기능

        System.out.printf("걸린시간 : %d\n", endTime-startTime);

        return result;
    }




}
