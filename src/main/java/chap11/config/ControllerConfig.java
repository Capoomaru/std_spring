package chap11.config;

import chap11.controller.RegisterController;
import chap11.spring.MemberRegisterService;
import chap11.survey.SurveyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegisterService;

    @Bean
    public RegisterController registerController() {
        RegisterController registerController = new RegisterController();
        registerController.setMemberRegisterService(memberRegisterService);

        return registerController;
    }

    @Bean
    public SurveyController surveyController() {
        return new SurveyController();
    }
}
