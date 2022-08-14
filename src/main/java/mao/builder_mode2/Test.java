package mao.builder_mode2;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        {
            Builder builder = new MobikeBuilder();
            Bike bike = builder.construct();
            System.out.println(bike.getFrame());
            System.out.println(bike.getSeat());
        }

        {
            Builder builder = new OfoBuilder();
            Bike bike = builder.construct();
            System.out.println(bike.getFrame());
            System.out.println(bike.getSeat());
        }
    }
}
