package com.udemy.pattern.behavioral;
/**
 Позволяет объектам менять поведение в зависимости от своего состояния.
 Извне создаётся впечатление, что изменился класс объекта состояния.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Состояние

 ПРИМЕНИМОСТЬ:
 * Когда у вас есть объект, поведение которого кардинально меняется в
 зависимости от внутреннего состояния, причём типов состояний много, и
 их код часто меняется.
 * Когда код класса содержит множество больших, похожих друг на друга,
 условных операторов, которые выбирают поведения в зависимости от текущих
 значений полей класса.
 * Когда вы сознательно используете табличную машину состояний, построенную
 на условных операторах, но вынуждены мириться с дублированием кода для похожих
 состояний и переходов.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Избавляет от множества больших условных операторов машины состояний.
 + Концентрирует в одном месте код, связанный с определённым состоянием.
 + Упрощает код контекста.
 - Может неоправданно усложнить код, если состояний мало и они редко меняются.
*/

import java.util.Random;

public class StatePattern {
    public static void main(String[] args) {
        GumMachine gumMachine = new GumMachine();
        gumMachine.insertQuarter();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
    }
}

// Позволяет переходить из состояние в состояние
abstract class State {
    int count = 10;
    abstract public void insertQuarter(GumMachine gumMachine);
    abstract public void turnCrank(GumMachine gumMachine);
}

class GumMachine {
    State state = new NoQuarter();

    public void insertQuarter() {
        state.insertQuarter(this);
    }

    public void turnCrank() {
        state.turnCrank(this);
    }
}

class SoldOut extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("no gums");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("no gums");
    }
}

class HasQuarter extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("you have set quarter already");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        if (count <= 0) {
            gumMachine.state = new SoldOut();
        } else {
            System.out.println("selling...");
            count--;
            gumMachine.state = new NoQuarter();
        }
    }
}

class NoQuarter extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        if (new Random().nextBoolean()) {
            gumMachine.state = new Winner();
        } else {
            gumMachine.state = new HasQuarter();
        }
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("no quarter");
    }
}

// Расширяем изначальную задачу, добавляя новое состояние
class Winner extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("You are winner!");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("get gum");
        gumMachine.state = new NoQuarter();
    }
}

/**
 * Реализация без паттерна
 */
//enum GumMachineState {
//    SOLD_OUT, NO_QUARTER, HAS_QUARTER
//}
// При добавлении нового состояния, приходится исправлять каждый метод
//class GumMachine {
//    private int count = 10;
//    GumMachineState state = GumMachineState.NO_QUARTER;
//
//    public void insertQuarter() {
//        if (state.equals(GumMachineState.HAS_QUARTER)) {
//            System.out.println("you can't insert another quarter");
//        } else if (state.equals(GumMachineState.NO_QUARTER)) {
//            state = GumMachineState.HAS_QUARTER;
//        } else if (state.equals(GumMachineState.SOLD_OUT)) {
//            System.out.println("no gums");
//        }
//    }
//
//    public void turnCrank() {
//        if (state.equals(GumMachineState.HAS_QUARTER)) {
//            if (count <= 0) {
//                state = GumMachineState.SOLD_OUT;
//            } else {
//                System.out.println("selling...");
//                state = GumMachineState.NO_QUARTER;
//                count--;
//            }
//        } else if (state.equals(GumMachineState.NO_QUARTER)) {
//            System.out.println("you didn't insert quarter");
//        }
//    }
//}