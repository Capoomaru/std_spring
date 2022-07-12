package chap03.spring;

public class VersionPrinter {

    private int majorVersion;
    private int minorVersion;

    public void print() {
        System.out.println("이 프로그램의 버전은 "+majorVersion+"."+minorVersion+"입니다.\n");
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }
}
