package com.example.mytest.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

//    ApplicationContext 被初始化或刷新时，该事件被发布。这也可以在 ConfigurableApplicationContext接口中使用 refresh()
//    方法来发生。此处的初始化是指：所有的Bean被成功装载，后处理Bean被检测并激活，
//    所有Singleton Bean 被预实例化，ApplicationContext容器已就绪可用
    @Override
    public void onApplicationEvent(ContextRefreshedEvent  event) {
        System.out.println("我的父容器为：" + event.getApplicationContext().getParent());
        System.out.println("初始化时我被调用了。");
    }

}
