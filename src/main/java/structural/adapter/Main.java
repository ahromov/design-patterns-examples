package structural.adapter;

public class Main {

	public static void main(String[] args) {
		VectorAdapterFromRaster g1 = new VectorAdapterFromRaster();
		g1.drawLine();
		g1.drawSquare();
		VectorAdapterFromRaster2 g2 = new VectorAdapterFromRaster2();
		g2.drawLine();
		g2.drawSquare();
	}

}

interface VectorGraphicsInterface {

	void drawLine();

	void drawSquare();

}

class RasterGraphics {

	void drawRasterLine() {
		System.out.println("draw line");
	}

	void drawRasterSquare() {
		System.out.println("draw square");
	}

}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

	public void drawLine() {
		drawRasterLine();
	}

	public void drawSquare() {
		drawRasterSquare();
	}

}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

	RasterGraphics rasterGraphics = new RasterGraphics();

	public void drawLine() {
		rasterGraphics.drawRasterLine();
	}

	public void drawSquare() {
		rasterGraphics.drawRasterSquare();
	}

}
