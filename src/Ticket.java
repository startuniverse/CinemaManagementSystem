import java.time.LocalDate;

public class Ticket {
    String name;//电影名
    LocalDate time;//购买时间
    String ticketcode;//票号
    int seat1,seat2;//座位
    void addname(String name){
    this.name=name;
    }//添加电影名
    void addtime(LocalDate time){
    this.time=time;
    }//添加购买实践
    void addticketcode(String ticketcode){
    this.ticketcode=ticketcode;
    }//添加票号
    //添加座位
    void addSeat(int x,int y){
        seat1=x;
        seat2=y;
    }
    //展示购买历史相干信息
    void showtickethistory(){
        System.out.println("历史购票信息：");
        System.out.println("影片名字："+name);
        System.out.println("《"+name+"》"+"观看时间："+time.getYear()+"年"+time.getMonthValue()+"月"+time.getDayOfMonth()+"日");
        System.out.println("《"+name+"》座位："+seat1+"排"+seat2+"列");
        System.out.println("《"+name+"》"+"票号："+ticketcode);
    }

}
