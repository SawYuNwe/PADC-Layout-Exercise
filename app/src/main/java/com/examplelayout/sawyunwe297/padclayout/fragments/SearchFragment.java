package com.examplelayout.sawyunwe297.padclayout.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.examplelayout.sawyunwe297.padclayout.R;

/**
 * Created by Saw Yu Nwe on 7/1/2016.
 */
public class SearchFragment extends Fragment {
    public SearchFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
