import java.util.Scanner;

public class Manager_sys {
    //经理相关代码
    //添加电影相关代码
    void addmovie(String name,String information){
        //接受电影名和电影相关信息
        movie m1=new movie();
        m1.givename(name);
        m1.giveinformation(information);
        MovieInformation_sys mov=new MovieInformation_sys();
        mov.add(m1);
    }
    //修改电影的相关信息
    boolean revise(String name ,String information){
        movie m1=new movie();
        m1.givename(name);
        m1.giveinformation(information);
        MovieInformation_sys mov=new MovieInformation_sys();
        mov.revise(m1);
        return mov.revise(m1);
    }
    //删除电影
    void delete(String name){
        movie m1=new movie();
        m1.givename(name);
        Scanner reader=new Scanner(System.in);
        MovieInformation_sys mov=new MovieInformation_sys();
        System.out.println("再次确实是否删除此电影相关信息！");
        System.out.println("请输入：");
        System.out.println("1（确认删除）");
        System.out.println("0（取消）");
        int boo=reader.nextInt();//使用户再次确认是否删除
        if(boo==1)
            mov.delete(m1);
        if(boo==0)
            System.out.println("取消成功！");
    }
    //遍历展示所有电影相关信息
    void showmovie(){
        MovieInformation_sys mov=new MovieInformation_sys();
        mov.showmovie();
    }

}
