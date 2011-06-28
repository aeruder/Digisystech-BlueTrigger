/*  Program : BlueToothTest
 *  About :   Android application proof of concept for triggering
 *            a camera remotely
 *  File :    Menu.java
 *  Purpose : Implements the main menu of options
 *   
 *  Copyright (C) 2011  Geoff Kerr, Digital Systems Technologies
 *  
 *  http://digisystech.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
         Intent running = new Intent(this,Running.class);
         startActivity(running);
         break;
      case R.id.exit_button:
         finish();
         break;
      default:
         break;
      }
   }

}
