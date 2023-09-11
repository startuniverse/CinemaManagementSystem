import java.util.Scanner;

public class AdministratorScreen {
    public boolean cho=true;//防止多次调用loginAdministrator方法
     AdministratorScreen(){
        System.out.println("进入管理员界面！");
        System.out.println("");
        System.out.println("*************************");
        System.out.println("管理员权限选项：");
        System.out.println("修改自身密码，输入：1");
        System.out.println("修改指定用户密码，输入：2");
         System.out.println("列出所有用户信息，输入：3");
         System.out.println("查询用户信息，输入：4");
         System.out.println("删除用户信息，输入：5");
        System.out.println("输入其他以退出管理员界面！");
         System.out.println("*************************");

    }
      //管理员登录界面方法
    void loginAdministrator(){
        Scanner reader=new Scanner(System.in);
        String option= reader.nextLine();
        if(option.equals("1")){
            Scanner reader1=new Scanner(System.in);
            System.out.println("请输入修改后的密码！");
            UserInformation_sys user=new UserInformation_sys();
            String code=reader1.nextLine();
            user.reset("admin",code);
            System.out.println("修改成功！");
            System.out.println("请继续选项！");
            cho=true;
        }
        else{
             if(option.equals("2"))
             {
                 Scanner reader2=new Scanner(System.in);
                 System.out.println("请输入想要修改的指定用户账号！");
                 String account=reader2.nextLine();
                 System.out.println("请输入修改修改后的密码！");
                 String password=reader2.nextLine();
                 UserInformation_sys user1=new UserInformation_sys();
                 user1.reset(account,password);
                 System.out.println("修改成功！");
                 System.out.println("请继续选项！");
                 cho=true;
             }
             else{
                 if(option.equals("3")){
               UserInformation_sys user2=new UserInformation_sys();
               user2.showuser();
                     System.out.println("请继续选项！");
                     cho=true;
                 }
                 else{
                     if(option.equals("4")){
                         Scanner reader4=new Scanner(System.in);
                         System.out.println("请输入想要查询的用户账号！");
                         String account=reader4.nextLine();
                         UserInformation_sys user4=new UserInformation_sys();
                            if(user4.judgeexis(account))
                            {System.out.println("用户账号:"+account);
                         System.out.println("用户密码:"+user4.giveValue(account));}
                            else
                                System.out.println("无此用户信息！");
                         System.out.println("请继续选项！");
                         cho=true;

                     }
                         else
                     {
                         if(option.equals("5")){
                             Scanner reader5=new Scanner(System.in);
                             System.out.println("请输入想要删除的用户账号！");
                             String account=reader5.nextLine();
                             UserInformation_sys user5=new UserInformation_sys();
                             if(user5.judgeexis(account))
                             {
                                 user5.delete(account);
                             }
                             else
                                 System.out.println("无此用户信息！");
                                 System.out.println("请继续选项！");
                                 cho=true;
                         }
                         else
                         {
                             System.out.println("退出成功！");
                             cho=false;
                         }
                     }
                 }
             }
        }
    }
    boolean choice(){
        return cho;
    }
}
