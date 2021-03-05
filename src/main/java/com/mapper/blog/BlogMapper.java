package com.mapper.blog;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    List<Blog> queryBlogList(Map map);
}
