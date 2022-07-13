package chap05.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

public class MemberInfoPrinter2 {

    @Autowired
    private MemberPrinter printer;
}
