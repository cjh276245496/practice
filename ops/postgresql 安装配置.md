## 安装

安装依赖

```shell
[root@linhp local]# yum -y install gcc

[root@linhp local]# yum -y install gcc-c++

[root@linhp local]# yum -y install readline-devel

[root@linhp local]# yum -y install zlib-devel

[root@linhp postgresql-9.3.1]# yum -y install make
```

下载安装

	 `wget https://www.postgresql.org/ftp/source/v10.5/具体版本`

	`解压 tar -zxvf `

	 `./congfigure --prefix=/usr/local/postgresql`

	 `make`

	 `make install`		 [参考连接](https://www.cnblogs.com/linhp/p/6530886.html)

## 配置

[psql 初始化](https://blog.csdn.net/yanggd1987/article/details/51150190)



.修改配置文件  客户端访问限制    vim pg_hba.conf 

```javascript
# USER can be "all", a user name, a group name prefixed with "+", or a
# comma-separated list thereof.  In both the DATABASE and USER fields
# you can also write a file name prefixed with "@" to include names
# from a separate file.
#
# ADDRESS specifies the set of hosts the record matches.  It can be a
# host name, or it is made up of an IP address and a CIDR mask that is
# an integer (between 0 and 32 (IPv4) or 128 (IPv6) inclusive) that
# specifies the number of significant bits in the mask.  A host name
# that starts with a dot (.) matches a suffix of the actual host name.
# Alternatively, you can write an IP address and netmask in separate
# columns to specify the set of hosts.  Instead of a CIDR-address, you
# can write "samehost" to match any of the server's own IP addresses,
# or "samenet" to match any address in any subnet that the server is
# directly connected to.
#
# METHOD can be "trust", "reject", "md5", "password", "scram-sha-256",
# "gss", "sspi", "ident", "peer", "pam", "ldap", "radius" or "cert".
# Note that "password" sends passwords in clear text; "md5" or
# "scram-sha-256" are preferred since they send encrypted passwords.
#
# OPTIONS are a set of options for the authentication in the format
# NAME=VALUE.  The available options depend on the different
# authentication methods -- refer to the "Client Authentication"
# section in the documentation for a list of which options are
# available for which authentication methods.

注意：
- trust为无密码信任登录，只需输入ip和port即可登录；
- mds需要用户验证登录；
- ident为映射系统账户到pgsql访问账户。 

```

 

启动: `/usr/local/postgresql/bin/pg_ctl -D /usr/local/postgresql/data/ -l logfile start`



root 映射 psql  数据库

```
#在pg_hba.conf添加本地账户为ident
vim pg_hba.conf
local   all             all            ident map=map_root
#在pg_ident.conf中添加映射，将本地root账户映射为pgsql管理员账户postgres
vim pg_ident.conf
# MAPNAME       SYSTEM-USERNAME         PG-USERNAME
map_root        root            postgres
#测试在系统账户root下，直接以postgres账户登录数据库；而默认下是不允许这样登录的
root@test data]# psql -Upostgres
psql (9.2.15)
Type "help" for help.

postgres=# 
\q 退出 postgres 操作
```











































