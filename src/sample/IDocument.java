package sample;

import java.awt.*;
import java.io.*;

public class IDocument extends Controller implements ICreateDocument{
    private int x;

    IDocument() {
    }
    public String getType() {
        switch (x) {
            case 1:return "TextDocument";
            case 2:return "ImageDocument";
            case 3:return "MusicDocument";
            default:
                return null;
        }
    }
    IDocument(int x) {
        this.x = x;
    }

    @Override
    public IDocument CreateNew() {
        switch (x) {
            case 1:
            {System.out.println("Создан TextDocument");return new TextDocument();}

            case 2:
            {System.out.println("Создан ImageDocument");return new ImageDocument();}
            case 3:
            {System.out.println("Создан MusicDocument");return new MusicDocument();}
            default:
                return null;
        }
    }

    @Override
    public IDocument CreateOpen() {
        switch (x) {
            case 1:
            {System.out.println("Открыт TextDocument"); return new TextDocument();}
            case 2:
            {System.out.println("Открыт ImageDocument");return new ImageDocument();}
            case 3:
            {System.out.println("Открыт MusicDocument");return new MusicDocument();}
            default:
                return null;
        }
    }
}
