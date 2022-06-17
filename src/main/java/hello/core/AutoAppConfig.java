package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // @Configuration도 자동으로 빈 등록이 되므로 AppConfig를 빼기위해 설정해줌
)// @Component 붙은 클래스를 자동으로 등록을 해준다.{

public class AutoAppConfig { // 빈으로 등록하는 클래스가 없는 상태 그러나 빈으로 다른 애들을 스프링 빈에 등록해준다.

}
