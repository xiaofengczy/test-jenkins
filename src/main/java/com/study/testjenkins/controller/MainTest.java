package com.study.testjenkins.controller;

import com.study.testjenkins.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 2019/7/19
 */
@RestController
@RequestMapping("/web")
public class MainTest {

  @GetMapping("/getUser")
  public User getUser(){
    User user = new User();
    user.setId(1);
    user.setUserName("张三");
    return user;
  }

}