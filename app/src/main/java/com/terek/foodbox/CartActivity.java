package com.terek.foodbox;

import android.os.Bundle;
import com.terek.foodbox.core.BaseActivity;

public class CartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        onlogout();
    }


}
