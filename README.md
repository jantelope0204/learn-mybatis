# learn-mybatis
学习mybatis
理解 resultMap  resultType
sql 参数万能模板使用 map 省去@Parm 注解对用SQL 上的字段

例如:
``` 
<select id="getUserByLimit" resultMap="UserMap" parameterType="map">
      select * from user limit #{startIndex},#{pageSize}
 </select>
```
学会使用 嵌套结果集 对象以及列表
```
    <resultMap id="StudentTeacher" type="com..pojo.Student">
        <result property="id" column="id"></result>
        <result property="name" column="name"></result>
        <!--对象使用assiociation-->
        <!--集合用collection-->
        <association property="teacher" column="tid"
                     javaType="com.pojo.Teacher"
                     select="getTeacher">
         </association>
    </resultMap>
```