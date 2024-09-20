package Backend;

public class Main {
  import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

public class Main {

    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<ObjetoExtraviado> objetosExtraviados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenuPrincipal();
            int opcion = leerOpcion();
            if (opcion == 4) break;

            switch (opcion) {
                case 1: registrarUsuario(); break;
                case 2: Usuario usuario = iniciarSesion();
                        if (usuario != null) gestionarObjetos(usuario); break;
                case 3: verObjetosExtraviados(); break;
                default: System.out.println("Opción inválida.");
            }
        }
        System.out.println("Saliendo...");
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n1. Registrar usuario");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Ver objetos extraviados");
        System.out.println("4. Salir");
    }

    private static int leerOpcion() {
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    private static void registrarUsuario() {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        usuarios.add(new Usuario(nombre, correo, contrasena));
        System.out.println("Usuario registrado con éxito.");
    }

    private static Usuario iniciarSesion() {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {
                System.out.println("Bienvenido, " + usuario.getNombre());
                return usuario;
            }
        }
        System.out.println("Credenciales incorrectas.");
        return null;
    }

    private static void gestionarObjetos(Usuario usuario) {
        while (true) {
            System.out.println("\n1. Registrar objeto extraviado");
            System.out.println("2. Buscar objeto por descripción");
            System.out.println("3. Volver al menú principal");
            int opcion = leerOpcion();
            if (opcion == 3) break;

            switch (opcion) {
                case 1: registrarObjetoExtraviado(usuario); break;
                case 2: buscarObjetoExtraviado(); break;
                default: System.out.println("Opción inválida.");
            }
        }
    }

    private static void registrarObjetoExtraviado(Usuario usuario) {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Descripción del objeto: ");
        String descripcion = scanner.nextLine();
        objetosExtraviados.add(new ObjetoExtraviado(descripcion, usuario));
        System.out.println("Objeto extraviado registrado.");
    }

    private static void buscarObjetoExtraviado() {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Palabra clave para buscar: ");
        String palabraClave = scanner.nextLine().toLowerCase();

        for (ObjetoExtraviado objeto : objetosExtraviados) {
            if (objeto.getDescripcion().toLowerCase().contains(palabraClave)) {
                System.out.println("Objeto encontrado: " + objeto.getDescripcion() +
                                   " (Registrado por: " + objeto.getUsuario().getNombre() + ")");
            }
        }
    }

    private static void verObjetosExtraviados() {
        if (objetosExtraviados.isEmpty()) {
            System.out.println("No hay objetos extraviados registrados.");
        } else {
            System.out.println("\nObjetos extraviados:");
            for (ObjetoExtraviado objeto : objetosExtraviados) {
                System.out.println("- " + objeto.getDescripcion() + " (Registrado por: " + objeto.getUsuario().getNombre() + ")");
            }
        }
    }
}



}
