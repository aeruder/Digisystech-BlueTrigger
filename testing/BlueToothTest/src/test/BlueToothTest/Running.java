package test.BlueToothTest;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;


public class Running extends Activity implements OnClickListener{
   
   @Override protected void onCreate(Bundle savedInstanceState)
   {      
      super.onCreate(savedInstanceState);
      setContentView(R.layout.running);
      // setup the click listener for the buttons in the main view
      
      // cancel button
      View cancelButton = findViewById(R.id.cancel_button);
      cancelButton.setOnClickListener(this);
      
   }
   
   public void onClick(View v) 
   {
      switch (v.getId())
      {
      case R.id.cancel_button:
         // TODO, put code here to send cancel to blue tooth
         finish();
         break;
      default:
         break;
      }
   }
}
