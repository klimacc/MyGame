/**
 * Created by Acc on 20.09.2014.
 */
public class Your extends Character{
    public Your(String _name, int _age)
    {
        super(_name);
        age = _age;
        fear = (int)(((double)age/10) * Math.random() * 100);
        wisdom = (int)(Math.random() * 10);
    }
    private int age;
    private int fear;
    private int wisdom;
    public int getFear()
    {
        return fear;
    }
    public void setWisdom(int a)
    {
        wisdom += a;
    }
    public int getWisdom()
    {
        return wisdom;
    }
}
