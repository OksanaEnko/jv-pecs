package core.mate.academy.service;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public interface MachineProducer {
public interface MachineProducer<T extends Machine> {
    List<T> get();
}

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }
}

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        trucks.add(new Truck());
        return trucks;
    }
}
}
