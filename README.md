# springboot_s
    1、SpringBoot自动配置：
        1、扫描自动配置类
        @SpringBootApplication -- @EnableAutoConfiguration -- @Import -- AutoConfigurationImportSelector.java
        扫描所有spring-boot-autoconfigure-x.x.x.x.jar下的MATE-INF下spring.factories文件 -- 加载xxxAutoConfigure.java
        2、配置生效
        @ConfigurationProperties 全局配置文件中对应的属性进行绑定
    
    2、SpringBoot启动流程
            SpringApplication.run(primarySources, args)
                --> new SpringApplication(primarySources).run(args);
                    --> refreshContext(context)
                        --> onRefresh() 
                            --> Spring bean初始化
                            --> createWebServer()