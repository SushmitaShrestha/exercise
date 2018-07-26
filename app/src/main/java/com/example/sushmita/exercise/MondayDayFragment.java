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
public class MondayDayFragment extends Fragment {
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
       int i1[]= {R.drawable.dumbell_overhead_squat_1,R.drawable.dumbell_swing_a,R.drawable.dumbell_side_lunge_a,R.drawable.leg_raise_a,R.drawable.press_up_renegade_a};
       int i2[]={R.drawable.dumbell_overhead_squat_2,R.drawable.dumbell_swing_b,R.drawable.dumbell_side_lunge_b,R.drawable.leg_raise_b,R.drawable.press_up_renegade_b};

        s1 = getResources().getStringArray(R.array.mon_name);
        s2 = getResources().getStringArray(R.array.mon_desc);

        // recycler view on click listener
        Readapter adapter = new Readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position == 0){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/dumbbell-overhead-squat-");
                    getActivity().startActivity(my);
                }
                if(position == 1){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.menshealth.com/fitness/a20694706/dumbbell-swing/");
                    getActivity().startActivity(my);
                }
                if(position == 2){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/dumbbell-side-lunge");
                    getActivity().startActivity(my);
                }
                if(position == 3){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/flat-bench-lying-leg-raise");
                    getActivity().startActivity(my);
                }
                if(position == 4){
                    Intent my = new Intent(getActivity(),WorkoutDescription.class);
                    my.putExtra("url","http://www.coachmag.co.uk/exercises/abs-workout/3663/2-press-up-renegade-row");
                    getActivity().startActivity(my);
                }

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}
