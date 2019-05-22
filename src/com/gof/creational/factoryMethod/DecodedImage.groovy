package com.gof.creational.factoryMethod

class DecodedImage {
  private String image

  DecodedImage(String image) {
    this.image = image
  }

  @Override
  String toString() {
    image + ": is decoded"
  }
}
