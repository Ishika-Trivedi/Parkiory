package com.example.parkiory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;

import java.util.ArrayList;

public class feedbackActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        // model class created
        // MyHolder class created
        // Adapter class created

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMyList());
        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setCaptionEX("HamString Stretch");
        m.setDescEX("Sit tall in a chair and place one leg straight out on another chair. Keep your toes pointed upward, your knee flat, and your back straight. Gently reach for your toes with both arms.");
        m.setImg(R.drawable.parkinsonEX1);
        models.add(m);

        m = new Model();
        m.setCaptionEX("Aerobics");
        m.setDescEX("Participating in aerobic exercise at least three days a week for 30-40 minutes may slow Parkinson's decline.");
        m.setImg(R.drawable.parkinsonEX2);
        models.add(m);

        m = new Model();
        m.setCaptionEX("Wrist Curls");
        m.setDescEX("Place your left hand and wrist over the edge of a table with your palm facing up. Hold the weight in your hand. Slowly move your wrist up as far as you can. Hold this position for a few seconds.");
        m.setImg(R.drawable.parkinsonEX3);
        models.add(m);

        m = new Model();
        m.setCaptionEX("Hand-Eye Coordination");
        m.setDescEX("When impairments in eye-hand coordination appear with aging or in Parkinson's disease (PD), these actions become progressively com- promised during high-velocity and accurate movements. ");
        m.setImg(R.drawable.parkinsonEX4);
        models.add(m);

        return models;
    }
}