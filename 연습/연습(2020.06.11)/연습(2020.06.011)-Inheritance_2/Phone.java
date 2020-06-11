import java.util.Scanner;
public class Phone{
    private int phoneNumber;
    private boolean callStatus;

    public Phone(){
        setPhoneNumber();
    }

    public void setPhoneNumber(){
        System.out.println("please enter your phone number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        this.phoneNumber = num;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void calling(int num){
        System.out.println("Calling" + num);
    }

    public void recive(boolean b){
        if( b == true){
            this.callStatus = true;
        }
    }
}