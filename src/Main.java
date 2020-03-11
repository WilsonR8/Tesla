import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	// Image Car
	PImage Model3_1;
	PImage Model3;
	PImage ModelS;
	PImage ModelS_1;
	PImage ModelX;
	PImage ModelX_1;
	PImage ModelY_1;
	PImage ModelY;

	// Image Overlay
	PImage BaseBar;
	PImage Frame;
	PImage Home;
	PImage M3BAR;
	PImage MXBAR;
	PImage MYBAR;
	PImage MSBAR;

	// Image Screen
	PImage CheckOut;
	PImage Confirm;
	PImage Login;
	PImage Main;
	PImage Signin;
	PImage Start;

	int pantalla = 0;
	int cars = 0;
	boolean car = false;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(375, 812);
	}

	public void setup() {

		// Load car image
		Model3_1 = loadImage("Image/car/Model3_1.png");
		Model3 = loadImage("Image/car/Model3.png");
		ModelS = loadImage("Image/car/ModelS.png");
		ModelS_1 = loadImage("Image/car/ModelS_1.png");
		ModelX = loadImage("Image/car/ModelX.png");
		ModelX_1 = loadImage("Image/car/ModelX_1.png");
		ModelY_1 = loadImage("Image/car/ModelY_1.png");
		ModelY = loadImage("Image/car/ModelY.png");

		// Load overlay image
		BaseBar = loadImage("Image/overlay/BaseBar.png");
		Frame = loadImage("Image/overlay/Frame.png");
		Home = loadImage("Image/overlay/Home.png");
		M3BAR = loadImage("Image/overlay/M3BAR.png");
		MXBAR = loadImage("Image/overlay/MXBAR.png");
		MYBAR = loadImage("Image/overlay/MYBAR.png");
		MSBAR = loadImage("Image/overlay/MSBAR.png");

		// Load screen image
		CheckOut = loadImage("Image/screen/CheckOut.png");
		Confirm = loadImage("Image/screen/Confirm.png");
		Login = loadImage("Image/screen/Login.png");
		Main = loadImage("Image/screen/Main.png");
		Signin = loadImage("Image/screen/Signin.png");
		Start = loadImage("Image/screen/Start.png");

	}

	public void draw() {

		switch (pantalla) {
		case 0:
			image(Home, 0, 0);
			break;

		case 1:

			image(Login, 0, 0);
			image(Frame, 0, 0);
			break;

		case 2:

			image(Main, 0, 0);
			image(Frame, 0, 0);
			image(BaseBar, 0, 0);

			if (car == true) {

				switch (cars) {

				case 0:
					image(ModelS, 0, 0);
					image(MSBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 1:
					image(ModelS_1, 0, 0);
					image(MSBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 2:
					image(Model3, 0, 0);
					image(M3BAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 3:
					image(Model3_1, 0, 0);
					image(M3BAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 4:
					image(ModelX, 0, 0);
					image(MXBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 5:
					image(ModelX_1, 0, 0);
					image(MXBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 6:
					image(ModelY, 0, 0);
					image(MYBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;

				case 7:
					image(ModelY_1, 0, 0);
					image(MYBAR, 0, 0);
					image(BaseBar, 0, 0);
					image(Frame, 0, 0);
					break;
				}
			}

			break;

		case 3:

			image(Signin, 0, 0);
			image(Frame, 0, 0);
			break;

		case 4:

			image(Main, 0, 0);
			image(Frame, 0, 0);

			break;
		}

		fill(0);
		text("X:" + mouseX + "Y:" + mouseY, mouseX, mouseY);

	}

	public void mousePressed() {

		screen();
		choosecar();

	}

	public void screen() {
		switch (pantalla) {
		case 0:
			if ((mouseX > 284 && mouseX < 345) && (mouseY > 478 && mouseY < 540)) {
				pantalla++;
			}

			break;
		case 1:
			if ((mouseX > 60 && mouseX < 500) && (mouseY > 310 && mouseY < 550)) {
				pantalla++;
				System.out.println("yes");
			}

			if ((mouseX > 195 && mouseX < 296) && (mouseY > 571 && mouseY < 584)) {
				pantalla = 3;
			}

			break;

		case 2:
			if (car == false) {
				if ((mouseX > 26 && mouseX < 340) && (mouseY > 205 && mouseY < 300)) {
					cars = 0;
					car = true;

					System.out.println("yes");
				}

				if ((mouseX > 27 && mouseX < 125) && (mouseY > 316 && mouseY < 417)) {
					car = true;
					cars = 2;
				}

				if ((mouseX > 140 && mouseX < 236) && (mouseY > 316 && mouseY < 418)) {
					cars = 4;
					car = true;
				}

				if ((mouseX > 248 && mouseX < 346) && (mouseY > 317 && mouseY < 420)) {
					cars = 6;
					car = true;
				}
			}

			break;

		case 3:
			if ((mouseX > 58 && mouseX < 311) && (mouseY > 661 && mouseY < 720)) {
				pantalla = 2;
			}

		}
	}

	public void choosecar() {

		switch (cars) {
		case 0:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 1;
				System.out.println("yes");
			}

			break;

		case 1:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 0;
				System.out.println("yes");
			}

			break;

		case 2:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 3;
				System.out.println("yes");
			}

			break;

		case 3:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 2;
				System.out.println("yes");
			}

			break;

		case 4:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 5;
				System.out.println("yes");
			}

			break;

		case 5:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 4;
				System.out.println("yes");
			}

			break;

		case 6:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 7;
				System.out.println("yes");
			}

			break;

		case 7:

			// BACK
			if ((mouseX > 27 && mouseX < 54) && (mouseY > 67 && mouseY < 92)) {
				car = false;

			}

			// COMPAREE
			if ((mouseX > 310 && mouseX < 345) && (mouseY > 65 && mouseY < 97)) {
				cars = 6;
				System.out.println("yes");
			}

			break;

		}

	}

}
