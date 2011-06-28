package test.BlueToothTest;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;

public class Menu extends Activity implements OnClickListener
{
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       
       setContentView(R.layout.main);        
       
       // setup the click listener for the buttons in the main view
       
       // trigger button
       View triggerButton = findViewById(R.id.trigger_button);
       triggerButton.setOnClickListener(this);
       
       // settings button
       View settingsButton = findViewById(R.id.configuration_button);
       settingsButton.setOnClickListener(this);

       // about button
       View aboutButton = findViewById(R.id.about_button);
       aboutButton.setOnClickListener(this);
       
       // exit button
       View exitButton = findViewById(R.id.exit_button);
       exitButton.setOnClickListener(this);
   }
   
   public void onClick(View v) 
   {
      switch (v.getId())
      {
      case R.id.about_button:
         Intent about = new Intent(this,About.class);
         startActivity(about);
         break;
      case R.id.configuration_button:
         break;
      case R.id.trigger_button:
         break;
      case R.id.exit_button:
         finish();
         break;
      default:
         break;
      }
   }

}
