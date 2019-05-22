package com.gof.creational.abstractFactory

abstract class AbstractFactory {
  private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit()
  private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit()

  // Returns a concrete factory object that is an instance of the
  // concrete factory class appropriate for the given architecture.
  static AbstractFactory getFactory(Architecture architecture) {
    switch (architecture) {
      case Architecture.ENGINOLA:
        return ENGINOLA_TOOLKIT
      case Architecture.EMBER:
        return EMBER_TOOLKIT

    }
  }

  abstract CPU createCPU()

  abstract MMU createMMU()
}
