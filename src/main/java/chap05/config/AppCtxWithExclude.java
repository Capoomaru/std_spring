package chap05.config;

import chap05.spring.MemberDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"chap05.spring"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "chap05.spring2\\..*")
})
public class AppCtxWithExclude {
}
