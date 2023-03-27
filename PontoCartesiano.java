public class PontoCartesiano {
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculcarDistania(PontoCartesiano ponto) {
        double dx = ponto.getX() - x;
        double dy = ponto.getY() - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void mover(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
