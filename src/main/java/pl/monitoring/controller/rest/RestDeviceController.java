package pl.monitoring.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.monitoring.controller.DeviceController;
import pl.monitoring.exception.ValidationException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/register")
public class RestDeviceController {
    private final DeviceController deviceController;

    public RestDeviceController(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> registerDevice(@RequestBody DeviceJsonModel deviceJsonModel) {
        try {
            deviceController.registerDevice(deviceJsonModel.toDevice());
        } catch (ValidationException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok().build();
    }
}
