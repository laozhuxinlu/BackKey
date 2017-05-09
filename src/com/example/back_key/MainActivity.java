package com.example.back_key;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
		private TextView Show;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Show = (TextView)findViewById(R.id.textView1);
	}
	
	//以下是按下Back键后会触发的三种事件，依次调用顺序已列出：
	//最后执行
//    @Override
//    public void onBackPressed() {
//    	//在此添加返回键的处理事件
//		  Show.setText("第一种方法按下Back Key");
//        super.onBackPressed();//注释掉这行,back键不退出activity
//        Log.i("key", "onBackPressed");
//    }
    
    //先调用
    //再再调用
//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//    	//按下Back键后会触发两次该事件
//		  Show.setText(Show.Text+"第二种方法按下Back Key");
//    	//按下Back键不放手会一直触发该事件
//        Log.i("key", "dispatchKeyEvent: keyCode -- " + event.getKeyCode());
//        return super.dispatchKeyEvent(event);
//    }
    //再触发
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        Log.i("key", "onKeyDown: keyCode -- " + keyCode);
//
//        switch (keyCode) {
//        case KeyEvent.KEYCODE_BACK:
//        	//在此添加返回键处理事件
//			  Show.setText("第三种方法按下Back Key");
//            Log.i("key", "KeyEvent.KEYCODE_BACK");
//            break;
//        case KeyEvent.KEYCODE_MENU:
//            Log.i("key", "KeyEvent.KEYCODE_MENU");
//            break;
//           // 收不到
//        case KeyEvent.KEYCODE_HOME:
//            Log.i("key", "KeyEvent.KEYCODE_HOME");
//            // 收不到
//            break;
//        case KeyEvent.KEYCODE_APP_SWITCH:
//            Log.i("key", "KeyEvent.KEYCODE_APP_SWITCH");
//            // 收不到
//            break;
//        default:
//            break;
//        }
//
//        return super.onKeyDown(keyCode, event);
//
//    }
	

		
    //以下是触发Back按键另一种
//	public boolean onKeyDown(int keyCode, KeyEvent event) {  
//	        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {  
//	        	//super.onBackPressed();   //注释掉这行,back键不退出activity
//	        	//具体操作添加
//	        	Show.setText("第四种方法按下Back Key");
//	            return true;  
//	        } else  
//	            return super.onKeyDown(keyCode, event);  
//	    }  
	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
