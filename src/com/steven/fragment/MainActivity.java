package com.steven.fragment;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*// 步骤一：添加一个FragmentTransaction的实例
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();

		// 步骤二：用add()方法加上Fragment的对象rightFragment
		MyFragment fragment = new MyFragment();
		transaction.add(R.id.fg, fragment);

		// 步骤三：调用commit()方法使得FragmentTransaction实例的改变生效
		transaction.commit();*/

	}
}
