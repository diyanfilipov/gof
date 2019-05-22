package com.gof.creational.abstractFactory

class Client {
  static void main(String[] args) {
    AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER)
    CPU cpu = factory.createCPU()
  }
}
