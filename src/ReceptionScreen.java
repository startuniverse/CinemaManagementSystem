import java.util.Scanner;

public class ReceptionScreen {
    public boolean cho=true;//防止多次调用
    ReceptionScreen(){
        System.out.println("进入前台界面！");
        System.out.println("");
        System.out.println("*************************");
        System.out.println("前台权限选项：");
        System.out.println("列出所有电影信息，输入：1");
        System.out.println("列出指定电影信息，输入：2");
        System.out.println("输入其他以退出管理员界面！");
        System.out.println("*************************");
    }


//前台登录界面相关代码
      void loginReception(){
          Scanner reader=new Scanner(System.in);
          String option= reader.nextLine();
          if(option.equals("1")){
            MovieInformation_sys mov=new MovieInformation_sys();
            mov.showmovie();
              System.out.println("请继续选项！");
              cho=true;
          }else {
              if(option.equals("2")){
                  Scanner reader2=new Scanner(System.in);
                  System.out.println("请输入想要查看的电影名！");
                  String name=reader2.nextLine();
                  movie mov=new movie();
                  mov.givename(name);
                  MovieInformation_sys mov2=new MovieInformation_sys();
                  mov2.Viewspecified(mov);
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
    boolean choice(){
        return cho;
    }
}
