package com.example.dao;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Mapper
@ResponseBody
public interface StudentMapper {
     Student getStudent();
}
