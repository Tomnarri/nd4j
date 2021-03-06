package org.nd4j.linalg.api.concurrency;

/**
 * @author raver119@gmail.com
 */
public interface AffinityManager {

    /**
     * This method returns deviceId for current thread
     * @return
     */
    Integer getDeviceForCurrentThread();

    /**
     * This method returns deviceId for specified thread
     * @param thread
     * @return
     */
    Integer getDeviceForThread(Thread thread);

    /**
     * This method returns
     *
     * @param threadId
     * @return
     */
    Integer getDeviceForThread(long threadId);

    /**
     * This method attaches specified thread to specified device
     *
     * @param thread
     * @param deviceId
     */
    void attachThreadToDevice(Thread thread, Integer deviceId);

    /**
     * This method attaches specified thread (by Id) to specified device
     *
     * @param threadId java ID of the thread
     * @param deviceId
     */
    void attachThreadToDevice(long threadId, Integer deviceId);
}
