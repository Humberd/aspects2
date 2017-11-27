package humberd.aspects;

import humberd.AccessTracked;

public aspect TrackingAspect {
    declare parents:MessageCommunicator implements AccessTracked;

    private long AccessTracked.lastAccessedTime;
    public void AccessTracked.updateLastAccessedTime() {
        lastAccessedTime = System.currentTimeMillis();
    }
    public long AccessTracked.getLastAccessedTime() {
        return lastAccessedTime;
    }
    before(AccessTracked accessTracked): execution(* AccessTracked+.*(..)) && !execution(* AccessTracked.*(..)) && this(accessTracked) {
        accessTracked.updateLastAccessedTime();
    }
}
