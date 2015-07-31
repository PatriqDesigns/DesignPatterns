package com.patriqdesigns.patterns.command.homeautomatation;

import com.patriqdesigns.patterns.command.homeautomatation.command.off.*;
import com.patriqdesigns.patterns.command.homeautomatation.command.on.*;
import com.patriqdesigns.patterns.command.homeautomatation.command.party.MacroCommand;
import com.patriqdesigns.patterns.command.homeautomatation.device.*;
import com.patriqdesigns.patterns.command.homeautomatation.remote.RemoteControl;

/**
 * Created by Andre on 20/07/15.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living room");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Stereo stereo = new Stereo("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Tv tv = new Tv("Kitchen");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithDvdCommand stereoOn = new StereoOnWithDvdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);

        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);

        MacroCommand partyOn = new MacroCommand(
                kitchenLightOn,
                livingRoomLightOn,
                ceilingFanOn,
                stereoOn,
                garageOpen,
                tvOn
        );
        MacroCommand partyOff = new MacroCommand(
                kitchenLightOff,
                livingRoomLightOff,
                ceilingFanOff,
                stereoOff,
                garageClose,
                tvOff
        );

        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, livingRoomLightOn, livingRoomLightOff);
        control.setCommand(3, ceilingFanOn, ceilingFanOff);
        control.setCommand(4, stereoOn, stereoOff);
        control.setCommand(5, garageOpen, garageClose);
        control.setCommand(6, tvOn, tvOff);
        control.setCommand(7, partyOn, partyOff);

        control.onButtonPressed(1);
        control.onButtonPressed(2);
        control.onButtonPressed(3);
        control.offButtonPressed(3);
        System.out.println(control);
        control.undoButtonPressed();
        System.out.println(control);
        control.undoButtonPressed();
        control.undoButtonPressed();
        control.undoButtonPressed();
        control.undoButtonPressed();
    }
}
