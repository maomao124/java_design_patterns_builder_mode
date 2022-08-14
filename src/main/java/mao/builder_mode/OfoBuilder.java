package mao.builder_mode;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode
 * Class(类名): OfoBuilder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:38
 * Version(版本): 1.0
 * Description(描述)： ofo单车Builder类
 */

public class OfoBuilder extends Builder
{

    @Override
    public void buildFrame()
    {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat()
    {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike()
    {
        return bike;
    }
}
