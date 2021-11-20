package polimorfismo;

public class Main {
    public static void main(String[] args) {
        FanMasacre fanMasacre1 = new FanMasacre("Luis","Perez","88888888",27,200,
                "nuclear",90,120);
        Televidente televidente1 = new Televidente("Jorge","Torres","99999999", 12,120,
                "08456325",190);
        FanMasacre fanMasacre2 = new FanMasacre("Carlos","Ruiz","77777777",35,90,
                "muerte",80,130);

        Administrador administrador = new Administrador();

        try {
            administrador.registrar(fanMasacre1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            administrador.registrar(televidente1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            administrador.registrar(fanMasacre2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------- Reporte -----------");
        for (Participante p:administrador.getArregloParticipantes()){
            System.out.println(p.toString() + ", Puntaje:"+ p.calcularPuntaje());
        }
        Participante gana = administrador.obtenerGanador();
        if(gana!=null){
            System.out.println("El Ganador es: " + gana.toString()+ "Puntaje:"+ gana.calcularPuntaje());
        } else{
            System.out.println("no hay ganador");
        }
        System.out.println("Buscando ---------------");
        Participante par = administrador.buscar("88888888");
        if (par!=null){
            System.out.println(par.toString());
        }else{
            System.out.println("No existe");
        }


    }
}
