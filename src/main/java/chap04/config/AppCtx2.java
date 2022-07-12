package chap04.config;

import chap04.spring.MemberInfoPrinter2;
import chap04.spring.MemberPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {

    @Bean
    public MemberPrinter printer() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("mprinter")
    public MemberPrinter printer2() {
        return new MemberPrinter();
    }

    @Bean
    public MemberInfoPrinter2 infoPrinter() {
        return new MemberInfoPrinter2();
    }
}
