package com.steven.fragment;

import java.util.ArrayList;
import java.util.List;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment implements OnClickListener{
	
	private Activity activity;
	public TextView tvTab1;
	public TextView tvTab2;
	public TextView tvTab3;
	private ViewPager vpContent;
	private List<android.support.v4.app.Fragment> fragments = new ArrayList<android.support.v4.app.Fragment>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		activity = getActivity();
		tvTab1 = (TextView) activity.findViewById(R.id.tab1);
		tvTab2 = (TextView) activity.findViewById(R.id.tab2);
		tvTab3 = (TextView) activity.findViewById(R.id.tab3);
		
		tvTab1.setOnClickListener(this);
		tvTab2.setOnClickListener(this);
		tvTab3.setOnClickListener(this);
		
		fragments.add(new TabFragment1());
		fragments.add(new TabFragment2());
		fragments.add(new TabFragment3());
		vpContent = (ViewPager) activity.findViewById(R.id.vp);
		// 得到getSupportFragmentManager()的管理器
		android.app.FragmentManager fm = activity.getFragmentManager();
		// 得到适配器
		MyPageAdapter pageAdapter = new MyPageAdapter(fm, fragments);
		// 设置适配器
		// vpMain.setOnPageChangeListener(listener);
		vpContent.setAdapter(pageAdapter);
		vpContent.setCurrentItem(0);
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tab1:
			System.out.println("MyFragment.onClick()1111");
			break;
			
		case R.id.tab2:
			System.out.println("MyFragment.onClick()222222");
			break;
			
		case R.id.tab3:
			System.out.println("MyFragment.onClick()333333333");
			break;
		}
		
	}
	
	class MyPageAdapter extends FragmentPagerAdapter{
		private List<android.support.v4.app.Fragment> fragments;
		public MyPageAdapter(FragmentManager fm,List<android.support.v4.app.Fragment> fragments) {
			super(fm);
			this.fragments = fragments;
		}

		@Override
		public android.support.v4.app.Fragment getItem(int position) {
			return fragments.get(position);
		}

		@Override
		public int getCount() {
			return fragments.size();
		}
		
	}
}
