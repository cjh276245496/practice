##Git 安装

+ 下载最新版本的git源码包 `wget https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.18.0.tar.gz`
+ 解压，配置，安装 
`
    tar -zxvf git-2.18.0.tar.gz
    cd git-2.18.0
    ./configure --prefix=/usr/local/git
    make
    make install
`
+ `git --version`



## Git 配置
 
 - 配置git
 
   1 git config --global user.name "Your Name"
   2 git config --global user.email "email@example.com"
   3 #查看配置是否生效
   4 git config --list
   
 - 创建本地仓库：
    
   1 #创建目录
   2 mkdir gitspace
   3 cd gitspace
   4 git init

 ## ssh key生成
 
  - cd  ./root/.ssh/
  - ssh-keygen -t rsa -C 'xxx@acb.com'
  - vim id_rsa.pub 查看公钥
 
 