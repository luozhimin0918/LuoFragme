package com.luofragme.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.luofragme.Common;
import com.luofragme.DataPer;
import com.luofragme.MyUser;
import com.luofragme.Person;
import com.luofragme.Post;
import com.socks.library.KLog;

import org.json.JSONArray;
import org.w3c.dom.Comment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobRealTimeData;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.datatype.BmobRelation;
import cn.bmob.v3.listener.FindCallback;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import cn.bmob.v3.listener.UploadFileListener;
import cn.bmob.v3.listener.ValueEventListener;

/**
 * Created by Administrator on 2017/6/22.
 */

public class QueryUtils {

    public static void BmobListening(Context context){
        final BmobRealTimeData rtd = new BmobRealTimeData();

        rtd.start(context, new ValueEventListener() {
            @Override
            public void onDataChange(org.json.JSONObject  data) {
                // TODO Auto-generated method stub
                KLog.d("bmob", "  "+data.optString("action"));
                KLog.json("bmob",data.toString());
            }

            @Override
            public void onConnectCompleted() {
                // TODO Auto-generated method stub
                Log.d("bmob", "连接成功:"+rtd.isConnected());
                // 监听表更新
                rtd.subTableUpdate("Common");
               // 监听表删除
                rtd.subTableDelete("Common");
              // 监听行更新
                //        rtd.subRowUpdate(tableName, objectId);
                // 监听行删除
                //        rtd.subRowDelete(tableName, objectId);
            }


        });

    }

    public static void BmobRegiterAPI(Context context){
        BmobUser bu = new BmobUser();
        bu.setUsername("罗志敏");
        bu.setPassword("123456");
        bu.setEmail("2881263129@qq.com");
//注意：不能用save方法进行注册
        bu.signUp(context, new SaveListener() {
            @Override
            public void onSuccess() {
                KLog.d("BmobTest","注册成功");
                //通过BmobUser.getCurrentUser(context)方法获取登录成功后的本地用户信息
            }
            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                KLog.d("BmobTest","注册失败"+msg);
            }
        });
    }

    public static void BmobLoginApi(final Context context){
        BmobUser bu2 = new BmobUser();
        bu2.setUsername("luozhimin");
        bu2.setPassword("123456");
        bu2.login(context, new SaveListener() {
            @Override
            public void onSuccess() {
                KLog.d("BmobTest","登录成功");
                AddPostApi( context);
                //通过BmobUser user = BmobUser.getCurrentUser(context)获取登录成功后的本地用户信息
                //如果是自定义用户对象MyUser，可通过MyUser user = BmobUser.getCurrentUser(context,MyUser.class)获取自定义用户信息
            }
            @Override
            public void onFailure(int code, String msg) {
                KLog.d("BmobTest","登录失败"+msg);
            }
        });
    }
    public static MyUser user ;
    public static void AddPostApi(final Context context){
         user = BmobUser.getCurrentUser(context, MyUser.class);
// 创建帖子信息
        final Post post = new Post();
        post.setTitle("建筑");
        post.setContent("从建筑行业转行进入IT，感谢在学习路上遇到麦子学院。");
//添加一对一关联
        post.setAuthor(user);
        post.save(context, new SaveListener() {

            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"发帖成功。。。。。。。。。。。。。"+post.getObjectId());
                CommonToPostApi(context, post);
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"发帖失败》》》》》》》》》》》》》");
            }
        });
    }

    public static void CommonToPostApi(Context context,Post post){
        final Common comment = new Common();
        comment.setContent("不愧是尖椒工程师。牛啊");
        comment.setPost(post);
        MyUser user1=new MyUser();
        user1.setObjectId("c21ed066f7");
        comment.setUser(user1);
        comment.save(context, new SaveListener() {

            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"评论发表成功");

            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"评论失败");
            }
        });



        //将当前用户添加到Post表中的likes字段值中，表明当前用户喜欢该帖子
        BmobRelation relation = new BmobRelation();
//将当前用户添加到多对多关联中
        relation.add(user);
//多对多关联指向`post`的`likes`字段
        post.setLikesAuthor(relation);
        post.update(context, new UpdateListener() {

            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"喜欢这个帖子成功");
            }

            @Override
            public void onFailure(int arg0, String arg1) {
                // TODO Auto-generated method stub
                KLog.d("BmobTest",user.getUsername()+"喜欢这个帖子失败。。。。");
            }
        });
    }
    public static void  updatePictureUrl(final Context context){
        String picPath = "storage/sdcard0/Pictures/Screenshots/594b844f7e5e0.jpg";
        final BmobFile bmobFile = new BmobFile(new File(picPath));
        bmobFile.uploadblock(context, new UploadFileListener() {

            @Override
            public void onSuccess() {
                //bmobFile.getFileUrl(context)--返回的上传文件的完整地址
                KLog.d("BmobTest","上传文件成功:" + bmobFile.getFileUrl(context));
            }

            @Override
            public void onProgress(Integer value) {
                // 返回的上传进度（百分比）
            }

            @Override
            public void onFailure(int code, String msg) {
                KLog.d("BmobTest","上传文件失败：" + msg);
            }
        });
    }
    public static void  QueryPostAPi(Context context){
        BmobQuery bmobQuery =new BmobQuery("Post");
        bmobQuery.findObjects(context, new FindCallback() {
            @Override
            public void onSuccess(JSONArray jsonArray) {
                KLog.json(jsonArray.toString());
            }

            @Override
            public void onFailure(int i, String s) {

            }
        } /*new FindListener<Post>() {
            @Override
            public void onSuccess(List<Post> list) {
                for(Post jj:list){
                    KLog.json(JSON.toJSONString(jj));
                }
            }

            @Override
            public void onError(int i, String s) {

            }
        }*/);
    }
    public static void  QueryPersionAPi(Context context){
        BmobQuery bmobQuery =new BmobQuery("Person");
       /* bmobQuery.findObjects(context, new FindCallback() {
            @Override
            public void onSuccess(JSONArray jsonArray) {
                List<Person> allPersonList=new ArrayList<Person>();
                allPersonList = JSON.parseArray(jsonArray.toString(),Person.class);
                for(Person jj:allPersonList){
                    KLog.json(JSON.toJSONString(jj));
                }

            }

            @Override
            public void onFailure(int i, String s) {
                KLog.d("查询all失败"+s);
            }
        });*/
        bmobQuery.findObjects(context, new FindListener<Person>() {
            @Override
            public void onSuccess(List<Person> list) {
                for(Person jj:list){
                    KLog.json(JSON.toJSONString(jj));
                }
            }

            @Override
            public void onError(int i, String s) {

            }
        });
    }
    public static void insertDataPerson(Context mcontext){
        Person person=new Person();
        person.setAddress("美国");
        person.setName("烈酒时");
        DataPer dataPer=new DataPer("kkkkk",90);
        person.setDataPer(dataPer);
        person.save(mcontext, new SaveListener() {
            @Override
            public void onSuccess() {
                KLog.d("保存成功");
            }

            @Override
            public void onFailure(int i, String s) {
                KLog.d("保存失败"+s);
            }
        });
    }
    public static void updateDataPerson(Context mcontext){
        Person person=new Person();
        person.setAddress("美国+update");
        DataPer dataPer=new DataPer("seeee",99);
        person.setValue("dataPer",dataPer);
        person.increment("pAge",5);
        person.update(mcontext,"0bdecb023b", new UpdateListener() {
            @Override
            public void onSuccess() {
                KLog.d("修改成功");
            }

            @Override
            public void onFailure(int i, String s) {
                KLog.d("修改失败"+s);
            }
        });
    }
}
