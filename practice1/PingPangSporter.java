package practice1;

public class PingPangSporter extends Sporter implements SayEng{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球运动员说英文");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }
}
