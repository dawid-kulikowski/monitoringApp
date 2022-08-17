package pl.monitoring.repository;

import pl.monitoring.model.Device;

import java.util.List;

public interface DeviceRepository {
    void registerDevice(Device device);

    List<Device> getAllDevices();
}
