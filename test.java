class A {
    int x = 5;
    int y;
    A(int y) {
        System.out.println(this.x + " " + this.y);
        this.y = y;
        this.x = this.x + y;
    }
    void stampa() { System.out.println(x + " " + y); }
}
