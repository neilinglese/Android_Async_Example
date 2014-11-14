package com.example.funwithasync;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private String[] MyPicturesArray = new String[]{
			"http://iam.colum.edu/students/neil.inglese2/Images/weather.jpg",
			"http://iam.colum.edu/students/neil.inglese2/Images/circle.jpg",
			"http://iam.colum.edu/students/neil.inglese2/Images/cubs1.jpg",
			"http://iam.colum.edu/students/neil.inglese2/Images/cubs2.jpg",
			"http://iam.colum.edu/students/neil.inglese2/Images/cubs3.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		ListView listView = (ListView)this.findViewById(R.id.listView1);
		ImageAdapter imageAdapter = new ImageAdapter(this, R.layout.imageitem, MyPicturesArray);
		listView.setAdapter(imageAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
