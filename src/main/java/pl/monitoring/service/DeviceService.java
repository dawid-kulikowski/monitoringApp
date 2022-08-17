package pl.monitoring.service;

import org.springframework.stereotype.Service;
import pl.monitoring.model.Device;
import pl.monitoring.repository.DeviceRepository;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public void registerDevice(Device device) {
        deviceRepository.registerDevice(device);
    }
}
