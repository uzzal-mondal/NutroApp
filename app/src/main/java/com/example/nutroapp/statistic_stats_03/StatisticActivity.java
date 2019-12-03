package com.example.nutroapp.statistic_stats_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.nutroapp.R;
import com.example.nutroapp.statsoverview_stats_04.StatsOverviewActivity;
import com.github.mikephil.charting.charts.BubbleChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleDataSet;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.vaibhavlakhera.circularprogressview.CircularProgressView;

import java.util.ArrayList;
import java.util.List;


public class StatisticActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
   private List<StatisticModel> statisticModelList;
    private BubbleChart bubbleChart;
    private CircularProgressView progressView;
    private AppCompatImageView backimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusColor(this, R.color.color_statistic);
        progressView = findViewById(R.id.staticsprogress);
        backimage = findViewById(R.id.menubackimg_id);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        progressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatisticActivity.this,
                        StatsOverviewActivity.class));
            }
        });



        bubbleChart = findViewById(R.id.chart);
        BubbleDataSet bubbleDataSet = new BubbleDataSet(getList(), "Inducesmile");
        bubbleDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        BubbleData scatterData = new BubbleData(bubbleDataSet);
        XAxis xAxis = bubbleChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        final String[] months = new String[]{"Jun", "", " ", "Jul"," "," ",  "Aug"};
        IndexAxisValueFormatter formatter = new IndexAxisValueFormatter(months);

        xAxis.setGranularity(1f);
        /*xAxis.setGranularity(2f);
        xAxis.setGranularity(3f);
        xAxis.setGranularity(6f);
        */
        xAxis.setValueFormatter(formatter);
        bubbleChart.setData(scatterData);
        bubbleChart.animateXY(5000, 5000);
        bubbleChart.invalidate();


        //find view recycler
        recyclerView = findViewById(R.id.recyclerstatistic);


        //set an recycler adapter.
        RecyclerStatisticAdapter statisticAdapter = new
                RecyclerStatisticAdapter(this,statisticModelList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(statisticAdapter);


        List<StatisticModel> list = new ArrayList<>();
        list.add(new StatisticModel(90,"Jun"));
        list.add(new StatisticModel(70));
        list.add(new StatisticModel(80));
        list.add(new StatisticModel(60,"July"));
        list.add(new StatisticModel(100));
        list.add(new StatisticModel(0));
        list.add(new StatisticModel(60,"Aug"));

        RecyclerStatisticAdapter adapter = new
                RecyclerStatisticAdapter(this,list);
        recyclerView.setAdapter(adapter);


    }

    private ArrayList getList(){
        ArrayList<BubbleEntry> entries = new ArrayList<>();
        entries.add(new BubbleEntry(0f, 1f, 0.21f));
        entries.add(new BubbleEntry(1f, 2f, 0.12f));
        entries.add(new BubbleEntry(2f, 3f, 0.20f));
        entries.add(new BubbleEntry(3f, 4f, 0.52f));
        entries.add(new BubbleEntry(4f, 5f, 0.29f));
        entries.add(new BubbleEntry(5f, 6f, 0.62f));
        entries.add(new BubbleEntry(6f, 7f, 0.62f));
        return entries;
    }

    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorResourceId) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, colorResourceId));
    }


}
