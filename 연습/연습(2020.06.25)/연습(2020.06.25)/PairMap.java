
/**
 * Abstract class PairMap - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class PairMap
{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
