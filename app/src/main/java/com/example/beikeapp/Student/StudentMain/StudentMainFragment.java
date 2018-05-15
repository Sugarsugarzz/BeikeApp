package com.example.beikeapp.Student.StudentMain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.beikeapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentMainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentMainFragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btnHomework;
    private Button btnSearchExercise;
    private Button btnDoExercise;


    public StudentMainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TeacherMainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StudentMainFragment newInstance(String param1, String param2) {
        StudentMainFragment fragment = new StudentMainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    /**
     * 增加三个按钮
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, null);
        btnHomework = (Button) view.findViewById(R.id.btn_do_homework);
        btnSearchExercise = (Button) view.findViewById(R.id.btn_search_exercise);
        btnDoExercise = (Button) view.findViewById(R.id.btn_do_exercise);
        btnHomework.setOnClickListener(this);
        btnSearchExercise.setOnClickListener(this);
        btnDoExercise.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_do_homework:
                Toast.makeText(getActivity(), "Do homework Clicked ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_search_exercise:
                Toast.makeText(getActivity(), "Search exercie Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_do_exercise:
                Toast.makeText(getActivity(), "Do exercise Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}