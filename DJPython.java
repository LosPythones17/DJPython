import java.util.Scanner;
public class DJPython {
    static char comillas = '"';
    static void pausar() {  //metodo para pausas de información
        System.out.println("\nPresiona ENTER para continuar...");
        try {
            System.in.read();//leer un caracter
        } catch (Exception e) {
            // Ignorar errores
        }
    }
    static boolean ejecutando = true;
    static String[] qstarm1;//arreglos de preguntas
    static String[] qstarm1opc1;//arreglos de opciones
    static String[] qstarm1opc2;
    static String[] qstarm1opc3;
    static String[] qstarm1opc4;
    static String[] qstarm2;
    static String[] qstarm2opc1;
    static String[] qstarm2opc2;
    static String[] qstarm2opc3;
    static String[] qstarm2opc4;
    static String[] qstarm3;
    static String[] qstarm3opc1;
    static String[] qstarm3opc2;
    static String[] qstarm3opc3;
    static String[] qstarm3opc4;
    static String[] qstteo1;
    static String[] qstteo1opc1;
    static String[] qstteo1opc2;
    static String[] qstteo1opc3;
    static String[] qstteo1opc4;
    static String[] qstteo2;
    static String[] qstteo2opc1;
    static String[] qstteo2opc2;
    static String[] qstteo2opc3;
    static String[] qstteo2opc4;
    static String[] qstteo3;
    static String[] qstteo3opc1;
    static String[] qstteo3opc2;
    static String[] qstteo3opc3;
    static String[] qstteo3opc4;
    static int aciertos;//cuestionarios
    static int errores;//cuestionarios
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while (ejecutando){
            proceso1();
        }
    }
    public static void proceso1() {
        menu();
        int userinput = scanner.nextInt();
        switch (userinput) {
            case 1: descubrimiento();
                break;
            case 2: teoria();
                break;
            case 3: equipo();
                break;
            case 4: librerias();
                break;
            case 5:
                ejecutando = false;
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                proceso1();
                break;
        }
    }
    public static void menu(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Elija la Sección Deseada                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      1. Descubrimiento Musical                     |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      2. Teoría Musical                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      3. Equipo de Audio                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      4. Librerias                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      5. Salir del programa                         |");
        System.out.println("        |____________________________________________________________________|");}
    public static void descubrimiento(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija el Genero Musical Deseado                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Rock                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Pop                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Folk                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Indie                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Hip-Hop / Rap                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. R&B                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        desint();}
    public static void desint() { //lector de descubrimiento
        int userdesinput = scanner.nextInt();
        switch (userdesinput) {
            case 1: rockdesint();
                break;
            case 2: popdesint();
                break;
            case 3: folkdesint();
                break;
            case 4: indiedesint();
                break;
            case 5: hipdesint();
                break;
            case 6: rbdesint();
                break;
            case 7: proceso1();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                descubrimiento();
                break;
        }
    }
    public static void desmenu(){ //menu de los generos de descubrimiento
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Generos Similares                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Artistas                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Albumes                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
    }
    //modulo de rock
    public static void rockdesint() {
        desmenu();
        int rockdesint = scanner.nextInt();
        switch (rockdesint) {
            case 1: similarrock();
                pausar();
                rockdesint();
                break;
            case 2: artistasrock();
                pausar();
                rockdesint();
                break;
            case 3: albumrock();
                pausar();
                rockdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                rockdesint();
                break;
        }
    }
    private static void albumrock() {//lista de albumes de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |            The Dark Side of the Moon - Pink Floyd (1973)           |");
        System.out.println("        |                   Abbey Road – The Beatles (1969)                  |");
        System.out.println("        |                     Back in Black – AC/DC (1980)                   |");
        System.out.println("        |                Led Zeppelin IV – Led Zeppelin (1971)               |");
        System.out.println("        |                 A Night at the Opera – Queen (1975)                |");
        System.out.println("        |            Californication – Red Hot Chili Peppers (1999)          |");
        System.out.println("        |                   OK Computer – Radiohead (1997)                   |");
        System.out.println("        |                    The Joshua Tree – U2 (1987)                     |");
        System.out.println("        |                    The Wall – Pink Floyd (1979)                    |");
        System.out.println("        |                   Is This It – The Strokes (2001)                  |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistasrock() {//lista de artistas de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            Led Zeppelin                            |");
        System.out.println("        |                             Pink Floyd                             |");
        System.out.println("        |                               Queen                                |");
        System.out.println("        |                         The Rolling Stones                         |");
        System.out.println("        |                            The Beatles                             |");
        System.out.println("        |                               AC/DC                                |");
        System.out.println("        |                            Foo Fighters                            |");
        System.out.println("        |                            Guns N’ Roses                           |");
        System.out.println("        |                             The Strokes                            |");
        System.out.println("        |                        Red Hot Chili Peppers                       |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void similarrock() { //lista de generos similaresal rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                               Blues                                |");
        System.out.println("        |                               Punk                                 |");
        System.out.println("        |                               Metal                                |");
        System.out.println("        |____________________________________________________________________|");
    }
    //modulo de pop
    public static void popdesint(){//lector de pop
        desmenu();
        int popdesint = scanner.nextInt();
        switch (popdesint) {
            case 1: similarpop();
                pausar();
                popdesint();
                break;
            case 2: artistaspop();
                pausar();
                popdesint();
                break;
            case 3: albumpop();
                pausar();
                popdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                popdesint();
                break;
        }
    }
    private static void albumpop() {//lista de albumes de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                  Thriller – Michael Jackson (1982)                 |");
        System.out.println("        |                 Future Nostalgia – Dua Lipa (2020)                 |");
        System.out.println("        |                  Teenage Dream – Katy Perry (2010)                 |");
        System.out.println("        |                  Born This Way – Lady Gaga (2011)                  |");
        System.out.println("        |            Confessions on a Dance Floor – Madonna (2005)           |");
        System.out.println("        |                        X – Ed Sheeran (2014)                       |");
        System.out.println("        |                          25 – Adele (2015)                         |");
        System.out.println("        |                    Revival – Selena Gomez (2015)                   |");
        System.out.println("        |                   Fine Line – Harry Styles (2019)                  |");
        System.out.println("        |           FutureSex/LoveSounds – Justin Timberlake (2006)          |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistaspop() {//lista de artistas de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           Michael Jackson                          |");
        System.out.println("        |                            Taylor Swift                            |");
        System.out.println("        |                              Dua Lipa                              |");
        System.out.println("        |                            Harry Styles                            |");
        System.out.println("        |                             Lady Gaga                              |");
        System.out.println("        |                           Ariana Grande                            |");
        System.out.println("        |                         Justin Timberlake                          |");
        System.out.println("        |                             Bruno Mars                             |");
        System.out.println("        |                               Adele                                |");
        System.out.println("        |                           Billie Eilish                            |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void similarpop() {//lista de generos similares al pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                               Dance                                |");
        System.out.println("        |                                EDM                                 |");
        System.out.println("        |                                R&B                                 |");
        System.out.println("        |                             Synthwave                              |");
        System.out.println("        |                            Electropop                              |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo de folk
    public static void folkdesint() {//lector de folk
        desmenu();
        int folkdesint = scanner.nextInt();
        switch (folkdesint) {
            case 1: similarfolk();
                pausar();
                folkdesint();
                break;
            case 2: artistasfolk();
                pausar();
                folkdesint();
                break;
            case 3: albumfolk();
                pausar();
                folkdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                folkdesint();
                break;
        }
    }
    private static void albumfolk() {//lista de albumes de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |            The Freewheelin’ Bob Dylan – Bob Dylan (1963)           |");
        System.out.println("        |        Bridge Over Troubled Water – Simon & Garfunkel (1970)       |");
        System.out.println("        |                     Harvest – Neil Young (1972)                    |");
        System.out.println("        |                The Lumineers – The Lumineers (2012)                |");
        System.out.println("        |           Shallow Grave – The Tallest Man on Earth (2008)          |");
        System.out.println("        |                     Blue – Joni Mitchell (1971)                    |");
        System.out.println("        |                    Eduardo – Ed Maverick (2021)                    |");
        System.out.println("        |              Passenger – All the Little Lights (2012)              |");
        System.out.println("        |          Mix pa’ llorar en tu cuarto – Ed Maverick (2019)          |");
        System.out.println("        |               Wanted on Voyage – George Ezra (2014)                |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistasfolk() {//lista de artistas de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                             Bob Dylan                              |");
        System.out.println("        |                             Joan Baez                              |");
        System.out.println("        |                              Bon Iver                              |");
        System.out.println("        |                            Joni Mitchell                           |");
        System.out.println("        |                             Neil Young                             |");
        System.out.println("        |                             Fleet Foxes                            |");
        System.out.println("        |                           Sufjan Stevens                           |");
        System.out.println("        |                             Iron & Wine                            |");
        System.out.println("        |                            José González                           |");
        System.out.println("        |                             Ed Maverick                            |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarfolk() {//lista de generos similares al folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                               Country                              |");
        System.out.println("        |                          Singer-Songwriter                         |");
        System.out.println("        |                              Americana                             |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo de indie
    public static void indiedesint(){//lector de indie
        desmenu();
        int indiedesint = scanner.nextInt();
        switch (indiedesint) {
            case 1: similarindie();
                pausar();
                indiedesint();
                break;
            case 2: artistasindie();
                pausar();
                indiedesint();
                break;
            case 3: albumindie();
                pausar();
                indiedesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                indiedesint();
                break;
        }
    }
    private static void albumindie() {//lista de albumes de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                    quiero dormir - Vicoz (2024)                    |");
        System.out.println("        |                   Is This It – The Strokes (2001)                  |");
        System.out.println("        |                   In Rainbows – Radiohead (2007)                   |");
        System.out.println("        |                    Casa Pepe - Fabiancito (2020)                   |");
        System.out.println("        |                 Nubes - Policías y Ladrones (2021)                 |");
        System.out.println("        |               Un Montón - Perras on the beach (2019)               |");
        System.out.println("        |                     Un Atasco - La Plata (2017)                    |");
        System.out.println("        |                D>E>A>T>H>M>E>T>A>L - Panchiko (2000)               |");
        System.out.println("        |                        Para Mi - Cuco (2019)                       |");
        System.out.println("        |                      Antics – Interpol (2004)                      |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistasindie() {//lista de artistas de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Vicoz                               |");
        System.out.println("        |                             The Strokes                            |");
        System.out.println("        |                              Radiohead                             |");
        System.out.println("        |                             Tame Impala                            |");
        System.out.println("        |                                alt-J                               |");
        System.out.println("        |                              La Plata                              |");
        System.out.println("        |                         Perras on the beach                        |");
        System.out.println("        |                         Policías y Ladrones                        |");
        System.out.println("        |                       Margarita Siempre Viva                       |");
        System.out.println("        |                               Bratty                               |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarindie() {// lista de generos similares al indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          Alternative Rock                          |");
        System.out.println("        |                              Dream Pop                             |");
        System.out.println("        |                              Post Punk                             |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo hip hop
    public static void hipdesint(){//lector de hip hop
        desmenu();
        int hipdesint = scanner.nextInt();
        switch (hipdesint) {
            case 1: similarhip();
                pausar();
                hipdesint();
                break;
            case 2: artistaship();
                pausar();
                hipdesint();
                break;
            case 3: albumhip();
                pausar();
                hipdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                hipdesint();
                break;
        }
    }
    private static void albumhip() {//lista de albumes de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         albumes de hip hop                         |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistaship() {//lista de artistas de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        artistas de hip hop                         |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarhip() {//lista de generos similares al hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                    generos similares al hip hop                    |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo R%B
    public static void rbdesint(){//lector de R&B
        desmenu();
        int rbdesint = scanner.nextInt();
        switch (rbdesint) {
            case 1: similarrb();
                pausar();
                rbdesint();
                break;
            case 2: artistasrb();
                pausar();
                rbdesint();
                break;
            case 3: albumrb();
                pausar();
                rbdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                rbdesint();
                break;
        }
    }
    private static void albumrb() {//lista de albumes de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           albumes de R&B                           |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistasrb() {//lista de artistas de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          artistas de R&B                           |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarrb() { //lista de generos simolates al rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      generos similares al R&B                      |");
        System.out.println("        |____________________________________________________________________|");    }
    //acaba el descubrimiento musical
    public static void teoria(){//inicia teoria musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Armonía                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Melodía                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Cuestionarios                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        teoint();}
    public static void teoint(){//lectura de teoria musical
        int userteoinput = scanner.nextInt();
        switch (userteoinput) {
            case 1: armonia();
                break;
            case 2: melodia();
                break;
            case 3: cuestionarios();
                break;
            case 4: proceso1();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                teoria();
                break;
        }
    }
    private static void melodia() {//aqui va la teoria de la meoldia musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        | En teoría musical, una melodía, también llamada tono, voz o línea, |");
        System.out.println("        | son una serie de eventos lineales sonoros o una sucesión, pero no  |");
        System.out.println("        | una simultaneidad como es el caso de los acordes. Sin embargo,     |");
        System.out.println("        | esta sucesión debe contener cambios de algún tipo y ser percibida  |");
        System.out.println("        | como una sola entidad para ser llamada melodía. La podemos definir |");
        System.out.println("        | como la sucesión de sonidos graves y agudos en un tiempo determi-  |");
        System.out.println("        | nado.                                                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        | El cambio es necesario para los eventos que son entendidos como    |");
        System.out.println("        | relacionados o no relacionados. Usualmente las melodías constan de |");
        System.out.println("        | una o más frases musicales, es decir, "+ comillas + "motivos" + comillas + " y son por lo gene- |");
        System.out.println("        | ral, repetidas a lo largo de una canción o pieza en varias formas. |");
        System.out.println("        |                                                                    |");
        System.out.println("        | La mayoría de la música occidental utiliza la escala de 12 tonos.  |");
        System.out.println("        | Los elementos esenciales de la melodía son: duración, altura, cua- |");
        System.out.println("        | lidad, textura e intensidad.                                       |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        teoria();
    }
    private static void armonia() {//aqui va la teoria de armonia musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        | La armonía musical es el estudio y la práctica de combinar notas   |");
        System.out.println("        | simultáneas, formando acordes, así como de cómo esos acordes pro-  |");
        System.out.println("        | gresan a lo largo de una pieza.                                    |");
        System.out.println("        | Representan el aspecto del sonido musical que puede generar ten-   |");
        System.out.println("        | sión (disonancia) y resolución (consonancia) según su estructura.  |");
        System.out.println("        | El término armonía deriva del griego ἁρμονία (harmonía), que sig-  |");
        System.out.println("        | nifica " + comillas + "conjunto, acuerdo, concordia" + comillas + ", del verbo ἁρμόζω (harmozo)  |");
        System.out.println("        | " + comillas + "encajar" + comillas + " o " + comillas + "unir" + comillas + ".                                                |");
        System.out.println("        | Finalmente, la armonía aporta estructura, color emocional y sopor- |");
        System.out.println("        | te a la melodía, influenciando cómo percibimos la música.          |");
        System.out.println("        | Algunos elementos básicos de la armonía son: intervalos, acordes,  |");
        System.out.println("        | progresiones, tonalidad y modalidad, modulación y ritmo armónico.  |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        teoria();
    }
    public static void cuestionarios(){//menu de cuestionarios
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                    Elija El Cuestionario Deseado                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Armonia 1                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Armonia 2                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Armonia 3                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Teoria  1                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Teoria  2                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. Teoria  3                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Salir                                |");
        System.out.println("        |____________________________________________________________________|");
        qstint();}
    public static void qstint(){//lectura de cuestionarios
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia1();
                break;
            case 2: armonia2();
                break;
            case 3: armonia3();
                break;
            case 4: teoria1();
                break;
            case 5: teoria2();
                break;
            case 6: teoria3();
                break;
            case 7: teoria();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                cuestionarios();
                break;
        }
    }
    private static void menucuestionarios(){//menu de los cuestionarios
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Consta de 10 preguntas                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             1. Iniciar                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             2. Volver                              |");
        System.out.println("        |____________________________________________________________________|");
    }
    //nota: aquí inician los cuestionarios, en cada uno de ellos es necesario cambiar los resultados y las preguntas que estan asignadas al inicio de cada modulo
    //nota2: para el formato de cuadro (DJPython) de izquiera a derecha siempre va a ser de 5 espacios, pero la separacion a la derecha se cambia manualmente en ña pregunta
    private static void teoria3(){
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Melodía 3                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre: \"Organización melódica\"       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |            Subtema: Frases, motivos, repetición y variación        |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria3_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                teoria3();
                break;
        }
    }
    private static void teoria3_1() {
        aciertos=0;
        errores=0;
        qstteo3 = new String[10];
        qstteo3opc1 = new String[10];
        qstteo3opc2 = new String[10];
        qstteo3opc3 = new String[10];
        qstteo3opc4 = new String[10];
        qstteo3[0]= "Una frase musical puede describirse como:           |";//asignacion para las preguntas
        qstteo3[1]= "Un motivo musical es:                               |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo3[2]= "La repetición de motivos permite que la melodía sea:|";
        qstteo3[3]= "La variación de un motivo consiste en:              |";
        qstteo3[4]= "Las melodías suelen organizarse de forma:           |";
        qstteo3[5]= "Una melodía sin cambios perceptibles se considera:  |";
        qstteo3[6]= "Una de las funciones del motivo es:                 |";
        qstteo3[7]= "La relación entre frases melódicas pueden ser:      |";
        qstteo3[8]= "La dirección melódica se refiere a si la melodía:   |";
        qstteo3[9]= "Una melodía típica combina:                        |";
        qstteo3opc1[0]="Una sucesión completa con sentido                 |";//opcion 1
        qstteo3opc1[1]="Una melodía completa                              |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo3opc1[2]="Completamente atonal                              |";
        qstteo3opc1[3]="Mantenerlo igual siempre                          |";
        qstteo3opc1[4]="Lineal y sucesiva                                 |";
        qstteo3opc1[5]="Estructurada                                      |";
        qstteo3opc1[6]="Crear identidad musical                           |";
        qstteo3opc1[7]="Solo timbre                                       |";
        qstteo3opc1[8]="Sube, baja o se mantiene                          |";
        qstteo3opc1[9]="Solo velocidad                                    |";
        qstteo3opc2[0]="Un acorde largo                                   |";//opcion 2
        qstteo3opc2[1]="Un patrón corto que puede desarrollarse           |";
        qstteo3opc2[2]="Más predecible y reconocible                      |";
        qstteo3opc2[3]="Eliminarlo totalmente                             |";
        qstteo3opc2[4]="Totalmente simultánea                             |";
        qstteo3opc2[5]="Muy variada                                       |";
        qstteo3opc2[6]="Marcar el compás                                  |";
        qstteo3opc2[7]="Solo respuesta                                    |";
        qstteo3opc2[8]="Cambiar de ritmo                                  |";
        qstteo3opc2[9]="Solo repetición                                   |";
        qstteo3opc3[0]="Un grupo de silencios                             |";//opcion 3
        qstteo3opc3[1]="Un compás de percusión                            |";
        qstteo3opc3[2]="Idéntica a la armonía                             |";
        qstteo3opc3[3]="Cambiarlo ligeramente                             |";
        qstteo3opc3[4]="Atonal únicamente                                 |";
        qstteo3opc3[5]="Monótona                                          |";
        qstteo3opc3[6]="Establecer armonía                                |";
        qstteo3opc3[7]="Solo silencio                                     |";
        qstteo3opc3[8]="Cambia de instrumento                             |";
        qstteo3opc3[9]="Solo silencio                                     |";
        qstteo3opc4[0]="Un ritmo corto                                    |";//opcion 4
        qstteo3opc4[1]="Un tipo de escala                                 |";
        qstteo3opc4[2]="Más difícil de recordar                           |";
        qstteo3opc4[3]="Remplazarlo por un acorde                         |";
        qstteo3opc4[4]="Sin cambios                                       |";
        qstteo3opc4[5]="Compleja                                          |";
        qstteo3opc4[6]="Reemplazar la letra                               |";
        qstteo3opc4[7]="Pregunta y respuesta                              |";
        qstteo3opc4[8]="Usa escalas menores                               |";
        qstteo3opc4[9]="Repetición y variación                            |";
        int[] respuestasCorrectas = {1, 2, 2, 3, 1, 3, 1, 4, 1, 4};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstteo3opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstteo3opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstteo3opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstteo3opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }
    private static void teoria2() {
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Melodía 2                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre: \"Elementos escenciales\"       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |       Subtema: Duración, altura, cualidad, textura e intensidad    |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria2_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                teoria2();
                break;
        }
    }
    private static void teoria2_1() {

        aciertos=0;
        errores=0;
        qstteo2 = new String[10];
        qstteo2opc1 = new String[10];
        qstteo2opc2 = new String[10];
        qstteo2opc3 = new String[10];
        qstteo2opc4 = new String[10];
        qstteo2[0]= "Determina cuanto dura un sonido en la melodía, es:  |";//asignacion para las preguntas
        qstteo2[1]= "La altura diferencía entre sonidos:                 |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo2[2]= "La cualidad de la melodía se relaciona con:         |";
        qstteo2[3]= "La intensidad expresa:                              |";
        qstteo2[4]= "La textura melódica se refiere a:                   |";
        qstteo2[5]= "La melodía con cambios muy marcados se percibe como:|";
        qstteo2[6]= "La combinación de duración y altura produce:        |";
        qstteo2[7]= "La cualidad sonora de una melodía puede cambiar por:|";
        qstteo2[8]= "La textura monofónica implica:                      |";
        qstteo2[9]= "La intensidad se interpreta mediante:              |";
        qstteo2opc1[0]="Textura                                           |";//opcion 1
        qstteo2opc1[1]="Graves y agudos                                   |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo2opc1[2]="El timbre y tipo de sonido                        |";
        qstteo2opc1[3]="El tipo de escala usada                           |";
        qstteo2opc1[4]="La forma de la partitura                          |";
        qstteo2opc1[5]="Monótona                                          |";
        qstteo2opc1[6]="Silencios rítmicos                                |";
        qstteo2opc1[7]="Cambiar el tempo solo                             |";
        qstteo2opc1[8]="Una línea melódica única                          |";
        qstteo2opc1[9]="Figuras rítmicas                                  |";
        qstteo2opc2[0]="Duración                                          |";//opcion 2
        qstteo2opc2[1]="Lentos y rápidos                                  |";
        qstteo2opc2[2]="El número de silencios                            |";
        qstteo2opc2[3]="Si las notas son simultáneas                      |";
        qstteo2opc2[4]="El color visual de una nota                       |";
        qstteo2opc2[5]="Dinámica                                          |";
        qstteo2opc2[6]="Un compás                                         |";
        qstteo2opc2[7]="Cambiar el instrumento que la toca                |";
        qstteo2opc2[8]="Varias melodías simultáneas                       |";
        qstteo2opc2[9]="Armaduras                                         |";
        qstteo2opc3[0]="Intensidad                                        |";//opcion 3
        qstteo2opc3[1]="Suaves y fuertes                                  |";
        qstteo2opc3[2]="El volúmen                                        |";
        qstteo2opc3[3]="Que tan fuerte o suave es un sonido               |";
        qstteo2opc3[4]="La afinación de un instrumento                    |";
        qstteo2opc3[5]="Acordal                                           |";
        qstteo2opc3[6]="Una progresión armónica                           |";
        qstteo2opc3[7]="Cambiar la letra                                  |";
        qstteo2opc3[8]="Acordes complejos                                 |";
        qstteo2opc3[9]="Dinámicas (p,f,mf...)                             |";
        qstteo2opc4[0]="Cualidad                                          |";//opcion 4
        qstteo2opc4[1]="Cortos y largos                                   |";
        qstteo2opc4[2]="La rapidéz                                        |";
        qstteo2opc4[3]="La velocidad del ritmo                            |";
        qstteo2opc4[4]="Como se combinan líneas musicales                 |";
        qstteo2opc4[5]="Estática                                          |";
        qstteo2opc4[6]="La forma melódica                                 |";
        qstteo2opc4[7]="Eliminar variación de altura                      |";
        qstteo2opc4[8]="Efectos electrónicos                              |";
        qstteo2opc4[9]="Matices de tempo                                  |";
        int[] respuestasCorrectas = {2, 1, 1, 3, 4, 2, 4, 2, 1, 3};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstteo2opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstteo2opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstteo2opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstteo2opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }
    private static void teoria1() {
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Melodía 1                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre: \"Conceptos esenciales\"        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Subtema: Definición, características y percepción         |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria1_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                teoria1();
                break;
        }
    }
    private static void teoria1_1() {

        aciertos=0;
        errores=0;
        qstteo1 = new String[10];
        qstteo1opc1 = new String[10];
        qstteo1opc2 = new String[10];
        qstteo1opc3 = new String[10];
        qstteo1opc4 = new String[10];
        qstteo1[0]= "La melodía se define como:                          |";//asignacion para las preguntas
        qstteo1[1]= "La melodía se considera una entidad cuando:         |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo1[2]= "Diferencia clave entre melodía y acorde:            |";
        qstteo1[3]= "Para que exista melodía debe haber:                 |";
        qstteo1[4]= "un \"motivo\" es:                                     |";
        qstteo1[5]= "Las melodías suelen organizarse en:                 |";
        qstteo1[6]= "La música occidental se basa en una escala de:      |";
        qstteo1[7]= "El elemento que define la altura de los sonidos es: |";
        qstteo1[8]= "Las melodías pueden describirse como:               |";
        qstteo1[9]= "La melodía es generalmente:                        |";
        qstteo1opc1[0]="Sonidos simultáneos                               |";//opcion 1
        qstteo1opc1[1]="No presenta ningún cambio                         |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo1opc1[2]="Es simultánea                                     |";
        qstteo1opc1[3]="Cambios perceptibles                              |";
        qstteo1opc1[4]="Otra palabra para armonía                         |";
        qstteo1opc1[5]="Frases musicales                                  |";
        qstteo1opc1[6]="6 tonos                                           |";
        qstteo1opc1[7]="Duración                                          |";
        qstteo1opc1[8]="Líneas sonoras                                    |";
        qstteo1opc1[9]="El acompañamiento                                 |";
        qstteo1opc2[0]="Una sucesión de sonidos graves y agudos           |";//opcion 2
        qstteo1opc2[1]="Solo usa sonidos graves                           |";
        qstteo1opc2[2]="No contiene ritmo                                 |";
        qstteo1opc2[3]="Intensidad constante                              |";
        qstteo1opc2[4]="Un patrón corto que puede repetirse               |";
        qstteo1opc2[5]="Capítulos                                         |";
        qstteo1opc2[6]="8 tonos                                           |";
        qstteo1opc2[7]="Intensidad                                        |";
        qstteo1opc2[8]="Acordes compuestos                                |";
        qstteo1opc2[9]="La idea musical principal                         |";
        qstteo1opc3[0]="Un conjunto de acordes                            |";//opcion 3
        qstteo1opc3[1]="Sus sonidos se perciben somo una unidad           |";
        qstteo1opc3[2]="Es sucesiva                                       |";
        qstteo1opc3[3]="Silencio total                                    |";
        qstteo1opc3[4]="Un tipo de acorde                                 |";
        qstteo1opc3[5]="Tonos simultáneos                                 |";
        qstteo1opc3[6]="10 tonos                                          |";
        qstteo1opc3[7]="Timbre                                            |";
        qstteo1opc3[8]="Texturas estáticas                                |";
        qstteo1opc3[9]="Un ruido de fondo                                 |";
        qstteo1opc4[0]="Un ritmo constante                                |";//opcion 4
        qstteo1opc4[1]="Es idéntica a la armonía                          |";
        qstteo1opc4[2]="Siempre es aguda                                  |";
        qstteo1opc4[3]="Solo sonidos iguales                              |";
        qstteo1opc4[4]="Una escala completa                               |";
        qstteo1opc4[5]="Vibraciones                                       |";
        qstteo1opc4[6]="12 tonos                                          |";
        qstteo1opc4[7]="Frecuencia                                        |";
        qstteo1opc4[8]="Ritmos planos                                     |";
        qstteo1opc4[9]="Un conjunto de silencio                           |";
        int[] respuestasCorrectas = {2, 3, 3, 1, 2, 1, 4, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstteo1opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstteo1opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstteo1opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstteo1opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }
    private static void armonia3() {
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 3                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |         Este cuestionario es sobre: \"Organización armónica\"        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Subtema: Tonalidad, modos y cambios de centro tonal       |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia3_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                armonia3();
                break;
        }
    }

    private static void armonia3_1() {
        aciertos=0;
        errores=0;
        qstarm3 = new String[10];
        qstarm3opc1 = new String[10];
        qstarm3opc2 = new String[10];
        qstarm3opc3 = new String[10];
        qstarm3opc4 = new String[10];
        qstarm3[0]= "La tonalidad está basada en un:                     |";//asignacion para las preguntas
        qstarm3[1]= "El centro tonal recibe el nombre de:                |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm3[2]= "La modulación se refiere a:                         |";
        qstarm3[3]= "La tonalidad mayor suele percibirse como:           |";
        qstarm3[4]= "La tonalidad menor se percibe normalmente como:     |";
        qstarm3[5]= "La armadura de clave indica:                        |";
        qstarm3[6]= "Modulación cercana significa:                       |";
        qstarm3[7]= "Un modo musical es:                                 |";
        qstarm3[8]= "La modulación suele usarse para:                    |";
        qstarm3[9]= "Un ejemplo de modulación común es pasar de:        |";
        qstarm3opc1[0]="Ritmo constante                                   |";//opcion 1
        qstarm3opc1[1]="Dominante                                         |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm3opc1[2]="Cambiar de velocidad                              |";
        qstarm3opc1[3]="Oscura                                            |";
        qstarm3opc1[4]="Triste o melancólica                              |";
        qstarm3opc1[5]="El tipo de instrumento                            |";
        qstarm3opc1[6]="Cambiar a una tonalidad vecina                    |";
        qstarm3opc1[7]="Un tipo de acorde                                 |";
        qstarm3opc1[8]="Afinar el instrumento                             |";
        qstarm3opc1[9]="Do mayor a Sol mayor                              |";
        qstarm3opc2[0]="Centro tonal                                      |";//opcion 2
        qstarm3opc2[1]="Subdominante                                      |";
        qstarm3opc2[2]="Cambiar de tonalidad                              |";
        qstarm3opc2[3]="Inestable                                         |";
        qstarm3opc2[4]="Ruidosa                                           |";
        qstarm3opc2[5]="La cantidad de acordes                            |";
        qstarm3opc2[6]="Cambiar a una tonalidad muy lejana                |";
        qstarm3opc2[7]="Un efecto rítmico                                 |";
        qstarm3opc2[8]="Acelerar el tempo                                 |";
        qstarm3opc2[9]="Do mayor a Si mayor                               |";
        qstarm3opc3[0]="Instrumento principal                             |";//opcion 3
        qstarm3opc3[1]="Tónica                                            |";
        qstarm3opc3[2]="Cambiar de melisma                                |";
        qstarm3opc3[3]="Luminosamente estable                             |";
        qstarm3opc3[4]="Atonal                                            |";
        qstarm3opc3[5]="Las alteraciones de la tonalidad                  |";
        qstarm3opc3[6]="Cambiar de compás                                 |";
        qstarm3opc3[7]="Un instrumento antiguo                            |";
        qstarm3opc3[8]="Bajar el volumen                                  |";
        qstarm3opc3[9]="Do mayor a Fa# menor                              |";
        qstarm3opc4[0]="Efecto de sonido                                  |";//opcion 4
        qstarm3opc4[1]="Octava                                            |";
        qstarm3opc4[2]="Cambiar de instrumento                            |";
        qstarm3opc4[3]="Sin ritmo                                         |";
        qstarm3opc4[4]="Muy brillante                                     |";
        qstarm3opc4[5]="El número de repeticiones                         |";
        qstarm3opc4[6]="Cambiar de melodía                                |";
        qstarm3opc4[7]="Una forma de organizar la escala                  |";
        qstarm3opc4[8]="Cambiar a la emoción o color armónico             |";
        qstarm3opc4[9]="Do mayor a Mib menor                              |";
        int[] respuestasCorrectas = {2, 3, 2, 3, 1, 3, 1, 4, 4, 1};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstarm3opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstarm3opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstarm3opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstarm3opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }
    private static void armonia2(){
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 2                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre: \"Componentes armónicos\"       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |             Subtema: Intervalos, acordes y progresiones            |");

        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia2_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                armonia2();
                break;
        }
    }
    private static void armonia2_1() {
        aciertos=0;
        errores=0;
        qstarm2 = new String[10];
        qstarm2opc1 = new String[10];
        qstarm2opc2 = new String[10];
        qstarm2opc3 = new String[10];
        qstarm2opc4 = new String[10];
        qstarm2[0]= "Un intervalo es:                                    |";//asignacion para las preguntas
        qstarm2[1]= "Un acorde está formado principalmente por:          |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm2[2]= "Una progresión armónica consiste en:                |";
        qstarm2[3]= "Una característica de los acordes consonantes es:   |";
        qstarm2[4]= "Una característica de los acordes disonantes es:    |";
        qstarm2[5]= "El acorde dominante tiende a:                       |";
        qstarm2[6]= "La función armónica relaciona:                      |";
        qstarm2[7]= "Una progresión típica de música popular es:         |";
        qstarm2[8]= "El intervalo de tercera mayor se considera:         |";
        qstarm2[9]= "Un acorde menor se forma con:                      |";
        qstarm2opc1[0]="La diferencia de altura entre dos notas           |";//opcion 1
        qstarm2opc1[1]="Una nota sola                                     |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm2opc1[2]="Un cambio de tonalidad                            |";
        qstarm2opc1[3]="Genera tensión                                    |";
        qstarm2opc1[4]="Producen estabilidad                              |";
        qstarm2opc1[5]="Mantener el reposo                                |";
        qstarm2opc1[6]="La velocidad del compás                           |";
        qstarm2opc1[7]="I–IV–V–I                                          |";
        qstarm2opc1[8]="Consonante                                        |";
        qstarm2opc1[9]="Tercera mayor + quinta justa                      |";
        qstarm2opc2[0]="Un acorde invertido                               |";//opcion 2
        qstarm2opc2[1]="Dos notas consecutivas                            |";
        qstarm2opc2[2]="La repetición de una misma nota                   |";
        qstarm2opc2[3]="Producen sensación de reposo                      |";
        qstarm2opc2[4]="Se perciben como \"suaves\"                         |";
        qstarm2opc2[5]="Resolver hacia la tónica                          |";
        qstarm2opc2[6]="Los instrumentos usados                           |";
        qstarm2opc2[7]="VI–II–III–I                                       |";
        qstarm2opc2[8]="Disonante                                         |";
        qstarm2opc2[9]="Segunda mayor + quinta justa                      |";
        qstarm2opc3[0]="Un cambio de compás                               |";//opcion 3
        qstarm2opc3[1]="Silencios prolongados                             |";
        qstarm2opc3[2]="El cambio de ritmo                                |";
        qstarm2opc3[3]="Son rítmicos                                      |";
        qstarm2opc3[4]="Generan tensión que pide resolución               |";
        qstarm2opc3[5]="Detener la progresión                             |";
        qstarm2opc3[6]="Los acordes dentro de una tonalidad               |";
        qstarm2opc3[7]="V-V-V-V                                           |";
        qstarm2opc3[8]="Atonal                                            |";
        qstarm2opc3[9]="Tercera menor + quinta justa                      |";
        qstarm2opc4[0]="Una melodía corta                                 |";//opcion 4
        qstarm2opc4[1]="Tres o más notas simultáneas                      |";
        qstarm2opc4[2]="Una serie ordenada de acordes                     |";
        qstarm2opc4[3]="Son siempre llanos                                |";
        qstarm2opc4[4]="Son siempre acordes mayores                       |";
        qstarm2opc4[5]="Cambiar la métrica                                |";
        qstarm2opc4[6]="El tipo de timbre                                 |";
        qstarm2opc4[7]="I–II–I–II                                         |";
        qstarm2opc4[8]="Rítmico                                           |";
        qstarm2opc4[9]="Tercera menor + quinta disminuida                 |";
        int[] respuestasCorrectas = {1, 4, 4, 2, 3, 2, 3, 1, 1, 3};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstarm2opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstarm2opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstarm2opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstarm2opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }
    public static void armonia1() {
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 1                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre: \"Conceptos Básicos\"           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                 Subtema: Definiciones esenciales                   |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia1_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                armonia1();
                break;
        }
    }
    public static void armonia1_1(){
        aciertos=0;
        errores=0;
        qstarm1 = new String[10];
        qstarm1opc1 = new String[10];
        qstarm1opc2 = new String[10];
        qstarm1opc3 = new String[10];
        qstarm1opc4 = new String[10];
        qstarm1[0]= "¿Qué es la armonía musical?                         |";//asignacion para las preguntas
        qstarm1[1]= "¿Qué aspecto genera tensión y resolución en música? |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm1[2]= "¿Cómo se llama la estabilidad en un acorde?         |";
        qstarm1[3]= "¿Qué es una disonancia?                             |";
        qstarm1[4]= "El término \"armonía\" proviene del griego y significa|";
        qstarm1[5]= "¿Cuál es el verbo griego del que deriva “armonía”?  |";
        qstarm1[6]= "La armonía aporta principalmente:                   |";
        qstarm1[7]= "¿Cuál de los siguientes NO es un elemento básico?   |";
        qstarm1[8]= "¿Qué se encarga de medir el paso de los acordes?    |";
        qstarm1[9]= "Los acordes se forman principalmente con:          |";
        qstarm1opc1[0]="La velocidad de una pieza musical                 |";//opcion 1
        qstarm1opc1[1]="El tempo                                          |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm1opc1[2]="Disonancia                                        |";
        qstarm1opc1[3]="Un intervalo inestable                            |";
        qstarm1opc1[4]="Fuerza o energía                                  |";
        qstarm1opc1[5]="Harmaino                                          |";
        qstarm1opc1[6]="Silencio y pausas                                 |";
        qstarm1opc1[7]="Intervalos                                        |";
        qstarm1opc1[8]="Ritmo armónico                                    |";
        qstarm1opc1[9]="Notas simultáneas                                 |";
        qstarm1opc2[0]="Notas simultáneas formando acordes                |";//opcion 2
        qstarm1opc2[1]="La melodía                                        |";
        qstarm1opc2[2]="Tonalidad                                         |";
        qstarm1opc2[3]="Un ritmo lento                                    |";
        qstarm1opc2[4]="Conjunto, acuerdo, concordia                      |";
        qstarm1opc2[5]="Harmozo                                           |";
        qstarm1opc2[6]="Ruido y tensión                                   |";
        qstarm1opc2[7]="Acordes                                           |";
        qstarm1opc2[8]="Melodía                                           |";
        qstarm1opc2[9]="Ritmos repetitivos                                |";
        qstarm1opc3[0]="El timbre de un instrumento                       |";//opcion 3
        qstarm1opc3[1]="La armonía                                        |";
        qstarm1opc3[2]="Consonancia                                       |";
        qstarm1opc3[3]="Una melodía suave                                 |";
        qstarm1opc3[4]="Ruido o caos                                      |";
        qstarm1opc3[5]="Harmoto                                           |";
        qstarm1opc3[6]="Más velocidad                                     |";
        qstarm1opc3[7]="Compás de 4/4                                     |";
        qstarm1opc3[8]="Tempo                                             |";
        qstarm1opc3[9]="Melodías rápidas                                  |";
        qstarm1opc4[0]="La organización de ritmos                         |";//opcion 4
        qstarm1opc4[1]="El compás                                         |";
        qstarm1opc4[2]="Modulación                                        |";
        qstarm1opc4[3]="Un sonido que genera tensión                      |";
        qstarm1opc4[4]="Movimiento o cambio                               |";
        qstarm1opc4[5]="Harmenein                                         |";
        qstarm1opc4[6]="Estructura, color emocional y soporte a la melodía|";
        qstarm1opc4[7]="Tonalidad                                         |";
        qstarm1opc4[8]="Timbre                                            |";
        qstarm1opc4[9]="Escalas mayores únicamente                        |";
        int[] respuestasCorrectas = {2, 3, 3, 4, 2, 2, 4, 3, 1, 1};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              1)  ");
            System.out.println(qstarm1opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              2)  ");
            System.out.println(qstarm1opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              3)  ");
            System.out.println(qstarm1opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |              4)  ");
            System.out.println(qstarm1opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        if (aciertos==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else if(errores==10){
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                    |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }else{
            screen();
            System.out.println("        |                                                                    |");
            System.out.println("        |     Resultados del cuestionario:                                   |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
            System.out.println("        |                                                                    |");
            System.out.println("        |     Errores: " + errores+"                                                     |");
            System.out.println("        |____________________________________________________________________|");
            pausar();
            cuestionarios();
        }
    }//acaba el módulo de teoría musical
    //inicio del modulo de equipo de audio
    public static void equipo(){//menu de equipo de audio
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Instrumentos                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. IEMs                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. DAC                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Accesorios                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        equint();
    }
    public static void equint(){//lector del menu de equipo de audio
        int userequinput = scanner.nextInt();
        switch (userequinput){
            case 1: instrumentos();
                break;
            case 2: IEMs();
                break;
            case 3: DAC();
                break;
            case 4: Accesorios();
                break;
            case 5: proceso1();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                equipo();
                break;
        }
    }

    private static void instrumentos() {//aqui va la lista de instrumentos
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        lista de instruemntos                       |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void IEMs() {//aqui va la lista de IEMs
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           lista de IEMs                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void DAC() {//aqui va la lista de DAC
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            lista de DAC                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void Accesorios() {//aqui va la lista de accesorios
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         lista de accesorios                        |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }//acaba el módulo de equipo de audio
    //inicia el módulo de librerias
    public static void librerias(){//menu genral de las librerias
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija el Genero Musical Deseado                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Rock                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Pop                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Folk                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Indie                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Hip-Hop / Rap                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. R&B                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        lint();}
    public static void lint(){ //lector de librerias
        int userlinput = scanner.nextInt();
        switch(userlinput){
            case 1: librock();
                break;
            case 2: libpop();
                break;
            case 3: libfolk();
                break;
            case 4: libind();
                break;
            case 5: libhip();
                break;
            case 6: librb();
                break;
            case 7: proceso1();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                librerias();
                break;
        }
    }
    public static void menulib(){//menu general de los playlist
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Playlist 1                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Playlist 2                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Playlist 3                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
    }
    public static void librock(){//lector del genero rock
        menulib();
        int rocklibint = scanner.nextInt();
        switch(rocklibint){
            case 1: librocklista1();
                break;
            case 2: librocklista2();
                break;
            case 3: librocklista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                librock();
                break;
        }
    }
    private static void librocklista1() {//aqui va el playlist 1 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 1 rock                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  Smells Like Teen Spirit - Nirvana                 |");
        System.out.println("        |                 Sweet Child O' Mine - Guns N' Roses                |");
        System.out.println("        |                       Back In Black - AC/DC                        |");
        System.out.println("        |                      In The End - Linkin Park                      |");
        System.out.println("        |                    Black Hole Sun - Soundgarden                    |");
        System.out.println("        |                       Everlong - Foo Fighters                      |");
        System.out.println("        |                      Paranoid - Black Sabbath                      |");
        System.out.println("        |                Seven Nation Army - The White Stripes               |");
        System.out.println("        |                         Numb - Linkin Park                         |");
        System.out.println("        |                          Creep - Radiohead                         |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    private static void librocklista2() {//aqui va el playlist 2 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 2 rock                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  Hoy Estoy Raro - Cuarteto de Nos                  |");
        System.out.println("        |                 Another One Bites the Dust - Queen                 |");
        System.out.println("        |                   Chop Suey! - System of a Down                    |");
        System.out.println("        |               Boulevard of Broken Dreams - Green Day               |");
        System.out.println("        |              Under the Bridge - Red Hot Chili Peppers              |");
        System.out.println("        |                       Kashmir - Led Zeppelin                       |");
        System.out.println("        |                   Livin' on a Prayer - Bon Jovi                    |");
        System.out.println("        |                Bohemian Like You - The Dandy Warhols               |");
        System.out.println("        |               Dani California - Red Hot Chili Peppers              |");
        System.out.println("        |                      Iron Man - Black Sabbath                      |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    private static void librocklista3() {//aqui va el playlist 3 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 3 rock                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                Welcome to the Jungle - Guns N' Roses               |");
        System.out.println("        |                          Lithium - Nirvana                         |");
        System.out.println("        |                    The Pretender - Foo Fighters                    |");
        System.out.println("        |                      Enter Sandman - Metallica                     |");
        System.out.println("        |                       My Hero - Foo Fighters                       |");
        System.out.println("        |                    Mr. Brightside - The Killers                    |");
        System.out.println("        |                      Come As You Are - Nirvana                     |");
        System.out.println("        |                       High Hopes - Pink Floyd                      |");
        System.out.println("        |                          Clocks - Coldplay                         |");
        System.out.println("        |                          Time - Pink Floyd                         |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    public static void libpop(){//lector del genero pop
        menulib();
        int poplibint = scanner.nextInt();
        switch(poplibint){
            case 1: libpoplista1();
                break;
            case 2: libpoplista2();
                break;
            case 3: libpoplista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                libpop();
                break;
        }
    }
    private static void libpoplista1() {//aqui va el playlist 1 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 1 pop                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                    Blinding Lights - The Weeknd                    |");
        System.out.println("        |                      Shape of You - Ed Sheeran                     |");
        System.out.println("        |                     Dance Monkey - Tones and I                     |");
        System.out.println("        |                      As It Was - Harry Styles                      |");
        System.out.println("        |                        Levitating - Dua Lipa                       |");
        System.out.println("        |                      Uptown Funk - Bruno Mars                      |");
        System.out.println("        |                       Bad Guy - Billie Eilish                      |");
        System.out.println("        |                        Sorry - Justin Bieber                       |");
        System.out.println("        |                        Firework - Katy Perry                       |");
        System.out.println("        |                          Roar - Katy Perry                         |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    private static void libpoplista2() {//aqui va el playlist 2 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 2 pop                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                   Watermelon Sugar - Harry Styles                  |");
        System.out.println("        |                     Don't Start Now - Dua Lipa                     |");
        System.out.println("        |                       Poker Face - Lady Gaga                       |");
        System.out.println("        |                    Love Yourself - Justin Bieber                   |");
        System.out.println("        |                      Happy - Pharrell Williams                     |");
        System.out.println("        |                    Shake It Off - Taylor Swift                     |");
        System.out.println("        |                           Halo - Beyoncé                           |");
        System.out.println("        |                     Rolling in the Deep - Adele                    |");
        System.out.println("        |                        Blame - Calvin Harris                       |");
        System.out.println("        |                          Chandelier - Sia                          |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    private static void libpoplista3() {//aqui va el playlist 3 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 3 pop                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Thriller - Michael Jackson                     |");
        System.out.println("        |                    Billie Jean - Michael Jackson                   |");
        System.out.println("        |                          Take On Me - A-ha                         |");
        System.out.println("        |                      Girls Like You - Maroon 5                     |");
        System.out.println("        |                I Want It That Way - Backstreet Boys                |");
        System.out.println("        |                          Sugar - Maroon 5                          |");
        System.out.println("        |                        Take a Bow - Rihanna                        |");
        System.out.println("        |                        Perfect - Ed Sheeran                        |");
        System.out.println("        |                Shallow - Lady Gaga & Bradley Cooper                |");
        System.out.println("        |                    Sorry Not Sorry - Demi Lovato                   |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    public static void libfolk(){//lector del genero folk
        menulib();
        int folklibint = scanner.nextInt();
        switch(folklibint){
            case 1: libfolklista1();
                break;
            case 2: libfolklista2();
                break;
            case 3: libfolklista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                libfolk();
                break;
        }
    }
    private static void libfolklista1() {//aqui va el playlist 1 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 1 folk                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                       Ho Hey - The Lumineers                       |");
        System.out.println("        |                 Little Talks - Of Monsters and Men                 |");
        System.out.println("        |              Home - Edward Sharpe & The Magnetic Zeros             |");
        System.out.println("        |                       Skinny Love - Bon Iver                       |");
        System.out.println("        |                       Ophelia - The Lumineers                      |");
        System.out.println("        |                         Riptide - Vance Joy                        |");
        System.out.println("        |                    I Will Wait - Mumford & Sons                    |");
        System.out.println("        |                      The Cave - Mumford & Sons                     |");
        System.out.println("        |              Lost in My Mind - The Head and the Heart              |");
        System.out.println("        |                         Sedona - Houndmouth                        |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    private static void libfolklista2() {//aqui va el playlist 2 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 2 folk                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Cleopatra - The Lumineers                     |");
        System.out.println("        |                 Big Black Car - Gregory Alan Isakov                |");
        System.out.println("        |                         Work Song - Hozier                         |");
        System.out.println("        |                         Holocene - Bon Iver                        |");
        System.out.println("        |                       Bloom - The Paper Kites                      |");
        System.out.println("        |              Rivers and Roads - The Head and the Heart             |");
        System.out.println("        |                      Take Me Home - Us The Duo                     |");
        System.out.println("        |                        From Afar - Vance Joy                       |");
        System.out.println("        |                          Youth - Daughter                          |");
        System.out.println("        |                   Awake My Soul - Mumford & Sons                   |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    private static void libfolklista3() {//aqui va el playlist 3 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           playlist 3 folk                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                         Sedona - Houndmouth                        |");
        System.out.println("        |                     Life in Color - OneRepublic                    |");
        System.out.println("        |                  Meet Me in the Woods - Lord Huron                 |");
        System.out.println("        |                    Love Like Ghosts - Lord Huron                   |");
        System.out.println("        |                  Helplessness Blues - Fleet Foxes                  |");
        System.out.println("        |                        Mykonos - Fleet Foxes                       |");
        System.out.println("        |                    Stubborn Love - The Lumineers                   |");
        System.out.println("        |                         Georgia - Vance Joy                        |");
        System.out.println("        |                  Honeybee - The Head and the Heart                 |");
        System.out.println("        |                  White Winter Hymnal - Fleet Foxes                 |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    public static void libind(){//lector del genero R&B
        menulib();
        int indlibint = scanner.nextInt();
        switch(indlibint){
            case 1: libindlista1();
                break;
            case 2: libindlista2();
                break;
            case 3: libindlista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                libind();
                break;
        }
    }
    private static void libindlista1() {//aqui va el playlist 1 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 1 indie                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                     R U Mine? - Arctic Monkeys                     |");
        System.out.println("        |                        505 - Arctic Monkeys                        |");
        System.out.println("        |                      Somebody Else - The 1975                      |");
        System.out.println("        |                      Space Song - Beach House                      |");
        System.out.println("        |                 Sweater Weather - The Neighbourhood                |");
        System.out.println("        |                  Do I Wanna Know? - Arctic Monkeys                 |");
        System.out.println("        |                   Destroyer - Of Monsters and Men                  |");
        System.out.println("        |                 Season 2 Episode 3 - Glass Animals                 |");
        System.out.println("        |                     Heat Waves - Glass Animals                     |");
        System.out.println("        |                             Kids - MGMT                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    private static void libindlista2() {//aqui va el playlist 2 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 2 indie                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Electric Feel - MGMT                        |");
        System.out.println("        |                          Oblivion - Grimes                         |");
        System.out.println("        |                Mountain Sound - Of Monsters and Men                |");
        System.out.println("        |                      West Coast - Lana Del Rey                     |");
        System.out.println("        |             Why'd You Only Call Me...? - Arctic Monkeys            |");
        System.out.println("        |                      Two Weeks - Grizzly Bear                      |");
        System.out.println("        |                         Holocene - Bon Iver                        |");
        System.out.println("        |                           Colors - Halsey                          |");
        System.out.println("        |                         Love Me - The 1975                         |");
        System.out.println("        |                   Reflections - The Neighbourhood                  |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    private static void libindlista3() {//aqui va el playlist 3 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 3 indie                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                Somebody That I Used to Know - Gotye                |");
        System.out.println("        |                    Cough Syrup - Young the Giant                   |");
        System.out.println("        |                       Little Dark Age - MGMT                       |");
        System.out.println("        |             Dog Days Are Over - Florence + The Machine             |");
        System.out.println("        |                            Run - Hozier                            |");
        System.out.println("        |                            Ribs - Lorde                            |");
        System.out.println("        |                          Yellow - Coldplay                         |");
        System.out.println("        |                         Midnight City - M83                        |");
        System.out.println("        |                      Your Love - The Outfield                      |");
        System.out.println("        |                       Dreams - Fleetwood Mac                       |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    public static void libhip(){//lector del genero R&B
        menulib();
        int hiplibint = scanner.nextInt();
        switch(hiplibint){
            case 1: libhiplista1();
                break;
            case 2: libhiplista2();
                break;
            case 3: libhiplista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                libhip();
                break;
        }
    }
    private static void libhiplista1() {//aqui va el playlist 1 de hip-hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 1 hip-hop                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Sicko Mode - Travis Scott                     |");
        System.out.println("        |                      HUMBLE. - Kendrick Lamar                      |");
        System.out.println("        |                         God’s Plan - Drake                         |");
        System.out.println("        |                       Lose Yourself - Eminem                       |");
        System.out.println("        |                        DNA. - Kendrick Lamar                       |");
        System.out.println("        |                      Goosebumps - Travis Scott                     |");
        System.out.println("        |                        Still D.R.E - Dr. Dre                       |");
        System.out.println("        |                    The Real Slim Shady - Eminem                    |");
        System.out.println("        |                    Yes Indeed - Drake & Lil Baby                   |");
        System.out.println("        |                          Mask Off - Future                         |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    private static void libhiplista2() {//aqui va el playlist 2 de hip-hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 2 hip-hop                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                       Love Sosa - Chief Keef                       |");
        System.out.println("        |                       Antidote - Travis Scott                      |");
        System.out.println("        |                      No Role Modelz - J. Cole                      |");
        System.out.println("        |                        Mockingbird - Eminem                        |");
        System.out.println("        |                            Stan - Eminem                           |");
        System.out.println("        |                     Laugh Now Cry Later - Drake                    |");
        System.out.println("        |                 Can't Tell Me Nothing - Kanye West                 |");
        System.out.println("        |                         POWER - Kanye West                         |");
        System.out.println("        |                   All of the Lights - Kanye West                   |");
        System.out.println("        |                      N.Y. State of Mind - Nas                      |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    private static void libhiplista3() {//aqui va el playlist 3 de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        playlist 3 hip-hop                          |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                    Empire State of Mind - Jay-Z                    |");
        System.out.println("        |                        Run This Town - Jay-Z                       |");
        System.out.println("        |                   Pursuit of Happiness - Kid Cudi                  |");
        System.out.println("        |                       Day 'n' Nite - Kid Cudi                      |");
        System.out.println("        |                       3005 - Childish Gambino                      |");
        System.out.println("        |                     Redbone - Childish Gambino                     |");
        System.out.println("        |                    Money Trees - Kendrick Lamar                    |");
        System.out.println("        |                      ELEMENT. - Kendrick Lamar                     |");
        System.out.println("        |                        Hotline Bling - Drake                       |");
        System.out.println("        |                       Sunflower - Post Malone                      |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    public static void librb(){//lector del genero R&B
        menulib();
        int rblibint = scanner.nextInt();
        switch(rblibint){
            case 1: librblista1();
                break;
            case 2: librblista2();
                break;
            case 3: librblista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("La opción es inválida, seleccione una opción válida");
                pausar();
                librb();
                break;
        }
    }
    private static void librblista1() {//aqui va el playlist 1 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            playlist 1 rb                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                       Earned It - The Weeknd                       |");
        System.out.println("        |                       The Hills - The Weeknd                       |");
        System.out.println("        |                          Location - Khalid                         |");
        System.out.println("        |                     Redbone - Childish Gambino                     |");
        System.out.println("        |                    Blinding Lights - The Weeknd                    |");
        System.out.println("        |                       All of Me - John Legend                      |");
        System.out.println("        |                         Nikes - Frank Ocean                        |");
        System.out.println("        |                   Thinkin Bout You - Frank Ocean                   |");
        System.out.println("        |                    I Feel It Coming - The Weeknd                   |");
        System.out.println("        |                    Call Out My Name - The Weeknd                   |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    private static void librblista2() {//aqui va el playlist 2 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            playlist 2 rb                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            Talk - Khalid                           |");
        System.out.println("        |                           Crew - GoldLink                          |");
        System.out.println("        |                   Come and See Me - PARTYNEXTDOOR                  |");
        System.out.println("        |                      Exchange - Bryson Tiller                      |");
        System.out.println("        |                        Don't - Bryson Tiller                       |");
        System.out.println("        |                       Get You - Daniel Caesar                      |");
        System.out.println("        |                      Best Part - Daniel Caesar                     |");
        System.out.println("        |                            Adorn - Miguel                          |");
        System.out.println("        |                         Sky Walker - Miguel                        |");
        System.out.println("        |                         Roses - Chris Brown                        |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    private static void librblista3() {//aqui va el playlist 3 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            playlist 3 rb                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Love - Kendrick Lamar                       |");
        System.out.println("        |                      Loyalty - Kendrick Lamar                      |");
        System.out.println("        |                          The Weekend - SZA                         |");
        System.out.println("        |                         20 Something - SZA                         |");
        System.out.println("        |                            Snooze - SZA                            |");
        System.out.println("        |                     Pink + White - Frank Ocean                     |");
        System.out.println("        |                       Novacane - Frank Ocean                       |");
        System.out.println("        |                      Die For You - The Weeknd                      |");
        System.out.println("        |                        Starboy - The Weeknd                        |");
        System.out.println("        |                         Lost - Frank Ocean                         |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    public static void screen(){//68 espacios
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("         ____________________________________________________________________");
        System.out.println("        |                                                                    |");
        System.out.println("        |          _____       _   _____       _   _                         |");
        System.out.println("        |         |  __ \\     | | |  __ \\     | | | |                        |");
        System.out.println("        |         | |  | |    | | | |__) |   _| |_| |__   ___  _ __          |");
        System.out.println("        |         | |  | |_   | | |  ___/ | | | __| '_ \\ / _ \\| '_ \\         |");
        System.out.println("        |         | |__| | |__| | | |   | |_| | |_| | | | (_) | | | |        |");
        System.out.println("        |         |_____/ \\____/  |_|    \\__, |\\__|_| |_|\\___/|_| |_|        |");
        System.out.println("        |                                 __/ |                              |");
        System.out.println("        |                                |___/                               |");
        System.out.println("        |____________________________________________________________________|");
    }
}

