package com.xiangxue.mvx.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.xiangxue.mvx.R;
import com.xiangxue.mvx.databinding.JingziqiBinding;
import com.xiangxue.mvx.viewmodel.JingziqiViewModel;

public class JingziqiActivity extends AppCompatActivity {

    JingziqiViewModel viewModel = new JingziqiViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JingziqiBinding binding = DataBindingUtil.setContentView(this, R.layout.jingziqi);
        binding.setViewModel(viewModel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_jingziqi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_reset:
                viewModel.onResetSelected();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
