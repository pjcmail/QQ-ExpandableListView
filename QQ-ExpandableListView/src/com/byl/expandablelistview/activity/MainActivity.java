package com.byl.expandablelistview.activity;

import java.util.ArrayList;
import java.util.List;

import com.byl.expandablelistview.R;
import com.byl.expandablelistview.adapter.ConstactAdapter;
import com.byl.expandablelistview.bean.Child;
import com.byl.expandablelistview.bean.Group;
import com.byl.expandablelistview.view.IphoneTreeView;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private IphoneTreeView mIphoneTreeView;
	private ConstactAdapter mExpAdapter;
	private List<Group> listGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();
	}
	
	

	private void initData() {
		listGroup=new ArrayList<Group>();
		
		//第一组
		Group group=new Group();
		group.setGroupName("我的好友");
		List<Child> listChild=new ArrayList<Child>();
		for(int i=0;i<10;i++){
			Child child=new Child();
			child.setUsername("我的好友"+i);
			child.setHeadphoto("http://d.hiphotos.baidu.com/zhidao/pic/item/562c11dfa9ec8a13e028c4c0f603918fa0ecc0e4.jpg");
			child.setMood("今天心情不错哈~");
			if(i<3)
			    child.setOnline_status("1");
			else
				child.setOnline_status("0");
			listChild.add(child);
		}
		group.setChildList(listChild);
		listGroup.add(group);
		
		//第二组
		group=new Group();
		group.setGroupName("我的同学");
		listChild=new ArrayList<Child>();
		for(int i=0;i<20;i++){
			Child child=new Child();
			child.setUsername("我的同学"+i);
			child.setHeadphoto("http://wenwen.soso.com/p/20090901/20090901120135-1666292770.jpg");
			child.setMood("今天心情不错哈~");
			if(i<3)
			    child.setOnline_status("1");
			else
				child.setOnline_status("0");
			listChild.add(child);
		}
		group.setChildList(listChild);
		listGroup.add(group);
		
		//第三组
		group=new Group();
		group.setGroupName("我的朋友");
		listChild=new ArrayList<Child>();
		for(int i=0;i<30;i++){
			Child child=new Child();
			child.setUsername("我的朋友"+i);
			child.setHeadphoto("http://img.xiaba.cvimage.cn/4d908de84538f31e2dbe0a00.jpg");
			child.setMood("今天心情不错哈~");
			if(i<4)
			    child.setOnline_status("1");
			else
				child.setOnline_status("0");
			listChild.add(child);
		}
		group.setChildList(listChild);
		listGroup.add(group);
		
		mExpAdapter = new ConstactAdapter(this, listGroup, mIphoneTreeView);
		mIphoneTreeView.setAdapter(mExpAdapter);
		
	}



	private void initView() {
		mIphoneTreeView = (IphoneTreeView)findViewById(R.id.iphone_tree_view);
		mIphoneTreeView.setHeaderView(LayoutInflater.from(this).inflate(R.layout.fragment_constact_head_view, mIphoneTreeView, false));
		mIphoneTreeView.setGroupIndicator(null);
		mIphoneTreeView.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView arg0, View arg1, int arg2,int arg3, long arg4) {
				Toast.makeText(getApplicationContext(), "点击了"+arg3, Toast.LENGTH_SHORT).show();
				return true;
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
