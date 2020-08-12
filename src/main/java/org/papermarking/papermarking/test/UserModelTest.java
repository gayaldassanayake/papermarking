package org.papermarking.papermarking.test;

import org.papermarking.papermarking.model.userModel.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserModelTest {

    public static void userObjectTest(){
        User user= new User(null , "email" , "name" , 1 , 2, 3,new Date() , new Date() , new Date() ,new ArrayList<>());
        System.out.println("name  "+user.getName());
        System.out.println("subjects  "+user.getSubjects());
        System.out.println("id  "+user.getId());
    }


}
