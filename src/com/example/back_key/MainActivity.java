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
	
	//�����ǰ���Back����ᴥ���������¼������ε���˳�����г���
	//���ִ��
//    @Override
//    public void onBackPressed() {
//    	//�ڴ���ӷ��ؼ��Ĵ����¼�
//		  Show.setText("��һ�ַ�������Back Key");
//        super.onBackPressed();//ע�͵�����,back�����˳�activity
//        Log.i("key", "onBackPressed");
//    }
    
    //�ȵ���
    //���ٵ���
//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//    	//����Back����ᴥ�����θ��¼�
//		  Show.setText(Show.Text+"�ڶ��ַ�������Back Key");
//    	//����Back�������ֻ�һֱ�������¼�
//        Log.i("key", "dispatchKeyEvent: keyCode -- " + event.getKeyCode());
//        return super.dispatchKeyEvent(event);
//    }
    //�ٴ���
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        Log.i("key", "onKeyDown: keyCode -- " + keyCode);
//
//        switch (keyCode) {
//        case KeyEvent.KEYCODE_BACK:
//        	//�ڴ���ӷ��ؼ������¼�
//			  Show.setText("�����ַ�������Back Key");
//            Log.i("key", "KeyEvent.KEYCODE_BACK");
//            break;
//        case KeyEvent.KEYCODE_MENU:
//            Log.i("key", "KeyEvent.KEYCODE_MENU");
//            break;
//           // �ղ���
//        case KeyEvent.KEYCODE_HOME:
//            Log.i("key", "KeyEvent.KEYCODE_HOME");
//            // �ղ���
//            break;
//        case KeyEvent.KEYCODE_APP_SWITCH:
//            Log.i("key", "KeyEvent.KEYCODE_APP_SWITCH");
//            // �ղ���
//            break;
//        default:
//            break;
//        }
//
//        return super.onKeyDown(keyCode, event);
//
//    }
	

		
    //�����Ǵ���Back������һ��
//	public boolean onKeyDown(int keyCode, KeyEvent event) {  
//	        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {  
//	        	//super.onBackPressed();   //ע�͵�����,back�����˳�activity
//	        	//����������
//	        	Show.setText("�����ַ�������Back Key");
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
