package com.test;

import com.mapper.UserMapper;
import com.mapper.blog.BlogMapper;
import com.mapper.student.StudentMapper;
import com.pojo.Blog;
import com.pojo.Student;
import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        RowBounds rowBounds = new RowBounds(0,2);
        List<User> userList = sqlSession.selectList("com.mapper.UserMapper.getUserByRowBounds",null, rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }


    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        List<Student> student2 = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        System.out.println("==========分割线===========");
        for (Student student1 : student2) {
            System.out.println(student1);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap<String,String>();
        map.put("author","江");
        map.put("title","好好学习");
        List<Blog> blogs = blogMapper.queryBlogList(map);
        for (Blog blog : blogs) {
            System.out.println(blogs);
        }
        //关闭sqlSession
        sqlSession.close();

    }
}
