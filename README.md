# 测试springcloud 的eureka 服务中心
   主要配置是：
    eureka:
  #server:
  #  enable-self-preservation: false
  instance:
    hostname: 127.0.0.1
    lease-renewal-interval-in-seconds: 1
    lease-expiration-duration-in-seconds: 2  
  client:
    service-url:
      defaultZone: http://127.0.0.1:8081/eureka/
    ##是否注册到eureka
    register-with-eureka: true
    ##是否拉去eureka服务上的信息
    fetch-registry: true  
    
   客户端主要配置：
    eureka:
  instance:
  ###每隔1s发送一次心跳
    lease-renewal-interval-in-seconds: 1
    ###超过两秒剔除（需要关闭自我保护功能服务端）
    lease-expiration-duration-in-seconds: 2
  client:
    service-url:
      defaultZone: http://127.0.0.1:8081/eureka/,http://127.0.0.1:9100/eureka/
    ###是否注册信息到eureka服务端
    register-with-eureka: true
    ###是否拉去注册信息
    fetch-registry: true  
