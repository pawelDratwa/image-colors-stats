public class MyColor {

    private final int red;
    private final int green;
    private final int blue;
    private final ColorName colorName;

    public MyColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        //a bunch of IF conditions declare which color it is (by name)
    if(red <= 50 && green <= 50 && blue <= 50)
        this.colorName = ColorName.BLACK;
    else if ( (red >=50 && red <=128) && (green >= 50 && green <=128) && (blue >50 && blue <=128))
        this.colorName = ColorName.DARK;
    else if ( (red >=128 && red <=200) && (green >=128 && green <=200) && (blue >128 && blue <=200))
        this.colorName = ColorName.LIGHT;
    else if ( (red >=200 && red <=255)  && (green >=200 && green <=255)  && (blue >=200 && blue <=255))
        this.colorName = ColorName.WHITE;
    else if ( (red >=153 && red <=255) && (green >=0 && green <=153) && (blue >=0 && blue <=76))
        this.colorName = ColorName.RED;
    else if ( (red >=153 && red <=255) && (green >=153 && green <=204) && (blue >=0 && blue <=76))
        this.colorName = ColorName.ORANGE;
    else if ( (red >=153 && red <=255) && (green >=204 && green <=255) && (blue >=0 && blue <=76))
        this.colorName = ColorName.YELLOW;
    else if ( (red >=0 && red <=76) && (green >=153 && green <=255) && (blue >=0 && blue <=153))
        this.colorName = ColorName.GREEN;
    else if ( (red >=0 && red <=76) && (green >=204 && green <=255) && (blue >=153 && blue <=255))
        this.colorName = ColorName.CYAN;
    else if ( (red >=0 && red <=76) && (green >=0 && green <=153) && (blue >=153 && blue <=255))
        this.colorName = ColorName.BLUE;
    else if ( (red >=76 && red <=153) && (green >=0 && green <=76) && (blue >=99 && blue <=255))
        this.colorName = ColorName.VIOLET;
    else if ( (red >=153 && red <=255) && (green >=0 && green <=76) && (blue >=99 && blue <=255))
        this.colorName = ColorName.PINK;
    else
        this.colorName = ColorName.UNKNOWN;

    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public ColorName getColorName() {
        return colorName;
    }

    @Override
    public String toString() {
        return "MyColor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", colorName=" + colorName +
                '}';
    }
}
