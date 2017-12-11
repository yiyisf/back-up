package com.slys.start.start.controller;

import com.slys.start.start.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentServiceController {
    private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();

    static {
        schooDB = new HashMap<String, List<Student>>();
        List<Student> list = new ArrayList<Student>();
        Student std = new Student("test1", "class1");
        list.add(std);
        std = new Student("test2", "class2");
        list.add(std);

        schooDB.put("xyzschool", list);
    }

    @RequestMapping(value = "/getStudentDetailForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Student> getStudent(@PathVariable String schoolname){
        System.out.println("getting dtail for :" + schoolname);
        List<Student> list = schooDB.get(schoolname);

        if (list == null) {
            list = new ArrayList<Student>();
            Student std = new Student("未找到", "N/A");
            list.add(std);
        }

        return list;
    }
}
