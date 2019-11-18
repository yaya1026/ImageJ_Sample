package net.yayawatanabe;

import ij.IJ;
import ij.plugin.PlugIn;

public class Open_Image implements PlugIn {
    @Override
    public void run(String s) {
        String imgPath = "好きなパスセットして";
        IJ.open(imgPath);
    }
}
