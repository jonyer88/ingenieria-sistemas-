public class main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel García Márquez", 1967, "978-3-16-148410-0");

        // Mostrar información del libro
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio de Publicación: " + libro1.getAnioPublicacion());
        System.out.println("ISBN: " + libro1.getIsbn());

        // Modificar algunos atributos del libro
        libro1.setTitulo("El Amor en los Tiempos del Cólera");
        libro1.setAnioPublicacion(1985);

        // Mostrar información actualizada del libro
        System.out.println("\nInformación actualizada del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio de Publicación: " + libro1.getAnioPublicacion());
        System.out.println("ISBN: " + libro1.getIsbn());
    }
}


