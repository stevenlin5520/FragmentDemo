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

		/*// ����һ�����һ��FragmentTransaction��ʵ��
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();

		// ���������add()��������Fragment�Ķ���rightFragment
		MyFragment fragment = new MyFragment();
		transaction.add(R.id.fg, fragment);

		// ������������commit()����ʹ��FragmentTransactionʵ���ĸı���Ч
		transaction.commit();*/

	}
}
