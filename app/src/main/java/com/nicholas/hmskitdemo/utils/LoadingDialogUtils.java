package com.nicholas.hmskitdemo.utils;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

import com.nicholas.hmskitdemo.R;

public class LoadingDialogUtils {
    private Dialog loadingDialog;
    private TextView customTextView;

    public LoadingDialogUtils(Context context) {
        loadingDialog = new Dialog(context);
        loadingDialog.setContentView(R.layout.custom_loading_dialog);
        loadingDialog.setCancelable(false);

        customTextView = loadingDialog.findViewById(R.id.customText);
    }

    public void showLoadingDialog(String customText) {
        if (!loadingDialog.isShowing()) {
            customTextView.setText(customText);
            loadingDialog.show();
        }
    }

    public void dismissLoadingDialog() {
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }
}
