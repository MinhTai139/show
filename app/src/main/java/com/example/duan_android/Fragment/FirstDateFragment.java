package com.example.duan_android.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.duan_android.Adapter.AdapterDateShow;
import com.example.duan_android.Model.Movie;
import com.example.duan_android.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstDateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstDateFragment extends Fragment {
    private ListView lv;
    private AdapterDateShow adapter;
    private List<Movie> listMovie;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstDateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstDateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstDateFragment newInstance(String param1, String param2) {
        FirstDateFragment fragment = new FirstDateFragment();
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

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_first_date, container, false);
        lv = mview.findViewById(R.id.lvMovie);

        listMovie = new ArrayList<>();
        listMovie.add(new Movie(R.drawable.image_item1, "Cám", "10/10/2024", 111, Arrays.asList("19:30","22:00", "22:30")));
        listMovie.add(new Movie(R.drawable.image_item4, "ODDITY", "03/10/2024", 101, Arrays.asList("23:00", "23:30")));
        listMovie.add(new Movie(R.drawable.image_item8, "làm giàu với ma", "15/10/2024", 120, Arrays.asList("19:30","20:00", "20:30")));
        listMovie.add(new Movie(R.drawable.image_item10, "Quỷ ăn tạng 2", "20/10/2024", 130, Arrays.asList("19:30","21:00", "21:30")));

        adapter = new AdapterDateShow(getContext(),listMovie,R.layout.item_movie_cinema);
        lv.setAdapter(adapter);
        return mview;

    }
}