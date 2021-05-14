package xyz.glorin.queuedworkhacklib.hackers;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;

import xyz.glorin.queuedworkhacklib.Hacker;
import xyz.glorin.queuedworkhacklib.proxies.ConcurrentLinkedQueueProxy;

public class PreNHacker implements Hacker {
    @Override
    public void hack() throws Exception {
        Class queuedWork = Class.forName("android.app.QueuedWork");

        Field sPendingWorkFinishers = queuedWork.getDeclaredField("sPendingWorkFinishers");

        sPendingWorkFinishers.setAccessible(true);

        sPendingWorkFinishers.set(null,
                new ConcurrentLinkedQueueProxy<>((ConcurrentLinkedQueue<Runnable>) sPendingWorkFinishers.get(null)));
    }
}
