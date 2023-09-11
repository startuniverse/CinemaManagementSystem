import java.util.Scanner;

public class ManagerScreen {
    public boolean cho=true;//防止Test多次调用
    Manager_sys manger=new Manager_sys();
    ManagerScreen(){
        System.out.println("进入经理界面！");
        System.out.println("");
        System.out.println("*************************");
        System.out.println("经理权限选项：");
        System.out.println("列出所有上映影片信息，输入：1");
        System.out.println("添加即将上映影片信息，输入：2");
        System.out.println("修改上映影片信息，输入：3");
        System.out.println("删除影片信息，输入：4");
        System.out.println("输入其他以退出经理界面！");
        System.out.println("*************************");

    }
    //经理登录界面方法
    void loginManager(){
         Scanner reader=new Scanner(System.in);
         String option= reader.nextLine();
         if (option.equals("1"))
         {
             manger.showmovie();
             System.out.println("请继续选项！");
             cho=true;
         }else{
         if (option.equals("2"))
         {  Scanner reader1=new Scanner(System.in);
             String name,information;
             System.out.println("输入添加的影片名");
             name=reader1.nextLine();
             System.out.println("输入添加的影片相关信息");
             information=reader1.nextLine();
             manger.addmovie(name,information);
             System.out.println("添加成功！");
             System.out.println("请继续选项！");
             cho=true;
         }else{
         if (option.equals("3"))
         {
             Scanner reader1=new Scanner(System.in);
             String name,information;
             System.out.println("输入想要修改的影片名");
             name=reader1.nextLine();
             System.out.println("输入修改后的影片相关信息");
             information=reader1.nextLine();
             manger.revise(name,information);
             if(manger.revise(name,information))
                 System.out.println("修改成功！");
             System.out.println("请继续选项！");
             cho=true;
         }else{
         if (option.equals("4"))
         {   Scanner reader1=new Scanner(System.in);
             String name,information;
             System.out.println("输入想要删除的影片名");
             name=reader1.nextLine();
             manger.delete(name);
             System.out.println("请继续选项！");
             cho=true;
         }else{
         System.out.println("退出成功！");
        cho=false;
         }
         }
         }
         }
    }
    boolean choice(){
        return cho;
    }
}
