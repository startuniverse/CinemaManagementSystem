import java.util.Scanner;

public class UserScreen {
    public boolean cho=true;
    void UserScreen(){
        System.out.println("进入用户浏览界面！");
        System.out.println("***********************");
        System.out.println("查看所有电影放映信息，输入1");
        System.out.println("查看指定电影放映信息，输入2");
        System.out.println("选座购票，输入3");
        System.out.println("查看购票历史，输入4");
        System.out.println("输入其他以退出界面！");
        System.out.println("***********************");
    }
    //用户登录界面相关选项
    boolean option(){
        Scanner reader=new Scanner(System.in);
        String opt= reader.nextLine();
        if(opt.equals("1"))
        {
        Manager_sys man=new Manager_sys();
        man.showmovie();
        System.out.println("请继续选项！");
        cho=true;
        return true;
        }else{
        if(opt.equals("2"))
        {
            Scanner reader1=new Scanner(System.in);
            System.out.println("请输入想要查看的电影名！");
            String name=reader1.nextLine();
            movie mov=new movie();
            mov.givename(name);
            MovieInformation_sys mov1=new MovieInformation_sys();
            mov1.Viewspecified(mov);
            cho=true;
            return true;
        }else{
        if(opt.equals("3"))
        {
            Scanner reader1=new Scanner(System.in);
            System.out.println("请输入想要购票的电影名！");
            String name=reader1.nextLine();
            movie mov=new movie();
            mov.givename(name);
            MovieInformation_sys mov1=new MovieInformation_sys();
            mov1.Seatselection(mov);
            System.out.println("请继续选项！");
            cho=true;
           return true;
        }else {
        if(opt.equals("4"))
        {
             MovieInformation_sys mov=new MovieInformation_sys();
             mov.showtickethistory();
            System.out.println("请继续选项！");
            cho=true;
            return true;
        }else {
        System.out.println("退出成功！");
        }
        }
        }
        }
        cho=false;
     return false;
    }


}
