1 搭建zk cluster
2 新建mysql 数据库 springbootdb

建表
create table foo(id int(5) primary key auto_increment, location varchar(64), status int(2), hostname varchar(64), fl_shard int(3));


随便插入测试数据
通过增加或者减少应用实例，可看到数据分片执行
