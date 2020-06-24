
/**
 * Write a description of class Dictionary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dictionary extends PairMap
{
    Dictionary(int length){
        keyArray = new String[length];
        valueArray = new String[length];
    }
    
    public String get(String key){
        for(int i = 0 ; i < keyArray.length ; i ++){
            if(key == keyArray[i]){
                return valueArray[i];
            }
            break;
        }
        return null;
    }

    public void put(String key, String value){
        for(int i = 0 ; i < keyArray.length ; i ++){
            if(key == keyArray[i]){
                valueArray[i] = value;
            }
        }
          
    }

    public String delete(String key){
        String resultData = new String();
        for(int i = 0 ; i < keyArray.length ; i ++){
            if(key == keyArray[i]){
                valueArray[i] = null;
                resultData = valueArray[i];
            }
        }
        return resultData;
    }

    public int length(){
        for(int i = 0 ; i < keyArray.length ; i ++){
            if(keyArray[i] == null){
                return i + 1;
            }
        }
        return keyArray.length;
    }
    
    public void getArray(){
        System.out.println(keyArray[0]);
    }
}
