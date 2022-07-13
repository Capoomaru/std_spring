package chap05.spring;

public class Main {
    public static void main(String[] agrs) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService regSvc = new MemberRegisterService(memberDao);
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
        //regSvc와 pwdSvc 사용 코드
    }
}
