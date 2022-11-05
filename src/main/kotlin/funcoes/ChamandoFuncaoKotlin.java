package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> nomes = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(nomes));
    }
}
