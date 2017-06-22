package com.luofragme.design.test;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import com.luofragme.R;
import com.luofragme.design.AbstractFactoryModel.AbstractFactoryModel;
import com.luofragme.design.BridgeMode.BridgeMode;
import com.luofragme.design.BuilderMode.BuilderMode;
import com.luofragme.design.ChainOfResponsibilityModel.ChainOfResponsibilityModel;
import com.luofragme.design.CloneMode.CloneMode;
import com.luofragme.design.CombinationMode.CombinationMode;
import com.luofragme.design.CommandMode.CommandMode;
import com.luofragme.design.DecorativeMode.DecorativeMode;
import com.luofragme.design.FactoryMethodModel.FactoryMethodModel;
import com.luofragme.design.FactoryMethodModel.IProduct;
import com.luofragme.design.FactoryMethodModel.Tree;
import com.luofragme.design.FlyweightMode.FlyweightMode;
import com.luofragme.design.IntermediaryModel.IntermediaryModel;
import com.luofragme.design.IteratorModel.IteratorModel;
import com.luofragme.design.MemoMode.MemoMode;
import com.luofragme.design.ObserverMode.ObserverMode;
import com.luofragme.design.ParserMode.ParserMode;
import com.luofragme.design.ProxyMode.ProxyMode;
import com.luofragme.design.SingleMode.SingleMode;
import com.luofragme.design.StateModel.StateModel;
import com.luofragme.design.StrategyMode.StrategyMode;
import com.luofragme.design.TemplateMethodModel.TemplateMethodModel;
import com.luofragme.design.VisitorMode.VisitorMode;
import com.luofragme.design.WindowMode.WindowMode;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	public void onClickSingleMode(View view) { // ����
		SingleMode.getInstance();
	}

	public void onClickFactoryMethodModel(View view) {// ��������
		IProduct iProduct = new FactoryMethodModel();
		iProduct.productMethod();
		iProduct = new Tree();
		iProduct.productMethod();
	}

	public void onClickAbstractFactoryModel(View view) {// ���󹤳�
		AbstractFactoryModel.test();
	}

	public void onClickTemplateMethodModel(View view) {// ģ�淽��ģʽ
		TemplateMethodModel.test();
	}

	public void onClickBuilderMode(View view) {// ������ģʽ
		BuilderMode.test();
	}

	public void onClickProxyMode(View view) {// ����ģʽ
		ProxyMode.test();
	}

	public void onClickCloneMode(View view) {// ԭ��ģʽ
		CloneMode.test();
	}

	public void onClickIntermediaryModel(View view) {// �н���ģʽ
		IntermediaryModel.test1();
		IntermediaryModel.test2();
	}

	public void onClickCommandMode(View view) {// ����ģʽ
		CommandMode.test();
	}

	public void onChainOfResponsibilityModel(View view) {// ������ģʽ
		ChainOfResponsibilityModel.test();
	}

	public void onClickDecorativeMode(View view) {// װ��ģʽ
		DecorativeMode.test();
	}

	public void onClickStrategyMode(View view) {// ����ģʽ
		StrategyMode.test();
	}

	public void onClickIteratorModel(View view) {// ģʽ
		IteratorModel.test();
	}

	public void onClickCombinationMode(View view) {// ���ģʽ
		CombinationMode.test();
	}

	public void onClickObserverMode(View view) {// �۲���ģʽ
		ObserverMode.test();
	}

	public void onClickWindowMode(View view) {// ����ģʽ
		WindowMode.test();
	}

	public void onClickMemoMode(View view) {// ����¼ģʽ
		MemoMode.test();
	}

	public void onClickVisitorMode(View view) {// ������ģʽ
		VisitorMode.test();
	}

	public void onClickStateModel(View view) {// ״̬ģʽ
		StateModel.test();
	}

	public void onClickParserMode(View view) {// ������ģʽ
		ParserMode.test();
	}

	public void onClickFlyweightMode(View view) {// ��Ԫģʽ
		FlyweightMode.test();
	}

	public void onClickBridgeMode(View view) {// ����ģʽ
		BridgeMode.test();
	}
}
