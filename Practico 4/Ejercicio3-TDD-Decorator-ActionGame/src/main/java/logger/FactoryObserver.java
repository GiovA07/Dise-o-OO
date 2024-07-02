package logger;

import battleArena.BattleArena;

public class FactoryObserver {
        public static void createObserver(String type, BattleArena battleArena) {
        if(type.equals("terminal")) {
            Observer obs = new Logger();
            battleArena.registerObserver(obs);
        } else if (type.equals("file")) {
            Observer obs = new FileLogger();
            battleArena.registerObserver(obs);
        } else if (type.equals("stadistics")) {
            Observer obs = new StadisticsLogger();
            battleArena.registerObserver(obs);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
