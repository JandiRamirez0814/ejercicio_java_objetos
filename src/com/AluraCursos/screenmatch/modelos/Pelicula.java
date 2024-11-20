public class Pelicula {
    String nombreP;
    int fechaLanzamiento;
    int duracionMin;
    boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int cantidadEvaluaciones;
    //obtener valor getter
    int getCantidadEvaluaciones(){
        return cantidadEvaluaciones;
    }
    void mostrarFichaTecnica(){
        System.out.println(String.format("""
                
            ++++ FILM ++++
            
            Nombre: %s
            Duracion: %d
            Lanzamiento: %d
            Incluida en el plan: %s
            Calificación: %.2f
            Valoraciones: %d""",nombreP,duracionMin,
            fechaLanzamiento,incluidoEnElPlan,calculaMedia(),cantidadEvaluaciones));
    }
    //metod para evaluar pelicula
    void evaluarPelicula(double nota) {
        sumaEvaluaciones+=nota;
        cantidadEvaluaciones++;
    }
    double calculaMedia(){
        return sumaEvaluaciones/cantidadEvaluaciones;
    }
}
