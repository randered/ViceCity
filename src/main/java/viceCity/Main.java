package viceCity;

import viceCity.core.EngineImpl;
import viceCity.core.interfaces.Controller;
import viceCity.core.interfaces.Engine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Controller controller = null; // TODO
        Engine engine = new EngineImpl(controller);
        engine.run();

    }
}
