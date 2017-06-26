package com.luofragme;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.luofragme.design.ObserverMode.ObserverMode;
import com.luofragme.fackMode.Location;
import com.luofragme.fackMode.implement.Utils;
import com.luofragme.util.QueryUtils;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.GetListener;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {
    Person p2;
    Context makeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //提供以下两种方式进行初始化操作：
        //第一：默认初始化
        Bmob.initialize(this, "8d4877eee9a0cc2c7cfaf5c7ee96eae9");
        makeText=this;
         p2 = new Person();
        p2.setName("罗志敏");
        p2.setAddress("上海浦东");
       /* p2.save(this, new SaveListener() {
            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                Toast.makeText(makeText,"添加数据成功，返回objectId为："+p2.getObjectId(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                Toast.makeText(makeText,"创建数据失败：" + msg,Toast.LENGTH_SHORT).show();
            }
        });*/



        //查找Person表里面id为6b6c11c537的数据
       /* BmobQuery<Person> bmobQuery = new BmobQuery<Person>();
        bmobQuery.getObject(this, "66dd7ab84d", new GetListener<Person>() {
            @Override
            public void onSuccess(Person object) {
                // TODO Auto-generated method stub
                Toast.makeText(makeText,"查询成功: "+object.getName(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                Toast.makeText(makeText,"查询失败：" + msg,Toast.LENGTH_SHORT).show();
            }
        });*/

      /* Location  location  = Utils.getLocation("baidu");
        location.getPostion();
        location.getCityName(22,33);


        ObserverMode.test();*/
      QueryUtils.QueryPostAPi(this);
        QueryUtils.BmobListening(this);
//        QueryUtils.updatePictureUrl(this);
//        QueryUtils.BmobRegiterAPI(this);//注册
//        QueryUtils.BmobLoginApi(this);//登录
//        QueryUtils.updateDataPerson(this);
//        QueryUtils.QueryPersionAPi(this);
//        QueryUtils.insertDataPerson(this);

    }





}
