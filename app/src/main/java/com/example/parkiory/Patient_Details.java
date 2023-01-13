package com.example.parkiory;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Patient_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        // get graph from layout
        GraphView graph = (GraphView) findViewById(R.id.graph);

        // form series (curve for graph)
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>();
        double y;
        for(int x=0; x<90; x++){
            y = Math.sin(2*x*0.2)-2*Math.sin(x*0.2);
            series.appendData(new DataPoint(x,y) , true, 90);
        }

        graph.addSeries(series);

        // set color, title of curve, DataPoints radius, thickness
        series.setColor(Color.RED);
        series.setTitle("Parkinson Curve 1");
//        series.setDrawDataPoints(true);
//        series.setDataPointsRadius(16);
        series.setThickness(8);

        //set Title of graph
        graph.setTitle("Parkinson Graph");
        graph.setTitleTextSize(90);
        graph.setTitleColor(Color.BLUE);

        // legend
        graph.getLegendRenderer().setVisible(true);
        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);

        // axis titles
        GridLabelRenderer gridLabelRenderer = graph.getGridLabelRenderer();
        gridLabelRenderer.setHorizontalAxisTitle("X Axis Title");
        gridLabelRenderer.setHorizontalAxisTitleTextSize(50);
        gridLabelRenderer.setVerticalAxisTitle("Y Axis Title");
        gridLabelRenderer.setVerticalAxisTitleTextSize(50);
    }
}