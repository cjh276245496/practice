#!/bin/bash
now=$(date +"%Y%m%d%H%M%S")
echo "the shell execute time is ${now}"

mvn clean package -Pprod -U



#  脚本模板
#!/bin/bash

export BUILD_ID=dontKillMe

app_path=/home/

jar_path=/home/

jar_name=uu-web.jar

pid=$(cat /home/xux/uid-web.pid)


cd ${jar_path}

cp ${jar_path}/${jar_name}  ${app_path}

cd ${app_path}

kill -9 ${pid}


java -jar -Dspring.profiles.active=proc ${jar_name} &


echo $! > /home/xux/uid-web.pid
