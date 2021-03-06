package com.apps.yecotec.skyadventure.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.yecotec.skyadventure.R;

import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class SettingsTabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_settings_tab, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
