# 数据库
尝试实现一个人的小巧的数据库，可以跟随小型项目。免安装，直接内嵌项目代码中。

## NO.1
尝试通过本地文件读取的方式实现简单的数据的存储和读取。

utils:工具类，提供基础的原子操作；

FileOperation:文件操作的工具类，提供文件的创建、删除、增加、修改、内容解析等；

DataOperation:数据的操作类，提供数据的格式化、解析对象；

数据以JSON文件的格式进行存储，处理方式序列化使用：jackson，反序列化则是通过：fastjson；

数据对象即为数据表：

- name：表名  string；
- id：标识  string；
- primaryKeys：主键数组  list；
- dataValue：数据主体，hashmap；