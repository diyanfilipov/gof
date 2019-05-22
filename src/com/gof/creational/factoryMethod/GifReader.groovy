package com.gof.creational.factoryMethod

class GifReader implements ImageReader {

  private DecodedImage decodedImage

  GifReader(String image) {
    this.decodedImage = new DecodedImage(image)
  }

  @Override
  DecodedImage getDecodeImage() {
    decodedImage
  }
}
