package mao.builder_mode2;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode
 * Class(类名): Bike
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 13:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Bike
{
    //车架
    private String frame;
    //车座
    private String seat;

    /**
     * Instantiates a new Bike.
     */
    public Bike()
    {

    }

    /**
     * Instantiates a new Bike.
     *
     * @param frame the frame
     * @param seat  the seat
     */
    public Bike(String frame, String seat)
    {
        this.frame = frame;
        this.seat = seat;
    }

    /**
     * Gets frame.
     *
     * @return the frame
     */
    public String getFrame()
    {
        return frame;
    }

    /**
     * Sets frame.
     *
     * @param frame the frame
     */
    public void setFrame(String frame)
    {
        this.frame = frame;
    }

    /**
     * Gets seat.
     *
     * @return the seat
     */
    public String getSeat()
    {
        return seat;
    }

    /**
     * Sets seat.
     *
     * @param seat the seat
     */
    public void setSeat(String seat)
    {
        this.seat = seat;
    }
}
