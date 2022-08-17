package pl.monitoring.controller;

import org.springframework.stereotype.Controller;
import pl.monitoring.exception.ValidationException;
import pl.monitoring.model.Device;
import pl.monitoring.service.DeviceService;
import pl.monitoring.utils.DeviceValidator;

@Controller
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    public void registerDevice(Device device) throws ValidationException {
        DeviceValidator.validateDevice(device);

        deviceService.registerDevice(device);
    }
}
