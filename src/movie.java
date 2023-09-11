import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class movie {
    public String name;
    public String information;
    public String seat[][]={{""," 1","2"," 3","4"," 5","6","7"," 8","9","10","11","12"},
                            {"1","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"2","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"3","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"4","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"5","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"6","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"},
                            {"7","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪","⚪"," ⚪"}
                                                                                   };
    void givename(String moviename){
        name=moviename;
    }//赋予电影名
    void giveinformation(String movieinformation){
        information=movieinformation;
    }//赋予电影相关信息
    void showmovie(){//展示电影名和相关信息
        System.out.println("*****************************************");
        System.out.println("影片名字："+name);
        System.out.println("《"+name+"》"+"影片相关信息："+information);
        System.out.println("*****************************************");
    }
    //重写equals方法，使其判定以电影名为准
    public boolean equals(Object o){
        movie p=(movie) o;
        return name.equals(p.name);
    }
    //展示座位
    void showseat(){
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }

    }
    //座位选取相关代码
    public void Seatselection(int x,int y)throws SeatselectionException{
        if (x>7||x<1||y<1||y>12)//异常类编写，防止座位选取不合理
        {
            throw new SeatselectionException(x,y);//抛出座位选取异常类
        }
        if(seat[x][y].equals("⚪"))
        {
            seat[x][y]="✖";
            System.out.println("选择成功！");
            System.out.println("进入支付界面");
            System.out.println("支付成功!");
            Random random=new Random();//随机生成一段数字并储存作为票号
            BigInteger ticketcode=new BigInteger(""+random.nextInt(1000000000));
            Ticket tic=new Ticket();
            tic.addname(this.name);
            tic.addSeat(x,y);
            LocalDate datenow=LocalDate.now();//记录购买电影票日期
            tic.addtime(datenow);
            tic.addticketcode(""+ticketcode);
            MovieInformation_sys mov=new MovieInformation_sys();
            mov.addtickethis(tic);
            System.out.println("票号："+ticketcode);
        }else{
              if(seat[x][y].equals("✖"))
        {
            System.out.println("该座位已被选购请重新选择！");

        }
        }

    }
}
