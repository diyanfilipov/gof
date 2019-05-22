package com.gof.creational.abstractFactory

class EnginolaToolkit extends AbstractFactory {

  @Override
  CPU createCPU() {
    new EnginolaCPU()
  }

  @Override
  MMU createMMU() {
    new EnginolaMMU()
  }
}
