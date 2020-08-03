/*
 * Copyright(C) 2013-2017 BaiduInc.ALL Rights Reserved.
 *
 * FileName: HelloServiceImpl
 *
 * Description: xxxxx
 *
 * History:
 * 版本号    作者    日期    操作
 * 1.0    liushuaibiao 2020/7/30   x
 * ...
 */
package com.bdsoft.rpcproducer;

import com.bdsoft.rpcaio.API.HelloService;
import com.bdsoft.rpcaio.API.Person;

/**
 * @author liushuaibiao
 * @version 1.0
 * @date 2020/7/30
 * @see
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return "hello,"+s;
    }

    @Override
    public Person getPerson(String s) {
        Person person = new Person();
        person.setName(s);
        person.setAge(20);
        return person;
    }
}

