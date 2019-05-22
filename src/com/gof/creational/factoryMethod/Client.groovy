package com.gof.creational.factoryMethod

class Client {
  static void main(String[] args) {
    DecodedImage decodedImage
    ImageReader reader = null
    String image = args[0]
    String format = image.substring(image.indexOf('.') + 1, (image.length()))

    switch (format) {
      case 'gif':
        reader = new GifReader(image)
        break
      case 'jpeg':
        reader = new JpegReader(image)
    }

    assert reader != null
    decodedImage = reader.getDecodeImage()
    System.out.println(decodedImage)
  }
}
