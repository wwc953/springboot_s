package com.example.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MytestApplicationTests {

    @Test
    void contextLoads() throws Exception {
        System.out.println("---------------------------------------------------------");
        RuntimeException runtimeException = new RuntimeException();
//        runtimeException.printStackTrace();
        System.out.println("---------------------------------------------------------");

        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
//            if ("main".equals(stackTraceElement.getMethodName())) {
//                return Class.forName(stackTraceElement.getClassName());
//            }
            System.out.println("stackTraceElement.getMethodName():"+stackTraceElement.getMethodName());
        }
        System.out.println("---------------------------------------------------------");
    }

}
