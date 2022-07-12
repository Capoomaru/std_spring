package chap04.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class MemberPrinter {

    private DateTimeFormatter dateTimeFormatter;

    public MemberPrinter() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    }

    public void print(Member member) {
        System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=", member.getId(), member.getEmail(), member.getName());
        if(dateTimeFormatter == null)
            System.out.printf("%tF\n", member.getRegisterDateTime());
        else
            System.out.println(dateTimeFormatter.format(member.getRegisterDateTime()));

    }

    //#1 old version //bean 존재하지 않으면 호출 X
/*    @Autowired(required = false)
    public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }*/

    //#2 new version(Spring5 / Java8)
    @Autowired
    public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
        this.dateTimeFormatter = (formatterOpt.isPresent()) ? formatterOpt.get() : null;
    }

    //#3 //bean 존재하지 않아도 호출 O //@Nullable : 스프링제공 / JSR 305 or 코틀린에서도 제공
/*    @Autowired
    public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }*/
}
