package chap05.config;

import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberSummaryPrinter;
import chap05.spring.VersionPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = {"chap05.spring"}, excludeFilters = @ComponentScan.Filter(type= FilterType.REGEX, pattern = "chap05.spring\\..*Dao"))
//@ComponentScan(basePackages = {"chap05.spring"}, excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ, pattern = "spring.*Dao"))
@ComponentScan(basePackages = {"chap05.spring", "chap05.spring2"}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {NoProduct.class, ManualBean.class}))
public class AppCtx {

//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }


    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
