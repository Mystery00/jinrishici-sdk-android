package com.jinrishici.sdk.android.view;

public final class JinrishiciTextViewConfig {
	public boolean isRefreshWhenClick = true;//点击时刷新
	public boolean isShowErrorOnTextView = true;//是否直接显示错误信息到TextView上
	public String loadingText = "loading...";//加载时显示的文本
	public String customErrorText = "Request Error";//加载失败时显示的文本

	public void copy(JinrishiciTextViewConfig config) {
		isRefreshWhenClick = config.isRefreshWhenClick;
		isShowErrorOnTextView = config.isShowErrorOnTextView;
		loadingText = config.loadingText;
		customErrorText = config.customErrorText;
	}
}
