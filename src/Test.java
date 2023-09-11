import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        login_screen log=new login_screen();
        UserScreen usersc=new UserScreen();

        while (usersc.cho){
            //显示登陆界面
            log.showlogin();
            Scanner reader=new Scanner(System.in);
            //登录界面的判定，若成功则进入用户界面，若失败则重复此过程
        while (!(log.login(reader.nextLine(), reader.nextLine())))
        {
            log.showlogin();
        }
        usersc.UserScreen();
            //进入用户界面
        while(usersc.cho){
            usersc.option();
        }
            //当用户从用户界面退出，则使其回到登陆界面
        usersc.cho=true;
        }
    }
}
