package practice1;

public class PingPangCoach extends Coach implements SayEng{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球教练说英文");
    }
}
