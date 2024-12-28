package com.thuve.bigburger;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recycleView;
    private RecyclerView.Adapter recycleadp;
    private RecyclerView.LayoutManager recyclelayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemforrecycleview);

        ArrayList<itemrecycle> data =new ArrayList<>();

        data.add(new itemrecycle(R.drawable.beefburger));
        data.add(new itemrecycle(R.drawable.blackburger));
        data.add(new itemrecycle(R.drawable.cheseburger));
        data.add(new itemrecycle(R.drawable.chickenshawarma));
        data.add(new itemrecycle(R.drawable.falconbbqburger));
        data.add(new itemrecycle(R.drawable.frenchfries));
        data.add(new itemrecycle(R.drawable.normalburger));
        data.add(new itemrecycle(R.drawable.milkshakes));
        data.add(new itemrecycle(R.drawable.hotdogs));

        recycleView = findViewById(R.id.recyclecard);

        recyclelayout = new LinearLayoutManager(this);
        recycleadp=new itemsAdapter(data);

        recycleView.setLayoutManager(recyclelayout);
        recycleView.setAdapter(recycleadp);
    }
}