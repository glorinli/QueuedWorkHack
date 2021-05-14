package xyz.glorin.queuedworkhacklib;

import android.os.Build;
import android.util.Log;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

import xyz.glorin.queuedworkhacklib.hackers.AboveOreoHacker;
import xyz.glorin.queuedworkhacklib.hackers.PreNHacker;

/**
 * Implementation of https://mp.weixin.qq.com/s/kfF83UmsGM5w43rDCH544g
 */
public class QueuedWorkHack {
    private static final String TAG = "QueuedWorkHack";
    private static boolean mHacked = false;

    private QueuedWorkHack() {
    }

    @MainThread
    public static void hack() {
        if (mHacked) {
            return;
        }

        try {
            Hacker hacker = getHacker();
            if (hacker != null) {
                hacker.hack();
                Log.i(TAG, "Hack success!!!");
            } else {
                Log.w(TAG, "Unsupported system");
            }
        } catch (Exception e) {
            Log.e(TAG, "Fail to hack", e);
        }

        mHacked = true;
    }

    @Nullable
    private static Hacker getHacker() {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.N_MR1)
            return new PreNHacker();

        return new AboveOreoHacker();
    }
}
