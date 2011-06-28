/*  Program : BlueToothTest
 *  About :   Android application proof of concept for triggering
 *            a camera remotely
 *  File :    About.java
 *  Purpose : Implements the functionality of the about screen
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
         Intent link = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://digisystech.com"));
         startActivity(link);
         break;
      default:
         break;
      }
   }
}
