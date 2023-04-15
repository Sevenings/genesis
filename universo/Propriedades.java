package universo;

import java.util.*;
import java.lang.reflect.Field;

public final class Propriedades {
    public static final String INFLAMAVEL = "inflamavel";
    public static final String QUEBRAVEL = "quebravel";
    public static final String AFIADO = "afiado";
    public static final String ESCORREGADIO = "escorregadio";

    public static List<String> lista() {
        Class<?> classePropriedades = Propriedades.class;
        Field[] camposPropriedades = classePropriedades.getDeclaredFields();
        List<String> listaPropriedades = new ArrayList<String>();
        for (Field campo : camposPropriedades) {
            try {
                listaPropriedades.add((String) campo.get(new Propriedades()));
            } catch (IllegalAccessException iae) {

            }
        }
        return listaPropriedades;
    }
}
