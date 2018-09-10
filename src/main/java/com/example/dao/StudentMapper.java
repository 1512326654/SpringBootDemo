package com.example.dao;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DAO接口
 * @author 董尧
 *
 */

@Mapper
@ResponseBody
public interface StudentMapper {
     /**
      * 获取学生信息
      * @return
      */
     public abstract Student getStudent();
}
