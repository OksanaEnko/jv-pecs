package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<Object> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
