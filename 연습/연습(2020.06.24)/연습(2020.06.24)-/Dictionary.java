/**
 * Write a description of class Dictionary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dictionary extends PairMap
{
    private String[] keyValueArray;

    Dictionary(int length){
        keyArray = new String[length];
        valueArray = new String[length];
        keyValueArray = new String[length];
    }

    public String get(String key){
        int i = 0;
        while(keyArray[i] != key){
            i ++;
        }

        if(valueArray != null){
            return valueArray[i];
        }
        else{
            return null;
        }
    }

    public void put(String key, String value){
        for(int i = 0 ; i < keyValueArray.length ; i++){
            if( keyValueArray[i] == null){
                keyValueArray[i] = key;
                keyValueArray[i] = value;                
            }
        }
    }

    public String delete(String key){
    }

    public int length(){
    }
}
