package test;

import com.ofzc.PracticeApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * @Author: cjh27
 * @Date: 2019/3/5
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PracticeApplication.class)
public class Tester {


    /**
     * ValueOperations：简单K-V操作
     * SetOperations：set类型数据操作
     * ZSetOperations：zset类型数据操作
     * HashOperations：针对map类型的数据操作
     * ListOperations：针对list类型的数据操作
     */
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private ValueOperations<String, String> valueOperations;
    @Autowired
    private HashOperations<String, String, Object> hashOperations;
    @Autowired
    private ListOperations<String, Object> listOperations;
    @Autowired
    private SetOperations<String, Object> setOperations;
    @Autowired
    private ZSetOperations<String, Object> zSetOperations;


    @Test
    public void test() {

        Set keys =
                redisTemplate.keys("*");

        System.out.println(keys);

        String name = valueOperations.get("name");

        System.out.println(name);


    }

}
