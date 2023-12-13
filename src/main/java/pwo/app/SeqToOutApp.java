/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa aplikacji generującej i wypisującej ciąg liczbowy na ekran konsoli.
 * Obsługuje argumenty przekazane z linii poleceń. Rozszerza klasę
 * {@link SeqToFileApp}.
 *
 * @author wojciech
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Sprawdza poprawność argumentów.
     *
     * @param args Argumenty przekazane z linii poleceń.
     * @return true, jeśli argumenty są poprawne; w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }
        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Wyświetla ciąg liczbowy na ekranie konsoli.
     *
     * @return true, jeśli operacja zapisu jest udana; w przeciwnym razie false.
     */
    @Override
    protected boolean writeSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Uruchamia aplikację.
     *
     * @param args Argumenty przekazane z linii poleceń.
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");
        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }
        writeSeq();
    }
}
