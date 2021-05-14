package xyz.glorin.queuedworkhacklib.hackers;

import java.lang.reflect.Field;
import java.util.LinkedList;

import xyz.glorin.queuedworkhacklib.Hacker;
import xyz.glorin.queuedworkhacklib.proxies.LinkedListProxy;

public class AboveOreoHacker implements Hacker {
    @Override
    public void hack() throws Exception {
        Class queuedWork = Class.forName("android.app.QueuedWork");

        Field sFinishers = queuedWork.getDeclaredField("sFinishers");

        sFinishers.setAccessible(true);

        sFinishers.set(null, new LinkedListProxy<>((LinkedList<Runnable>) sFinishers.get(null)));
    }
}
