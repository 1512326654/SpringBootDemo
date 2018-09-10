package com.example.controller;


import com.example.dao.StudentMapper;
import com.example.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class StudentController {


    /**
     * 此处写@Autowired或者@Resource
     */
    @Resource
    private  StudentMapper studentMapper;

    @RequestMapping("test")
    public String test(ModelMap modelMap){
        Student student =studentMapper.getStudent();
        System.out.println(student);
        modelMap.addAttribute("list",student);
        return "/index";
    }

    @RequestMapping("test2")
    public String test2(Map map){
        Student student =studentMapper.getStudent();
        System.out.println(student);
        map.put("name",student.getName());
        return "/index";
    }

}
