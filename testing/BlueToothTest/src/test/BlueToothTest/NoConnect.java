/*  Program : BlueToothTest
 *  About :   Android application proof of concept for triggering
 *            a camera remotely
 *  File :    NoConnect.java
 *  Purpose : Implements the functionality of the message when no connection
 *            to Bluetooth is possible
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
import android.app.Activity;


public class NoConnect extends Activity
{
   @Override protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.noconnect);
   }
}
