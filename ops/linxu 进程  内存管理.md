
##  进程

- netstat –apn  查看所有的进程和端口使用情况 

- netstat –apn | grep 8080  查看8080 端口的进程

- ps -aux | grep java  -aux 显示所有状态 查看java 进程状态

- kill -9 [PID]  杀死PID  对应的进程 


进程后台启动   `nohup java -jar xx.jar (xx.war) &`



## 内存管理

- 查看内存使用情况 `free -m`  `free -g`

- top 

- vmstat可实时动态监视操作系统的虚拟内存、进程、CPU活动 
  
  用法：vmstat [-V] [-n] [delay [count]]
  
  -V表示打印出版本信息；
  
  -n表示在周期性循环输出时，输出的头部信息仅显示一次；
  
  delay是两次输出之间的延迟时间；
  
  count是指按照这个时间间隔统计的次数
  

## 磁盘空间查看

`df -hl`
 
df -hl 查看磁盘剩余空间
 
df -h 查看每个根路径的分区大小
 
du -sh [目录名] 返回该目录的大小
 
du -sm [文件夹] 返回该文件夹总M数
 
du -h [目录名] 查看指定文件夹下的所有文件大小（包含子文件夹）





