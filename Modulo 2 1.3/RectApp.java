public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10);
        r1.print();
        r1.area();
        r1.drag(20, 40);
    }
}
class Rect {
    int x, y;
    int w, h;
    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }
    void area (){
        int valor = this.w * this.h;
        System.out.println("O valor da área do retangulo é " + valor);
    }
    void drag (int new_x, int new_y){
        this.x += new_x;
        this.y += new_y;
        System.out.format("A nova posição do retangulo é (%d,%d).\n", this.x, this.y);
    }
}