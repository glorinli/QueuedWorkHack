package xyz.glorin.queuedworkhacklib.proxies;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueProxy<E> extends ConcurrentLinkedQueue<E> {
    private static final String TAG = "QueuedWorkHack-CLQProxy";
    private final ConcurrentLinkedQueue<E> mQueue;

    public ConcurrentLinkedQueueProxy(@NonNull ConcurrentLinkedQueue<E> queue) {
        mQueue = queue;
    }

    @Override
    public boolean add(E e) {
        return mQueue.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return mQueue.remove(o);
    }

    @Override
    public E poll() {
        Log.d(TAG, "poll");
        return null;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
