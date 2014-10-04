/**
 * Created by Acc on 20.09.2014.
 */
public class Character{
    public Character(String _name)
    {
        name = _name;
        passion = (int)(Math.random() * 100);
    }
    protected String name;
    protected int passion;
    public String getName()
    {
        return name;
    }
    public int getPassion()
    {
        return passion;
    }
}
