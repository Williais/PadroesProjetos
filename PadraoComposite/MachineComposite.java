package PadraoComposite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent{

    protected List<MachineComponent> components = new ArrayList<>();

    public void add(MachineComponent component){
        components.add(component);
    }

    public int getMachineCount(){
        int machineCount = 0;
        for (MachineComponent component : components) {
            machineCount += component.getMachineCount();
        }

        return machineCount;
    }
}
