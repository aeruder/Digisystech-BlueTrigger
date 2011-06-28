/*  Program : BlueToothTest
 *  About :   Android application proof of concept for triggering
 *            a camera remotely
 *  File :    Running.java
 *  Purpose : Implements the functionality of the running or triggered screen
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
