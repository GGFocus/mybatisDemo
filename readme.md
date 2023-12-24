
对应文档地址：
https://learn.lianglianglee.com/%e4%b8%93%e6%a0%8f/%e6%b7%b1%e5%85%a5%e5%89%96%e6%9e%90%20MyBatis%20%e6%a0%b8%e5%bf%83%e5%8e%9f%e7%90%86-%e5%ae%8c/02%20%20%e8%ae%a2%e5%8d%95%e7%b3%bb%e7%bb%9f%e6%8c%81%e4%b9%85%e5%b1%82%e7%a4%ba%e4%be%8b%e5%88%86%e6%9e%90%ef%bc%8c20%20%e5%88%86%e9%92%9f%e5%b8%a6%e4%bd%a0%e5%bf%ab%e9%80%9f%e4%b8%8a%e6%89%8b%20MyBatis.md

```
<!-- 配置数据源的类型，以及数据库连接的相关信息 -->


<dataSource type="POOLED">
    <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
    <property name="url" value="jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8&amp;serverTimezone=UTC"/>
    <property name="username" value="root"/>
    <property name="password" value="root"/>
</dataSource>

```