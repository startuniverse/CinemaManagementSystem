import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public  class UserInformation_sys {
    //此代码为初期代码，利用hashmap储存账号和密码，较为方便，但对于储存用户的相关信息如用户名，用户等级等之类不方便
    //但是意识到这点时已经完成大部分代码，修改已经无力回天，如果重头来应该利用链表，而不是用hashmap
    public static HashMap<String,String>user=new HashMap<String,String>();
    public  static  int ADMcount=0;//管理员相关代码
    //注册相关代码
    void register(String acc,String password){
        user.put(acc,password);
        System.out.println("注册成功！");
    }
    //检查输入的账号密码是否存在，若存在则返回true登录成功，若失败则返回false
    boolean inspect(String acc,String password){
        boolean ins;
        if(user.containsKey(acc)==true&& user.containsValue(password)==true)
            ins=true;
        else
            ins=false;
        return ins;
    }
    //遗忘/修改密码相关代码
   boolean forget(String account){
        if(user.containsKey(account))
        {
            System.out.println("已通过邮箱发送验证码");
            System.out.println("验证码验证通过");
            System.out.println("输入新密码");
            return true;
        }
        else
            return false;
    }
    //修改账号密码
    void reset(String account,String password){
        //获取账号和新密码
        user.remove(account);//删除原先账号
        user.put(account,password);//添加账号和新密码
    }
    //返回值
    String giveValue(String key){
        return user.get(key);
    }
    //判断账号是否存在
    boolean judgeexis(String key){
        return user.containsKey(key);
    }
  //管理员的相关操作代码，此代码可允许管理员修改自己密码
    void addAdm(){
        if(ADMcount==0) {
            user.put("admin", "ynuadmin");
            ADMcount++;
        }
    }
    //删除账号
    void delete(String account){
        user.remove(account);
        System.out.println("删除成功！");
    }
    //遍历展示用户信息
    void showuser(){
        Iterator<HashMap.Entry<String,String>> iter=user.entrySet().iterator();
        if(iter.hasNext()==false)
        {
            System.out.println("无任何用户！");
        }
        else{
        while (iter.hasNext()){
            HashMap.Entry<String,String> entry = iter.next();
            System.out.println("****************************");
            System.out.println("用户账号："+entry.getKey());
            System.out.println("用户密码："+entry.getValue());
            System.out.println("****************************");

        }
        }
    }




}
