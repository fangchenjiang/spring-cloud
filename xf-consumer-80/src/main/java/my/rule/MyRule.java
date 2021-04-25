package my.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description Ribbon规则替换类
 * @Author Fangchenjiang
 * @Date 2021/4/4 17:19
 */
@Configuration
public class MyRule {

    @Bean
    public IRule iRule(){
        //替换成随机算法
        return  new RandomRule();
    }
}
