package com.gof.creational.factoryMethod

class JpegReader implements ImageReader {
  private DecodedImage decodedImage

  JpegReader(String image) {
    decodedImage = new DecodedImage(image)
  }

  @Override
  DecodedImage getDecodeImage() {
    decodedImage
  }
}
