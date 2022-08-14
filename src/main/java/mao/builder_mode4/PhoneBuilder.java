package mao.builder_mode4;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode4
 * Class(类名): PhoneBuilder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 14:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class PhoneBuilder
{
    private String cpu;
    private String screen;
    private String memory;
    private String motherboard;
    private String frontCamera;
    private String rearCamera;
    private String speaker;

    /**
     * Instantiates a new Phone builder.
     */
    public PhoneBuilder()
    {

    }

    /**
     * Sets cpu.
     *
     * @param cpu the cpu
     * @return the cpu
     */
    public PhoneBuilder setCpu(String cpu)
    {
        this.cpu = cpu;
        return this;
    }

    /**
     * Sets screen.
     *
     * @param screen the screen
     * @return the screen
     */
    public PhoneBuilder setScreen(String screen)
    {
        this.screen = screen;
        return this;
    }

    /**
     * Sets memory.
     *
     * @param memory the memory
     * @return the memory
     */
    public PhoneBuilder setMemory(String memory)
    {
        this.memory = memory;
        return this;
    }

    /**
     * Sets motherboard.
     *
     * @param motherboard the motherboard
     * @return the motherboard
     */
    public PhoneBuilder setMotherboard(String motherboard)
    {
        this.motherboard = motherboard;
        return this;
    }

    /**
     * Sets front camera.
     *
     * @param frontCamera the front camera
     * @return the front camera
     */
    public PhoneBuilder setFrontCamera(String frontCamera)
    {
        this.frontCamera = frontCamera;
        return this;
    }

    /**
     * Sets rear camera.
     *
     * @param rearCamera the rear camera
     * @return the rear camera
     */
    public PhoneBuilder setRearCamera(String rearCamera)
    {
        this.rearCamera = rearCamera;
        return this;
    }

    /**
     * Sets speaker.
     *
     * @param speaker the speaker
     * @return the speaker
     */
    public PhoneBuilder setSpeaker(String speaker)
    {
        this.speaker = speaker;
        return this;
    }

    /**
     * Build phone.
     *
     * @return the phone
     */
    public Phone build()
    {
        Phone phone = new Phone();
        phone.setCpu(this.cpu);
        phone.setScreen(this.screen);
        phone.setMemory(this.memory);
        phone.setMotherboard(this.motherboard);
        phone.setFrontCamera(this.frontCamera);
        phone.setRearCamera(this.rearCamera);
        phone.setSpeaker(this.speaker);
        return phone;
    }
}
