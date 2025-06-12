package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {
    List<? extends Machine> getAll(Class<? extends Machine> type);
    void fill(List<Object> machines, Object value);
    void startWorking(List<? extends Machine> machines);
}
