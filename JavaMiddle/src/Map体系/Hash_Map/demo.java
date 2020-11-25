package Map体系.Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        HashMap<MyClass,String> map= new HashMap<>();
        //添加
        MyClass s1 = new MyClass("loky",18);
        MyClass s2 = new MyClass("Tom",20);
        MyClass s3 = new MyClass("Jerry",29);
        map.put(s1,"ok");
        map.put(s2,"no");
        map.put(s3,"yes or no");
        map.put(new MyClass("Tom",20),"no");
        System.out.println("元素个数:"+map.size());
        System.out.println(map.toString());
        System.out.println(map.get(s3));
  
        //删除
        map.remove(s3);
        System.out.println("元素个数:"+map.size());

        //遍历
//        1.使用Keyset
        for (MyClass key: map.keySet()) {
            System.out.println(key.toString());
        }
//        2.使用entrySet()
        System.out.println("=================");
        for (Map.Entry<MyClass,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }

        HashMap<String,String> newmap_= new HashMap<>();
        newmap_.put("Ary1"," LAry1");
        newmap_.put("Ary2"," LAry1");
        newmap_.put("Ary3"," LAry1");
        newmap_.put("Ary4"," LAry2");
        newmap_.put("Ary5"," LAry3");
        newmap_.put("Ary6"," LAry4");
        System.out.println("元素个数：" + newmap_.size());
        System.out.println(newmap_.get("Ary1"));

        //遍历
        System.out.println("================");
        for (Map.Entry<String,String> entry : newmap_.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("==============");
//        keyset遍历
        for (String str: newmap_.keySet()) {
            System.out.println(str.toString());
        }



    }
}
