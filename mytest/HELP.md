# CommandLineRunner
* CommandLineRunner报错会导致main线程执行失败
 
# SpringBoot启动后执行 ApplicationListener
    implements ApplicationListener 重写onApplicationEvent 判断event类型
    
    ApplicationEvent
    ApplicationContextEvent
    ContextClosedEvent：应用关闭事件
    ContextRefreshedEvent：应用刷新事件
    ContextStartedEvent：应用开启事件
    ContextStoppedEvent：应用停止事件
    
    另外：spring boot扩展了两个实现：
        EmbeddedServletContainerInitializedEvent：内嵌Servlet容器初始化事件
        ApplicationReadyEvent：spring Application启动完成事件
        
     使用方式：
        方式1(Spring的SPI机制)：
            resource下新建META-INF文件夹
            新建spring.factories文件，
            添加配置
            org.springframework.context.ApplicationListener=\
            com.example.mytest.listener.MyxxxxListener
            
            注意：MyxxxxListener.java类上不需要加任何注解
        
        方式2：
            在MyxxxxListener.java上添加@Component
        
        
               