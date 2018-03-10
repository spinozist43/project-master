package com.example.toshimishra.photolearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class TrainerSessionsActivity extends AppCompatActivity  implements SampleRecyclerAdapter.OnItemClickListener {
    // 模拟listview中加载的数据Simulate the data loaded in the listview.
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_sessions);


        mRecyclerView = (RecyclerView) findViewById(R.id.recy);
        //设置布局管理器Set the layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        SampleRecyclerAdapter adapter = new SampleRecyclerAdapter(this);
        //设置adapter    Setadapter
        mRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);



        Button button = (Button)findViewById(R.id.bt_Add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TrainerSessionsActivity.this, TrainerAddSessionActivity.class));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.action_logout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, MainActivity.class));
            finish();
            return true;
        }
        else if(i == R.id.action_switch){
            startActivity(new Intent(this, ParticipantEnterLearningsessionActivity.class));
            return  true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onItemClick(View view, int position, String name) {
        Toast.makeText(getApplicationContext(),"click "+position,Toast.LENGTH_SHORT).show();
    }


}


