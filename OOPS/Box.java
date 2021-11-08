class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l = 0;
        this.w = 0;
        this.h = 0;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    public void print() {
        System.out.println(this.h + " " + this.l + " " + this.w);
    }

}