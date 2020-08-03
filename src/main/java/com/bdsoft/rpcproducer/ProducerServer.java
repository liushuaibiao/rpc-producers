/*
 * Copyright(C) 2013-2017 BaiduInc.ALL Rights Reserved.
 *
 * FileName: ProducerServer
 *
 * Description: xxxxx
 *
 * History:
 * 版本号    作者    日期    操作
 * 1.0    liushuaibiao 2020/7/30   x
 * ...
 */
package com.bdsoft.rpcproducer;

import com.bdsoft.rpcaio.API.Result;
import com.bdsoft.rpcaio.API.StudentInfo;
import com.bdsoft.rpcaio.API.StudentServiceApi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liushuaibiao
 * @version 1.0
 * @date 2020/7/30
 * @see
 */
public class ProducerServer implements StudentServiceApi {

    private      static Map<String,StudentInfo> studentBeanMap = new HashMap<>();

    @Override
    public Result<StudentInfo> queryStudent(StudentInfo param){
        System.out.println("收到一个请求："+param.getName());
        Result<StudentInfo> result = new Result<>();
        StudentInfo studentInfo = studentBeanMap.get(param.getName());
        if(studentInfo!=null){
            result.setData(studentInfo);
            result.setSuccess(true);

        }
        else {
            result.setFailCode("500");
            result.setSuccess(false);
        }
        return result;

    }

    static {
        StudentInfo studentInfo1 = new StudentInfo();
        studentInfo1.setName("嘿嘿");
        studentInfo1.setAge(10);
        studentInfo1.setSex("男");
        studentInfo1.setSize(20);

        StudentInfo studentInfo2 = new StudentInfo();
        studentInfo1.setName("呵呵");
        studentInfo1.setAge(10);
        studentInfo1.setSex("男");
        studentInfo1.setSize(20);
        StudentInfo studentInfo3 = new StudentInfo();
        studentInfo1.setName("嘻嘻");
        studentInfo1.setAge(10);
        studentInfo1.setSex("男");
        studentInfo1.setSize(20);


        studentBeanMap.put("嘿嘿",studentInfo1);
        studentBeanMap.put("呵呵",studentInfo2);
        studentBeanMap.put("嘻嘻",studentInfo3);

    }

}

