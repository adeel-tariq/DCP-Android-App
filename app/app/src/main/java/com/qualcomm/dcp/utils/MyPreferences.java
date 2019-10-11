/*
 * Copyright (c) 2018-2019 Qualcomm Technologies, Inc.
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *  Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *  Neither the name of Qualcomm Technologies, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *  The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment is required by displaying the trademark/log as per the details provided here: [https://www.qualcomm.com/documents/dirbs-logo-and-brand-guidelines]
 *  Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
 *  This notice may not be removed or altered from any source distribution.
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.qualcomm.dcp.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Aarif on 4/19/2016.
 */
public class MyPreferences {
    private final SharedPreferences preferences;
    private final SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    public MyPreferences(Context context) {
        Log.e("package", "package name = " + context.getPackageName());
        preferences = context.getSharedPreferences(context.getPackageName(), 0);
        editor = preferences.edit();
    }

    /**
     * put int preference
     *
     * @param prefName preference name
     * @param val preference value
     */
    public void setInt(String prefName, int val) {
        editor.putInt(prefName, val).commit();
    }

    /**
     * put String preference
     *
     * @param prefName preference name
     * @param val preference value
     */
    public void setString(String prefName, String val) {

        Log.e("setstring", "Str name = " + prefName + " Str val= " + val);
        editor.putString(prefName, val).commit();
    }

    /**
     * put boolean preference
     *
     * @param prefName preference name
     * @param val preference value
     */
    public void setBoolean(String prefName, boolean val) {
        editor.putBoolean(prefName, val).commit();
    }

    /**
     * get int preference
     *
     * @param prefName preference name
     * @param valDef preference value
     */
    public int getInt(String prefName, int valDef) {
        return preferences.getInt(prefName, valDef);
    }

    /**
     * put String preference
     *
     * @param prefName preference name
     * @param valDef preference value
     */
    public String getString(String prefName, String valDef) {
        return preferences.getString(prefName, valDef);
    }

    /**
     * put boolean preference
     *
     * @param prefName preference name
     * @param valDef preference value
     */
    public boolean getBoolean(String prefName, boolean valDef) {
        return preferences.getBoolean(prefName, valDef);
    }

}
