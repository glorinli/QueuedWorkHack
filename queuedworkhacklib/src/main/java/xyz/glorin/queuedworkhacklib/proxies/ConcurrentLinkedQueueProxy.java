package xyz.glorin.queuedworkhacklib.proxies;

import androidx.annotation.NonNull;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueProxy<E> extends ConcurrentLinkedDeque<E> {
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
        return null;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
