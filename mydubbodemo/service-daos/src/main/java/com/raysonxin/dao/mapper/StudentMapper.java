package com.raysonxin.dao.mapper;

import com.raysonxin.dao.entity.Student;

import java.util.List;

public interface StudentMapper {


    /**
     * 查询所有学生信息
     *
     * @return
     * */
    List<Student> selectAll();

}
