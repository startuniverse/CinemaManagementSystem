public class SeatselectionException extends Exception{
    //座位选取异常类
    String message;
    public SeatselectionException(int x,int y){
        message=x+"排"+y+"列不可选！" +
                "请选择7排12列以内的可选座位！";
    }
    public  String warnMess(){
        return  message;
    }
}
