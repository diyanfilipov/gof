package com.gof.creational.abstractFactory

class EmberToolkit extends AbstractFactory {

  @Override
  CPU createCPU() {
    new EmberCPU()
  }

  @Override
  MMU createMMU() {
    new EmberMMU()
  }
}
