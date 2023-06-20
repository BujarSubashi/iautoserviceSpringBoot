package com.cindytech.iautoservice.utils;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SingleInstanceChecker {
    
    private static final String LOCK_FILE_NAME = "resource/iautoservice.lock";
    private static FileLock lock;

    public static boolean isRunning() {
        try {
            Path lockFilePath = Paths.get(System.getProperty("user.dir"), LOCK_FILE_NAME);
            FileChannel channel = FileChannel.open(lockFilePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            lock = channel.tryLock();
            return (lock == null) ? true : false;
        } catch (IOException e) {
            return true;
        }
    }

    public static void releaseLock() {
        try {
            if (lock != null) {
                lock.release();
            }
        } catch (IOException e) {
            // handle exception
        }
    }
}
