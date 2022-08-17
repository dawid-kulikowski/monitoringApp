package pl.monitoring.repository;

import org.springframework.stereotype.Repository;
import pl.monitoring.model.Device;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDeviceRepository implements DeviceRepository {
    private static final List<Device> DEVICE_LIST = new ArrayList<>();

    @Override
    public void registerDevice(Device device) {
        DEVICE_LIST.add(device);

        System.out.printf("Device added: %s", device);
    }

    @Override
    public List<Device> getAllDevices() {
        return new ArrayList<>(DEVICE_LIST); //WYTŁUMACZYĆ
    }
}
