package structure.bridge;

import structure.bridge.devices.DeviceRadio;
import structure.bridge.devices.DeviceTV;
import structure.bridge.remotes.RemoteAdvanced;
import structure.bridge.remotes.RemoteBasic;

/**
 *  Мост (Bridge)
 *  Разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга.
 *  Этот пример показывает разделение кода пультов дистанционного управления и бытовых приборов.
 *  Пульты выступают «абстракцией», а приборы — «реализацией». Одни и те же приборы могут работать с разными пультами, а пульты управлять разными устройствами.
 *  Применив паттерн Мост, мы можем изменять классы пультов и приборов независимо друг от друга.
 */
public class Example {

    public static void main(String[] args) {
        // Все устройства имеют общий интерфейс. Поэтому с ними может работать любой пульт.
        // Но каждое устройство имеет особую реализацию.
        DeviceRadio radio = new DeviceRadio();
        DeviceTV tv = new DeviceTV();

        RemoteBasic remoteBasic = new RemoteBasic(tv);
        remoteBasic.togglePower();

        RemoteAdvanced remoteAdvancedRadio = new RemoteAdvanced(radio);
        remoteAdvancedRadio.mute();

        RemoteAdvanced remoteAdvancedTV = new RemoteAdvanced(tv);
        remoteAdvancedTV.mute();
    }

}