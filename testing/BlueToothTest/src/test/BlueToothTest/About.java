package test.BlueToothTest;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;


public class About extends Activity implements OnClickListener{
   
   @Override protected void onCreate(Bundle savedInstanceState)
   {      
      super.onCreate(savedInstanceState);
      setContentView(R.layout.about);
      // setup the click listener for the buttons in the main view
      
      // trigger button
      View webButton = findViewById(R.id.website_button);
      webButton.setOnClickListener(this);
      
   }
   
   public void onClick(View v) 
   {
      switch (v.getId())
      {
      case R.id.website_button:
         Intent link = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://geoffkerr.com"));
         startActivity(link);
         break;
      default:
         break;
      }
   }
}
