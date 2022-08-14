package mao.builder_mode2;


/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode2
 * Class(类名): Builder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public abstract class Builder
{
    /**
     * The Bike.
     */
    protected Bike bike = new Bike();

    /**
     * Build frame.
     */
    public abstract void buildFrame();

    /**
     * Build seat.
     */
    public abstract void buildSeat();

    /**
     * Create bike.
     *
     * @return the bike
     */
    public abstract Bike createBike();

    /**
     * Construct bike.
     *
     * @return the bike
     */
    public Bike construct()
    {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
