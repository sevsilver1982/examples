package structure.bridge.remotes;

import structure.bridge.devices.Device;

/**
 *  Вы можете расширять класс пультов, не трогая код устройств
 */
public class RemoteAdvanced extends RemoteBasic {

    public RemoteAdvanced(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }

}