package com.example.uilegacy2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link power#newInstance} factory method to
 * create an instance of this fragment.
 */
public class power extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView Verse;
    private Button Inspire;

    public power() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment power.
     */
    // TODO: Rename and change types and number of parameters
    public static power newInstance(String param1, String param2) {
        power fragment = new power();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_power, container, false);

        Verse = (TextView) view.findViewById(R.id.powerverse);

        Inspire = (Button) view.findViewById(R.id.power_btn);
        Verse = (TextView) view.findViewById(R.id.powerverse);
        Inspire.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();

                String[] quote = {"I think a champion is defined not only by their wins, but by how they can recover when they fall.",
                        "I think you should work on yourself until the day you die.", "Everyone's dream can come true if you just stick to it and work hard.",
                        "Luck has nothing to do with it. I have spent many, many countless hours on the court working for my one moment in time, not knowing when it would come.",
                        "When you lose you get up, you make it better and you try again.", "I just never give up. I fight to the end.",
                        "You can be whatever size you are and you can be beautiful both inside and out. We're always told what's beautiful and what's not and that's not right.",
                        "You have to believe in yourself when no one else does.", "You can become strong, powerful and beautiful.",
                        "Overpower. Overtake. Overcome.", "Whatever fear I have inside me, my desire to win is always stronger.",
                        "It doesn't matter what your background is or where you come from, if you have dreams and goals, that's all that matters.",
                        "I am who I am. I love who I am.", "Strong is beautiful.", "I'm really excited. I smile a lot and I win a lot.",
                        "You have to be fearless to have success.", "Everything comes at a cost. Just what are you willing to pay for it?",
                        "You have to work hard. Nothing comes for free.", "I'm just about winning.", "Different is good.",
                        "I decided I can't pay a person to rewind time, so I may as well get over it.",
                        "I've always been a fighter and I've always fought through things my whole life.",
                        "If I don't get it right, I don't stop until I do.", "Don't let anybody work harder than you do.",
                        "I love who I am and I encourage other people to love and embrace who they are.",
                        "Your legacy is what you did with your life.", "I am not a robot. I have a heart and I bleed.",
                        "Just believe in yourself. Even if you don't, pretend that you do and at some point you will.",
                        "Nothing comes to a sleeper but a dream.", "I was tired of losing. Life was passing me by.",
                        "I don't know if I've had my share of drama, but I've definitely had my share of hard times.",
                        "Am I the greatest? I don't know. I'm the greatest that I can be.", "You have to prove to yourself that you can go out there and be the best that you can be and not prove anything to anyone.",
                        "Victory is very, very sweet. It tastes better than any dessert you've ever had.", "If plan A isn't working, I have a Plan B, C and D."};
                int randomNumber = randomGenerator.nextInt(quote.length);

                String quotes = quote[randomNumber];
                Verse.setText(quotes);

            }
        });







        return view;
    }
}