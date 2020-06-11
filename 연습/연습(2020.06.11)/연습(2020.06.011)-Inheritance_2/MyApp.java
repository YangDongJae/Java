public class MyApp
{
    public static void main(String[] args){
        Phone phone = new Phone();
        MobilePhone mobilePhone = new MobilePhone();
        MusicPhone musicPhone = new MusicPhone();
        
        musicPhone.downloadMusic("2020");
    }
}