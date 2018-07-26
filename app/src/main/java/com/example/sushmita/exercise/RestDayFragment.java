package com.example.sushmita.exercise;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Sushmita Shrestha - 16366
 */
public class RestDayFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler,container,false);
        addRecyclerview(view);
        return view;
    }

    //adding recycler
    private void addRecyclerview(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        String s1[],s2[];
        int i1[]= {R.drawable.rest_one};
        int i2[] ={R.drawable.rest_two};
        s1 = getResources().getStringArray(R.array.rest_name);
        s2 = getResources().getStringArray(R.array.rest_desc);

        Readapter adapter = new Readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);

    }
}
