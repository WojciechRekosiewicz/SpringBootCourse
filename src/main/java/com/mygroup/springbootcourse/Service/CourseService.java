package com.mygroup.springbootcourse.Service;

import java.util.List;

public interface CourseService<T> extends BaseService {

    public List<T> getBought();

    public T buyCourse(int id);
}

