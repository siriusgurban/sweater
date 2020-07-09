package ser.inter;

import bean.Config;

public interface Process {
    public abstract void processLogic();

    public default void process(){
        processLogic();
    }
}
