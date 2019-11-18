package net.yayawatanabe;

import ij.IJ;

public class Launcher {
    public static void main(String[] args) {
        new ij.ImageJ();
        IJ.runPlugIn("net.yayawatanabe.Open_Image", "");
    }
}
