package com.example.uilegacy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uilegacy2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<User> categories;
    private RecyclerView recyclerView;
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new home());

        categories = new ArrayList<>();
        recyclerView = findViewById(R.id.view_catergory);




        binding.bottomNavigationView.setOnItemSelectedListener(item -> {



            switch (item.getItemId()) {
                case R.id.home_pg:
                    replaceFragment(new home());
                    break;


                case R.id.more_pg:
                    replaceFragment(new catergory());

                    break;

                case R.id.faith:
                    replaceFragment(new faith());

                    break;

            }
            return true;
        });

        setCategoryInfo();
        setAdapter();

    }

    private void setAdapter() {

        Adapter adapter = new Adapter(categories);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setItemAnimator(new DefaultItemAnimator());
        //recyclerView.setAdapter(adapter);

    }

    private void setCategoryInfo(){

        categories.add(new User("Faith"));
        categories.add(new User("Peace"));
        categories.add(new User("Love"));
        categories.add(new User("Power"));

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();

    }


}