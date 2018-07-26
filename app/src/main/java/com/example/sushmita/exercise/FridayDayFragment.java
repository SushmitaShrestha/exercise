package com.example.sushmita.exercise;

import android.content.Intent;
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
public class FridayDayFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler,container,false);
        addRecyclerview(view);
        return view;
    }

    //adding recycler view
    private void addRecyclerview(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        String s1[],s2[];
       int i1[]= {R.drawable.arm_a,R.drawable.tri_a,R.drawable.farm_a,R.drawable.pull_a,R.drawable.rock_a};
       int i2[] ={R.drawable.arm_b,R.drawable.tri_b,R.drawable.farm_b,R.drawable.pull_b,R.drawable.rock_b};
        s1 = getResources().getStringArray(R.array.fri_name);
        s2 = getResources().getStringArray(R.array.fri_desc);

        // recycler view and on-click listener
        Readapter adapter = new Readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position == 0){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/dumbbell-bicep-curl");
                    getActivity().startActivity(my);
                }
                if(position == 1){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/tricep-dumbbell-kickback");
                    getActivity().startActivity(my);
                }
                if(position == 2){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/seated-one-arm-dumbbell-palms-up-wrist-curl");
                    getActivity().startActivity(my);
                }
                if(position == 3){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/pullups");
                    getActivity().startActivity(my);
                }
                if(position == 4){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/rocky-pull-upspulldowns");
                    getActivity().startActivity(my);
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}
