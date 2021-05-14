package xyz.glorin.queuedworkhacklib.proxies;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.LinkedList;

public class LinkedListProxy<E> extends LinkedList<E> {
    private static final String TAG = "QueuedWorkHack-LLProxy";

    private final LinkedList<E> mList;

    public LinkedListProxy(@NonNull LinkedList<E> list) {
        mList = list;
    }

    @Override
    public boolean add(E e) {
        return mList.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return mList.remove(o);
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
