package com.zhy.sample.StickyNavLayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SummaryFragment extends Fragment {

	public static SummaryFragment create(){
		SummaryFragment fragment=new SummaryFragment();
		
		return fragment;
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.summaryfragment, container,false);
	}
	
	private TextView tv1,tv2,tv3,tv4,tv5;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		tv1=(TextView) getView().findViewById(R.id.tv1);
		tv2=(TextView) getView().findViewById(R.id.tv2);
		tv3=(TextView) getView().findViewById(R.id.tv3);
		tv4=(TextView) getView().findViewById(R.id.tv4);
		tv5=(TextView) getView().findViewById(R.id.tv5);
		
		tv1.setText(String.format("%s节\n公开课", "0"));
		tv2.setText(String.format("%s节\n私辅课", "20"));
		tv3.setText(String.format("%s节\n哈勒课", "10"));
		tv4.setText(String.format("%s节\n了了课", "60"));
		tv5.setText(Html.fromHtml(String.format(getString(R.string.person_intro), "身份证，学历证","化学，数学，英语","\t随着移动化趋势的不断发展，往移动路上出现了诸多选择：本地化应用、移动友好网站、混合应用以及基于Web的应用。对此我们需要作出考虑，并归根于投资回报，从自身出发，选择适合")));
	}
}
