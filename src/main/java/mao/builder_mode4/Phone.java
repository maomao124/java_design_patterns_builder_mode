package mao.builder_mode4;

/**
 * Project name(项目名称)：java设计模式_建造者模式
 * Package(包名): mao.builder_mode4
 * Class(类名): Phone
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 14:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Phone
{
    private String cpu;
    private String screen;
    private String memory;
    private String motherboard;
    private String frontCamera;
    private String rearCamera;
    private String speaker;

    /**
     * Instantiates a new Phone.
     */
    public Phone()
    {

    }

    /**
     * Instantiates a new Phone.
     *
     * @param cpu         the cpu
     * @param screen      the screen
     * @param memory      the memory
     * @param motherboard the motherboard
     * @param frontCamera the front camera
     * @param rearCamera  the rear camera
     * @param speaker     the speaker
     */
    public Phone(String cpu, String screen, String memory, String motherboard, String frontCamera, String rearCamera, String speaker)
    {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.motherboard = motherboard;
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
        this.speaker = speaker;
    }

    /**
     * Gets cpu.
     *
     * @return the cpu
     */
    public String getCpu()
    {
        return cpu;
    }

    /**
     * Sets cpu.
     *
     * @param cpu the cpu
     */
    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    /**
     * Gets screen.
     *
     * @return the screen
     */
    public String getScreen()
    {
        return screen;
    }

    /**
     * Sets screen.
     *
     * @param screen the screen
     */
    public void setScreen(String screen)
    {
        this.screen = screen;
    }

    /**
     * Gets memory.
     *
     * @return the memory
     */
    public String getMemory()
    {
        return memory;
    }

    /**
     * Sets memory.
     *
     * @param memory the memory
     */
    public void setMemory(String memory)
    {
        this.memory = memory;
    }

    /**
     * Gets motherboard.
     *
     * @return the motherboard
     */
    public String getMotherboard()
    {
        return motherboard;
    }

    /**
     * Sets motherboard.
     *
     * @param motherboard the motherboard
     */
    public void setMotherboard(String motherboard)
    {
        this.motherboard = motherboard;
    }

    /**
     * Gets front camera.
     *
     * @return the front camera
     */
    public String getFrontCamera()
    {
        return frontCamera;
    }

    /**
     * Sets front camera.
     *
     * @param frontCamera the front camera
     */
    public void setFrontCamera(String frontCamera)
    {
        this.frontCamera = frontCamera;
    }

    /**
     * Gets rear camera.
     *
     * @return the rear camera
     */
    public String getRearCamera()
    {
        return rearCamera;
    }

    /**
     * Sets rear camera.
     *
     * @param rearCamera the rear camera
     */
    public void setRearCamera(String rearCamera)
    {
        this.rearCamera = rearCamera;
    }

    /**
     * Gets speaker.
     *
     * @return the speaker
     */
    public String getSpeaker()
    {
        return speaker;
    }

    /**
     * Sets speaker.
     *
     * @param speaker the speaker
     */
    public void setSpeaker(String speaker)
    {
        this.speaker = speaker;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Phone phone = (Phone) o;

        if (getCpu() != null ? !getCpu().equals(phone.getCpu()) : phone.getCpu() != null)
        {
            return false;
        }
        if (getScreen() != null ? !getScreen().equals(phone.getScreen()) : phone.getScreen() != null)
        {
            return false;
        }
        if (getMemory() != null ? !getMemory().equals(phone.getMemory()) : phone.getMemory() != null)
        {
            return false;
        }
        if (getMotherboard() != null ? !getMotherboard().equals(phone.getMotherboard()) : phone.getMotherboard() != null)
        {
            return false;
        }
        if (getFrontCamera() != null ? !getFrontCamera().equals(phone.getFrontCamera()) : phone.getFrontCamera() != null)
        {
            return false;
        }
        if (getRearCamera() != null ? !getRearCamera().equals(phone.getRearCamera()) : phone.getRearCamera() != null)
        {
            return false;
        }
        return getSpeaker() != null ? getSpeaker().equals(phone.getSpeaker()) : phone.getSpeaker() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getCpu() != null ? getCpu().hashCode() : 0;
        result = 31 * result + (getScreen() != null ? getScreen().hashCode() : 0);
        result = 31 * result + (getMemory() != null ? getMemory().hashCode() : 0);
        result = 31 * result + (getMotherboard() != null ? getMotherboard().hashCode() : 0);
        result = 31 * result + (getFrontCamera() != null ? getFrontCamera().hashCode() : 0);
        result = 31 * result + (getRearCamera() != null ? getRearCamera().hashCode() : 0);
        result = 31 * result + (getSpeaker() != null ? getSpeaker().hashCode() : 0);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("cpu：").append(cpu).append('\n');
        stringbuilder.append("screen：").append(screen).append('\n');
        stringbuilder.append("memory：").append(memory).append('\n');
        stringbuilder.append("motherboard：").append(motherboard).append('\n');
        stringbuilder.append("frontCamera：").append(frontCamera).append('\n');
        stringbuilder.append("rearCamera：").append(rearCamera).append('\n');
        stringbuilder.append("speaker：").append(speaker).append('\n');
        return stringbuilder.toString();
    }
}
