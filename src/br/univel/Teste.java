package br.univel;

import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;

public class Teste {
    int cont;

    public Teste(Object obj) {

        Class<?> cl = obj.getClass();

        StringBuilder sb = new StringBuilder();
        sb.append("INSERTO INTO ");
        sb.append(cl.getSimpleName()).append(" (");


        for (Field field : cl.getDeclaredFields()) {
//            System.out.println(field.getType() + " " + field.getName());
            cont++;
            if (cl.getDeclaredFields().length == cont) {
                sb.append(field.getName()).append("");
            } else {
                sb.append(field.getName()).append(", ");
            }
        }

        sb.append(") VALUES (");

        for (int i = 0; i < cont; i++) {
            if (i == cont - 1) {
                sb.append("?) ");
            } else {
                sb.append("?, ");
            }
        }

        String sql = sb.toString();

        System.out.println(sql);


//        for (Method m : cl.getDeclaredMethods()) {
//            if (m.getName().startsWith("get")) {
//                try {
//                    Object retorno = null;
//                    retorno = m.invoke(obj, null);
//                    System.out.println(retorno);
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setId(1);
        p.setName("Eratóstenes");

        new Teste(p);
    }
}
