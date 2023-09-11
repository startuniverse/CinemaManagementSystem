import java.util.Scanner;

public class login_screen {
    void showlogin(){
        System.out.println("*****登录界面*****");
        System.out.println("");
        System.out.println("账号：");
        System.out.println("密码：");
        System.out.println("");
        System.out.println("****************");
        System.out.println("");
        System.out.println("注册输入“1”和“0”");
        System.out.println("忘记(修改)密码输入“2”和“0”");
        System.out.println("");
        System.out.println("*****登录界面*****");
        System.out.println("");
    }
          //登陆界面方法
    boolean login(String account,String password1){
        String acc=String.valueOf(account);
        Scanner reader=new Scanner(System.in);
        UserInformation_sys user1=new UserInformation_sys();
         user1.addAdm();
        String guanliyuancode=user1.giveValue("admin");//管理员登录账号和密码
        if(account.equals("admin")&&password1.equals(guanliyuancode))
        {
            AdministratorScreen adm=new AdministratorScreen();
            while (adm.choice()){
                adm.loginAdministrator();
            }
            return  false;
        }
        if (account.equals("qiantai") && password1.equals("admin")//前台登录账号和密码
        ) {
            ReceptionScreen rec=new ReceptionScreen();
            while (rec.choice())
            {
                  rec.loginReception();
            }
            return  false;
        }
        if(account.equals("jingli")&&password1.equals("admin"))//经理登录账号和密码
        {
          ManagerScreen man=new ManagerScreen();
          while(man.choice()){
              man.loginManager();
          }
          return  false;
        }
        if(account.equals("1")&&password1.equals("0"))//注册相关代码
    {    System.out.println("请输入注册账户");
        String acc1=new String(reader.nextLine());
        System.out.println("请输入注册密码");
        String Password=reader.nextLine();
        register(acc1,Password);
        return false;
    }
    if(account.equals("2")&&password1.equals("0"))//修改密码相关代码
    {
        System.out.println("请输入注册账户");
        String acc1=new String(reader.nextLine());
        forget(acc1);
        return false;
    }
    //以下是判定登录代码，若登录成功则返回true，使得登录界面循环程序终结，进入用户界面
        // 若登录失败则返回false，继续登录循环
     UserInformation_sys log=new UserInformation_sys();
    if(log.inspect(acc,password1)==false)
        System.out.println("账号或密码输入错误，请重新输入！");
        if(log.inspect(acc,password1)==true)
            System.out.println("登录成功！");
    return log.inspect(acc,password1);
    }

      //注册代码，调用 UserInformation_sys的register的注册方法
     void register(String account,String password){
        UserInformation_sys reg=new UserInformation_sys();
        reg.register(account,password);

     }
     //修改密码，调用 UserInformation_sys的forget方法，
     void forget(String account){
        UserInformation_sys forg=new UserInformation_sys();
         Scanner reader=new Scanner(System.in);
         if(forg.forget(account))//判定账户是否存在，存在则修改密码
         {
             String newpassword=reader.nextLine();//接受新密码
             forg.reset(account,newpassword);
         }
         else
          System.out.println("账户不存在！");
     }


}
