package test;

import cn.hutool.core.util.PinyinUtil;
import com.ofzc.modules.tst.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @Author: cjh27
 * @Date: 2019/2/20
 */
public class Test2 {


    public static void main(String[] args) {

        //1
        String di = PinyinUtil.getPinYin("丫");
        System.out.println(di);


        //2
        String str = "just  so so";
        String firstLetter = PinyinUtil.getAllFirstLetter(str);
        System.out.println(firstLetter);

        //3
        char c = PinyinUtil.getFirstLetter(str.charAt(0));
        System.out.println(c);
    }


    @Test
    public void test() {

        User u = new User();
        u.setAge(23);
        u.setName("jisadios");


        Optional.ofNullable(u).map(age -> u.getAge()).orElse(1);


        List<String> uuidList = new ArrayList<>();

        uuidList.add(UUID.randomUUID().toString());
        uuidList.add(UUID.randomUUID().toString());

        List<User> users = uuidList.stream().map(uuid -> {

            User us = new User();
//            us.setId(uuid);
            us.setName(uuid);

            return us;
        }).collect(Collectors.toList());

        System.out.println(users);

    }

}
