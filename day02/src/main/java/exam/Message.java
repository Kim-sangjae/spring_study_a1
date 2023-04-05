package exam;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {


    public void send(String message){
        System.out.printf("전송 메세지 : %s\n",message);
    }


    @Override // 초기화 작업할때 쓰인다
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertySet!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy!!! close() 하기전 작업");
    }
}
