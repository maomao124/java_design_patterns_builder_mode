package mao.builder_mode4;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode4
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 14:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder.setCpu("cpu")
                .setScreen("Screen")
                .setRearCamera("RearCamera")
                .build();
        System.out.println(phone);

        Phone phone1 = new PhoneBuilder()
                .setMemory("Memory")
                .build();
        System.out.println(phone1);
    }
}
