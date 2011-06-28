/*  Program : BlueToothTest
 *  About :   Android application proof of concept for triggering
 *            a camera remotely
 *  File :    BlueToothTest.java
 *  Purpose : Implements the entry point into the program
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
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class BlueToothTest extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.connect);        
        
        // about button
        View connectButton = findViewById(R.id.connect_button);
        connectButton.setOnClickListener(this);
        
        // exit button
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
    }
    
    public void onClick(View v) 
    {
       switch (v.getId())
       {
       case R.id.connect_button:
          connectToBlueTooth();
          break;
       case R.id.exit_button:
          finish();
          break;
       default:
          break;
       }
    }
    
    public boolean blueToothConnect()
    {
       return true;
    }
    
    public boolean blueToothStatusSend()
    {
       return true;
    }
    
    public void connectToBlueTooth()
    {
       /* if connection can happen with
          bluetooth, send verification
          status request command*/
       if (blueToothConnect() == true)
       {
         if(blueToothStatusSend() == true)
         {
            Intent menu = new Intent(this,Menu.class);
            startActivity(menu);
            finish();
         }
         else
         {
            Intent noCon = new Intent(this,NoConnect.class);
            startActivity(noCon);
         }
       }
       else
       {
          
       }
    }
    
}