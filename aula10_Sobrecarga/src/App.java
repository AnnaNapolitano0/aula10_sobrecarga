public class App {
    public static void main(String[] args) throws Exception {
       //chamando contrutor vazio
        relogio r1 = new relogio();
        r1.setHora(11);
        r1.setMinuto(15);
        r1.setSegundo(30);
        //declarando construtor vazio pelo metodo setter pu getters
        System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+ r1.getSegundo());
        
        relogio r2 = new relogio(11);
        System.out.println(r2.getHora()+":"+r2.getMinuto()+":"+ r2.getSegundo());

        relogio r3 = new relogio(11, 22);
        System.out.println(r3.getHora()+":"+r3.getMinuto()+":"+ r3.getSegundo());
   
        relogio r4 = new relogio(11, 23, 30);
        System.out.println(r4.getHora()+":"+r4.getMinuto()+":"+ r4.getSegundo());

        relogio r5 = new relogio();
        System.out.println(r5.getHora()+":"+r5.getMinuto()+":"+ r5.getSegundo());
    }
}
