## nacos

1. 在nacos目录中的/bin目录中通过cmd命令窗口启动服务
   ```
   startup.cmd -m standalone
   ```
2. 浏览器地址栏输入localhost:8848/nacos即可访问nacos服务器（服务注册中心）

## provider

1. 用springboot创建一个provider项目
2. pom.xml文件加入以下依赖
   ```xml
   <dependencies>
       <dependency>
           <groupId>com.alibaba.cloud</groupId>
           <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
       </dependency>
   </dependencies>
   
   <dependencyManagement>
         <dependencies>
             <dependency>
                 <groupId>com.alibaba.cloud</groupId>
                 <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                 <version>${spring-cloud-alibaba.version}</version>
                 <type>pom</type>
                 <scope>import</scope>
             </dependency>
             <dependency>
                 <groupId>org.springframework.cloud</groupId>
                 <artifactId>spring-cloud-dependencies</artifactId>
                 <version>${spring-cloud.version}</version>
                 <type>pom</type>
                 <scope>import</scope>
             </dependency>
         </dependencies>
     </dependencyManagement>
   ```
3. 修改application.yml配置文件
   ```yaml
     spring:
       application:
         # 微服务名称
         name: depart-provider
         
       cloud:
         nacos:
           discovery:
             # nacos注册中心地址
             server-addr: localhost:8848
             username: nacos
             password: nacos
   ```
