## maven 安装 和 配置

- <em>下载</em>     `wget  http://mirrors.shu.edu.cn/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz` 

- <em>解压安装</em>  `tar -zxvf apache-maven-3.6.0-bin.tar.gz `           

  		  `mv apache-maven-3.6.0 /usr/local/maven3  ` 

- <em>环境配置</em>   ` vim /etc/profile` 

                   `export M2_HOME=/usr/local/maven3`

  		` export PATH=$PATH:$JAVA_HOME/bin:$M2_HOME/bin`

- <em>重载配置文件</em>  `source /etc/profile`

- <em>验证版本信息</em>     `mvn -version`

- maven 安装目录  conf 下setting.xml，添 aliyun 私服镜像配置  <strong>速度飞快<strong>  

  ```xml
       <mirror>
        <id>nexus-aliyun</id>
        <mirrorOf>*</mirrorOf>
        <name>Nexus aliyun</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public</url>
      </mirror>
  ```


## maven  常见命令

`mvn -clean `  `mvn install `  `mvn --help ` 	`mvn -test`  `mvn -package`



[md 语法连接](https://www.cnblogs.com/liugang-vip/p/6337580.html)



