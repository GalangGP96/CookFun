package com.example.asus.cookfun.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.cookfun.Adapter.ResepAdapter;
import com.example.asus.cookfun.Model.Resep;
import com.example.asus.cookfun.R;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    private RecyclerView rv;
    private ResepAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Resep> dataset;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        dataset = new ArrayList<>();
        dataset.add(new Resep("https://pbs.twimg.com/profile_images/824716853989744640/8Fcd0bji_400x400.jpg","Rizky","https://selerasa.com/wp-content/uploads/2015/07/images_mancanegara_Resep_Kebab_00.jpg","Nasi Goreng","Masakan saya","2 hours ago"));
        dataset.add(new Resep("https://pbs.twimg.com/profile_images/824716853989744640/8Fcd0bji_400x400.jpg","Rizky","https://selerasa.com/wp-content/uploads/2015/07/images_mancanegara_Resep_Kebab_00.jpg","Nasi Goreng","Masakan saya","2 hours ago"));
        rv = (RecyclerView) view.findViewById(R.id.recyclerHome);
        rv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(mLayoutManager);
        mAdapter = new ResepAdapter(dataset,getActivity());
        rv.setAdapter(mAdapter);

        return view;
    }
}
