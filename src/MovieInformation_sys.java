import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieInformation_sys {
    public  static LinkedList<movie>movieinformation=new LinkedList<movie>();//电影全局链表，储存经理添加的电影
    public  static LinkedList<Ticket>TicketPurchaseHistory=new LinkedList<Ticket>();//电影票购买历史全局链表
    void add(movie mov){
        movieinformation.add(mov);
    }//添加电影
    void addtickethis(Ticket tic){
        TicketPurchaseHistory.add(tic);
    }//添加电影票购买历史
    //修改电影相关信息
    boolean revise(movie mov){
        if(movieinformation.contains(mov))
        {//具体操作为检测相关电影，若存在则删除原电影，添加新的电影信息
            movieinformation.remove(mov);
            movieinformation.add(mov);
                return true;
        }
        else
        {
            System.out.println("无此电影相关信息！");
        }
        return false;
    }
    //删除电影
    void delete(movie mov){
        if(movieinformation.contains(mov))
        {
            movieinformation.remove(mov);
            System.out.println("删除成功！");
        }
        else
        {
            System.out.println("无此电影相关信息！");
        }

    }
//利用iterator遍历展示电影信息
    void showmovie(){
        movie mov;
        Iterator<movie>iter=movieinformation.iterator();
        if(iter.hasNext()==false)
        {
            System.out.println("无任何影片！");
        }
        else{
        while(iter.hasNext())
        {
            mov= iter.next();
            mov.showmovie();
        }
        }

    }
    //查看特定电影信息
    void Viewspecified(movie mov){
        if(movieinformation.contains(mov))
        {//接受电影名，获取其再链表中的位置，随后展示其信息
        int index=movieinformation.indexOf(mov);
        movie mov1=movieinformation.get(index);
        mov1.showmovie();
        System.out.println("请继续选项！");
        }
        else
            System.out.println("未查到相关电影信息!");
    }
//座位选取相关代码
    void Seatselection(movie mov){
        if(movieinformation.contains(mov))
        {
            int index=movieinformation.indexOf(mov);
            movie mov1=movieinformation.get(index);
            System.out.println("请选择放映厅：");
            System.out.println("1号放映厅");
            System.out.println("2号放映厅");
            System.out.println("3号放映厅");
            System.out.println("4号放映厅");
            System.out.println("5号放映厅");
            Scanner ROOM=new Scanner(System.in);//此选取放映厅代码无用，只是为了完成选取放映厅功能而作
            String room=ROOM.nextLine();
            System.out.println("选择成功！");
            System.out.println("座位情况如下！");
            mov1.showseat();
            System.out.println("请选座位！");
            Scanner reader2=new Scanner(System.in);
            System.out.println("排：");
            int x=reader2.nextInt();
            System.out.println("列：");
            int y=reader2.nextInt();
            try {
                mov1.Seatselection(x,y);
                mov1.showseat();
            }
            catch (SeatselectionException e){
                System.out.println(e.warnMess());
            }

        }
        else
            System.out.println("未查到相关电影信息!");
    }
    //展示电影票购物历史
    void showtickethistory(){
        Ticket tic;
        Iterator<Ticket> iter=TicketPurchaseHistory.iterator();
        if(iter.hasNext()==false)
        {
            System.out.println("无任何购票历史！");
        }
        else{
            while(iter.hasNext())
            {
                tic= iter.next();
                tic.showtickethistory();
            }
        }

    }

}
