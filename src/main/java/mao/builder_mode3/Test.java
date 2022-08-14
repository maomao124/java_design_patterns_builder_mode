package mao.builder_mode3;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode3
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 14:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Phone phone = new Phone.Builder()
                .setCpu("CPU")
                .setMemory("memory")
                .setScreen("screen")
                .build();
        System.out.println(phone);

        Phone phone1 = new Phone.Builder()
                .setFrontCamera("FrontCamera")
                .setSpeaker("speaker")
                .build();
        System.out.println(phone1);
    }
}
