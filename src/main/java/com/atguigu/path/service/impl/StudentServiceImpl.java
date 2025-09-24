package com.atguigu.path.service.impl;

import com.atguigu.path.entity.Student;
import com.atguigu.path.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudentMessage(String id) {
        if(id.equals("1")){
            return new Student("张三",18,"男");
        }
        return null;
    }
}
