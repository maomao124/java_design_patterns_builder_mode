package mao.builder_mode;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode
 * Class(类名): Director
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:39
 * Version(版本): 1.0
 * Description(描述)： 指挥者类
 */


public class Director
{
    private final Builder builder;

    /**
     * Instantiates a new Director.
     *
     * @param builder the builder
     */
    public Director(Builder builder)
    {
        this.builder = builder;
    }

    /**
     * Construct bike.
     *
     * @return the bike
     */
    public Bike construct()
    {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
