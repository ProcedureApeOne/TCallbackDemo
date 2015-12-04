package com.example.bajian.tcallbackdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Generics 泛型
 * 本demo主要是对java三种常用泛型的复习 及callback中使用泛型的例子
 *
 * Java泛型<? extends T>和<? super T> http://zhidao.baidu.com/question/646868566975781205.html?qbl=relate_question_0&word=Comparable%B5%C4%D7%D3%C0%E0%D3%D0%C4%C4%D0%A9%3F
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        testTBean();
//        teGen();
//        testTMethod();//泛型方法的声明，必须在方法的修饰符（public,static,final,abstract等）之后，返回值声明之前。和泛型类一样，可以声明多个泛型，用逗号隔开。
//        testTIClass();//自我感觉意义不大。除非写成泛型抽象类
    }

    private void testTIClass() {
        TIClass.show(new TIClass.ResultCallback<String>() {
            @Override
            public void onSucc(String response) {
                System.out.println("onSucc"+response);
            }

            @Override
            public void onFail(Exception e) {
                System.out.println("onFail");
            }
        });
    }

    private void testTMethod() {
        TMethod.print(123);
//        TMethod.printS(123);限定String
        TMethod.printS("123");
        TMethod.print(new TBean<String>("bajian"));
        TMethod.printMulti(123,new String[]{"123","456"});
    }

    private void teGen() {
        Gen<String, Integer> gen1 = new Gen<String, Integer>("test", 5);
        System.out.println("gen1.getT()"+gen1.getT());
        System.out.println("gen1.getK()"+gen1.getK());

//        Gen<String, Integer> gen2 = new Gen<String, Object>("test", new Object());
//        可以看到，Object并不是Comparable的子类，出现了错误，即是说，我们为K加入了一个限定“K必须为Comparable的子类”
    }

    private void testTBean() {
        TBean<String> mTB = new TBean<String>("123");
        System.out.println("mTB.getT();"+mTB.getT());

        TBean<Integer> mTB2 = new TBean<Integer>(1);
        System.out.println("mTB2.getT();"+mTB2.getT());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
