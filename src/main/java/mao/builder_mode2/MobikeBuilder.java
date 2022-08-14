package mao.builder_mode2;



/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode
 * Class(类名): MobikeBuilder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:37
 * Version(版本): 1.0
 * Description(描述)： 摩拜单车Builder类
 */

public class MobikeBuilder extends Builder
{

    @Override
    public void buildFrame()
    {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat()
    {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike()
    {
        return bike;
    }
}
