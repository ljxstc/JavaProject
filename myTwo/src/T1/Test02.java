package T1;

import A3.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);

        //遍历服务
        for (MyService myService : myServices){
            myService.service();
        }
    }
}
