package practice1;
/*
    任务：
    乒乓球运动员：姓名，年龄，学打乒乓球，说英语
    篮球运动员：姓名，年龄，学打篮球
    乒乓球教练：姓名，年龄，教打乒乓球，说英语
    篮球教练：姓名，年龄，教打篮球
    用接口与继承编写其JavaBean类

    分解思路：
       （1） 人可以分为两类，运动员和教练
            行为可以分为，学和教
       （2） 人分为  篮球行业和乒乓球行业
            行为分为 学和教，乒乓球类独有个说英语类
       紧接着，人可以概括为个人这个总类
    执行操作：
    一个父类Person，继承给子类运动员和教练，其内包含对应的虚方法，运动员和教练再继承给不同行业的，对于乒乓球行
    业额外编写一个说英语的接口

    具体细节：
    Person包含基本信息：姓名，年龄；包含抽象行为：behave
    运动员包含：具体行业名
*/
public class Draft {
    public static void main(String[] args) {
        Person pps = new PingPangSporter("刘诗雯", 23);
        Person bs = new BasketballSporter();
        Person ppc = new PingPangCoach();
        Person bc = new BasketballCoach();

        System.out.println(pps.getName() + "，" + pps.getAge());

        ((PingPangSporter) pps).study();
        //强制转换Person类的多态子类回归至单一子类，才可使用子类中特有的方法
        ((PingPangSporter) pps).speakEng();
    }
}
